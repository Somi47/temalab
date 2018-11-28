package resource_conflict.components.usingmodel;

import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.Component;
import resource_conflict.components.model.Task;

public class FitnessCalculator {
	public static double CalculateUnFitness(AllocationProblem ap) {
		int timeEnd = 0;
		int timeTotal = 0;
		for(Component c : ap.getComponents()) {
			for(Task t : c.getTasks()) {
				timeTotal += t.getEstimate();
				
				Assignment a = t.getAssignment();
				if(a == null)
					continue;
				
				if(timeEnd < a.getTo())
					timeEnd = a.getTo();
			}
		}
		
		if(timeTotal == 0)
			return 0;
		
		return (double)timeEnd / timeTotal;
	}
	
	public static double CalculateFitness(AllocationProblem ap) {
		return 1 - CalculateUnFitness(ap);
	}
}
