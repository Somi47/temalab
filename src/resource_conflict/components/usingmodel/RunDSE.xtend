package resource_conflict.components.usingmodel

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import resource_conflict.components.model.AllocationProblem
import resource_conflict.components.model.ModelPackage
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import resource_conflict.components.model.queries.CanAssign
import resource_conflict.components.model.ModelFactory
import org.eclipse.viatra.dse.api.strategy.impl.RandomSearchStrategy
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactoryProvider

class RunDSE {
	def static void main(String[] args) {
		init()
		val unfinishedModel = loadModel("example.xmi")
		
		val DesignSpaceExplorer dse = new DesignSpaceExplorer
		dse.initialModel = unfinishedModel
		dse.addObjective(new AccomplishAssignmentObjective)
		dse.addObjective(new FitnessObjective)
		
		dse.stateCoderFactory = new SimpleStateCoderFactory(#[ModelPackage.eINSTANCE]);
		
		val ruleFactory = new BatchTransformationRuleFactory
		val extension ModelFactory modelFactory = ModelFactory.eINSTANCE;
		val rule = ruleFactory.createRule.name("Allocate").precondition(CanAssign.instance).action[match |
			val person = match.p
			val task = match.t
			
			var last = 0
			for(a : person.assignment){
				if(last < a.to){
					last = a.to
				}
			}
			
			val a = createAssignment()
			a.from = last
			a.to = last + task.estimate
			a.person = person
			task.assignment = a;
			println('''«task.name» -[«a.from»..«a.to»]-> «person.name»''')
		].build()
		
		dse.addTransformationRule(rule)
		println('''dse started''')
		dse.startExploration(new RandomSearchStrategy(2,100,1000))
		println('''dse finished''')
		dse.solutions.forEach[println('''->  «it.stateCode»''')]
		
		val o = ViatraQueryEngineOptions.defineOptions.withDefaultBackend(ReteBackendFactory.INSTANCE).build
		val engine = AdvancedViatraQueryEngine.on(new EMFScope(unfinishedModel),o);
		val matcher = CanAssign.Matcher.on(engine);
		val matches = matcher.getAllMatches();
		matches.forEach[println(it)]
		
		/* 
		val matcher = CanAssign.instance.getMatcher(ViatraQueryEngine.on(new EMFScope(unfinishedModel)))
		println("matches = " + matcher.countMatches)
		matcher.allMatches.forEach[println(it)]
		*/
	}
	
	def static loadModel(String path) {
    	val rs = new ResourceSetImpl()
    	val r = rs.getResource(URI.createFileURI(path),true)
    	val res = r.getContents().get(0) as AllocationProblem
    	return res
	}
	
	protected def static Object init() {
		ModelPackage.eINSTANCE.eClass()
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		ReteEngine.getClass
	}
}