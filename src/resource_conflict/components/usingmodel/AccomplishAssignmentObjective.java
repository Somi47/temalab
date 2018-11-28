package resource_conflict.components.usingmodel;

import java.util.Comparator;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.IObjective;

import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.Component;
import resource_conflict.components.model.Task;

public class AccomplishAssignmentObjective implements IObjective{

	public static double CalculateFitness(AllocationProblem ap) {
		int countUnAssigned = 0;		
		for(Component c : ap.getComponents()) {
			for(Task t : c.getTasks()) {
				if(t.getAssignment() == null)
					++countUnAssigned;
			}
		}
		
		return countUnAssigned;
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
		return Comparators.LOWER_IS_BETTER;
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
		return new AccomplishAssignmentObjective();
	}

	@Override
	public boolean isHardObjective() {
		return true;
	}

	@Override
	public boolean satisifiesHardObjective(Double fitness) {
		return fitness < 1;
	}

	@Override
	public void setLevel(int level) {
	}

	@Override
	public int getLevel() {
		return 1;
	}

}
