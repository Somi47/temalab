package resource_conflict.components.usingmodel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.ModelPackage;
import resource_conflict.components.model.Person;

public class LoadModel {
	public static void main(String[] args) {
		ModelPackage.eINSTANCE.eClass();
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
    	
    	ResourceSet rs = new ResourceSetImpl();
    	Resource r = rs.getResource(URI.createFileURI("example.xmi"),true);
    	AllocationProblem x = (AllocationProblem) r.getContents().get(0);
    	System.out.println(x);
    	for (Person p : x.getPersons()) {
    		System.out.println(p.getName());
		}
	}
}
