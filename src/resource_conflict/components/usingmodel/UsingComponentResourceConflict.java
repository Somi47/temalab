package resource_conflict.components.usingmodel;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.Component;
import resource_conflict.components.model.ModelFactory;
import resource_conflict.components.model.ModelPackage;
import resource_conflict.components.model.Person;
import resource_conflict.components.model.Qualification;
import resource_conflict.components.model.Task;

public class UsingComponentResourceConflict {
	public static void main(String[] args) {
    	ModelPackage.eINSTANCE.eClass();
    	ModelFactory factory = ModelFactory.eINSTANCE;
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
    	
    	// OBJECTS:
    	Person personBela = factory.createPerson();
    	Person personGeza = factory.createPerson();
    	Qualification qualificationDesigner = factory.createQualification();
    	Qualification qualificationDeveloper = factory.createQualification();
    	Qualification qualificationTester = factory.createQualification();
    	Component componentSearchEngine = factory.createComponent();
    	Component componentFrontendGui = factory.createComponent();
    	Task taskDesignSearchEngine = factory.createTask();
    	Task taskDesignFrontendGui = factory.createTask();
    	Task taskPrototypeFrontendGui = factory.createTask();
    	Task taskTestFrontendGui = factory.createTask();
    	
    	// MEMBERS:
    	personBela.setName("Bela");
    	personGeza.setName("Geza");
    	qualificationDesigner.setName("Designer");
    	qualificationDeveloper.setName("Developer");
    	qualificationTester.setName("Tester");
    	componentSearchEngine.setName("Search engine");
    	componentFrontendGui.setName("Frontend gui");
    	taskDesignSearchEngine.setName("Desing search engine");
    	taskDesignSearchEngine.setEstimate(2);
    	taskDesignFrontendGui.setName("Desing frontend gui");
    	taskDesignFrontendGui.setEstimate(4);
    	taskPrototypeFrontendGui.setName("Prototype frontend gui");
    	taskPrototypeFrontendGui.setEstimate(7);
    	taskTestFrontendGui.setName("Test frontend gui");
    	taskTestFrontendGui.setEstimate(3);
    	
    	// RELATIONS:
    	personBela.getQualifications().add(qualificationDesigner);
    	personBela.getQualifications().add(qualificationDeveloper);
    	
    	personGeza.getQualifications().add(qualificationDeveloper);
    	personGeza.getQualifications().add(qualificationTester);
    	
    	componentSearchEngine.getTasks().add(taskDesignSearchEngine);
    	
    	componentFrontendGui.getTasks().add(taskDesignFrontendGui);
    	componentFrontendGui.getTasks().add(taskPrototypeFrontendGui);
    	componentFrontendGui.getTasks().add(taskTestFrontendGui);
    	
    	taskDesignSearchEngine.getQualificationsRequired().add(qualificationDesigner);
    	
    	taskDesignFrontendGui.getQualificationsRequired().add(qualificationDesigner);
    	
    	taskPrototypeFrontendGui.getQualificationsRequired().add(qualificationDeveloper);
    	taskPrototypeFrontendGui.getRequirementsToStart().add(taskDesignFrontendGui);
    	
    	taskTestFrontendGui.getQualificationsRequired().add(qualificationTester);
    	taskTestFrontendGui.getRequirementsToStart().add(taskPrototypeFrontendGui);
    	
    	AllocationProblem ap = factory.createAllocationProblem();
    	ap.getComponents().add(componentFrontendGui);
    	ap.getComponents().add(componentSearchEngine);
    	
    	ap.getPersons().add(personGeza);
    	ap.getPersons().add(personBela);
    	
    	ap.getQualificationTypes().add(qualificationDesigner);
    	ap.getQualificationTypes().add(qualificationDeveloper);
    	ap.getQualificationTypes().add(qualificationTester);
    	
    	// TESTING FITNESS
    	Assignment a1 = factory.createAssignment();
    	a1.setTo(10);
    	taskDesignSearchEngine.setAssignment(a1);
    	
    	double fitness = FitnessCalculator.CalculateFitness(ap);
    	System.out.println(fitness);
    	
    	/*
    	ResourceSet rs = new ResourceSetImpl();
    	Resource r = rs.createResource(URI.createFileURI("example.xmi"));
    	r.getContents().add(ap);
    	
    	try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
