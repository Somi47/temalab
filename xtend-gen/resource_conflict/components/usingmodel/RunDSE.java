package resource_conflict.components.usingmodel;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.strategy.impl.RandomSearchStrategy;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.ModelFactory;
import resource_conflict.components.model.ModelPackage;
import resource_conflict.components.model.Person;
import resource_conflict.components.model.Task;
import resource_conflict.components.model.queries.CanAssign;
import resource_conflict.components.usingmodel.AccomplishAssignmentObjective;
import resource_conflict.components.usingmodel.FitnessObjective;

@SuppressWarnings("all")
public class RunDSE {
  public static void main(final String[] args) {
    RunDSE.init();
    final AllocationProblem unfinishedModel = RunDSE.loadModel("example.xmi");
    final DesignSpaceExplorer dse = new DesignSpaceExplorer();
    dse.setInitialModel(unfinishedModel);
    AccomplishAssignmentObjective _accomplishAssignmentObjective = new AccomplishAssignmentObjective();
    dse.addObjective(_accomplishAssignmentObjective);
    FitnessObjective _fitnessObjective = new FitnessObjective();
    dse.addObjective(_fitnessObjective);
    SimpleStateCoderFactory _simpleStateCoderFactory = new SimpleStateCoderFactory(Collections.<EPackage>unmodifiableList(CollectionLiterals.<EPackage>newArrayList(ModelPackage.eINSTANCE)));
    dse.setStateCoderFactory(_simpleStateCoderFactory);
    final BatchTransformationRuleFactory ruleFactory = new BatchTransformationRuleFactory();
    @Extension
    final ModelFactory modelFactory = ModelFactory.eINSTANCE;
    final Consumer<CanAssign.Match> _function = (CanAssign.Match match) -> {
      final Person person = match.getP();
      final Task task = match.getT();
      int last = 0;
      EList<Assignment> _assignment = person.getAssignment();
      for (final Assignment a : _assignment) {
        int _to = a.getTo();
        boolean _lessThan = (last < _to);
        if (_lessThan) {
          last = a.getTo();
        }
      }
      final Assignment a_1 = modelFactory.createAssignment();
      a_1.setFrom(last);
      int _estimate = task.getEstimate();
      int _plus = (last + _estimate);
      a_1.setTo(_plus);
      a_1.setPerson(person);
      task.setAssignment(a_1);
      StringConcatenation _builder = new StringConcatenation();
      String _name = task.getName();
      _builder.append(_name);
      _builder.append(" -[");
      int _from = a_1.getFrom();
      _builder.append(_from);
      _builder.append("..");
      int _to_1 = a_1.getTo();
      _builder.append(_to_1);
      _builder.append("]-> ");
      String _name_1 = person.getName();
      _builder.append(_name_1);
      InputOutput.<String>println(_builder.toString());
    };
    final BatchTransformationRule<CanAssign.Match, CanAssign.Matcher> rule = ruleFactory.<CanAssign.Match, CanAssign.Matcher>createRule().name("Allocate").precondition(CanAssign.instance()).action(_function).build();
    dse.addTransformationRule(rule);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dse started");
    InputOutput.<String>println(_builder.toString());
    RandomSearchStrategy _randomSearchStrategy = new RandomSearchStrategy(2, 100, 1000);
    dse.startExploration(_randomSearchStrategy);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("dse finished");
    InputOutput.<String>println(_builder_1.toString());
    final Consumer<Solution> _function_1 = (Solution it) -> {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("->  ");
      Object _stateCode = it.getStateCode();
      _builder_2.append(_stateCode);
      InputOutput.<String>println(_builder_2.toString());
    };
    dse.getSolutions().forEach(_function_1);
    final ViatraQueryEngineOptions o = ViatraQueryEngineOptions.defineOptions().withDefaultBackend(ReteBackendFactory.INSTANCE).build();
    EMFScope _eMFScope = new EMFScope(unfinishedModel);
    final ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(_eMFScope, o);
    final CanAssign.Matcher matcher = CanAssign.Matcher.on(engine);
    final Collection<CanAssign.Match> matches = matcher.getAllMatches();
    final Consumer<CanAssign.Match> _function_2 = (CanAssign.Match it) -> {
      InputOutput.<CanAssign.Match>println(it);
    };
    matches.forEach(_function_2);
  }
  
  public static AllocationProblem loadModel(final String path) {
    final ResourceSetImpl rs = new ResourceSetImpl();
    final Resource r = rs.getResource(URI.createFileURI(path), true);
    EObject _get = r.getContents().get(0);
    final AllocationProblem res = ((AllocationProblem) _get);
    return res;
  }
  
  protected static Object init() {
    Class<? extends Class> _xblockexpression = null;
    {
      ModelPackage.eINSTANCE.eClass();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      _xblockexpression = ReteEngine.class.getClass();
    }
    return _xblockexpression;
  }
}
