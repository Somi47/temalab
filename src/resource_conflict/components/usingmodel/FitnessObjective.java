package resource_conflict.components.usingmodel;

import java.util.Comparator;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.IObjective;

import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.Component;
import resource_conflict.components.model.Task;

public class FitnessObjective implements IObjective {
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

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Comparator<Double> getComparator() {
		return Comparators.HIGHER_IS_BETTER;
	}

	@Override
	public Double getFitness(ThreadContext context) {
		return CalculateFitness((AllocationProblem)context.getModel());
	}

	@Override
	public void init(ThreadContext context) {
	}

	@Override
	public IObjective createNew() {
		return new FitnessObjective();
	}

	@Override
	public boolean isHardObjective() {
		return false;
	}

	@Override
	public boolean satisifiesHardObjective(Double fitness) {
		return true;
	}

	@Override
	public void setLevel(int level) {		
	}

	@Override
	public int getLevel() {
		return 1;
	}
}
