/**
 * Generated from platform:/resource/resource_conflict.components.model/queries/resource_conflict/components/model/queries/queries.vql
 */
package resource_conflict.components.model.queries.internal;

import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import resource_conflict.components.model.queries.CanAssign;
import resource_conflict.components.model.queries.ComponentWithNoName;
import resource_conflict.components.model.queries.DifferentTaskLength;
import resource_conflict.components.model.queries.IntersectingAllocation;
import resource_conflict.components.model.queries.PatternAssignmentFromNegative;
import resource_conflict.components.model.queries.PatternAssignmentNegativeLength;
import resource_conflict.components.model.queries.PersonWithNoName;
import resource_conflict.components.model.queries.QualificationWithNoName;
import resource_conflict.components.model.queries.Qualifications;
import resource_conflict.components.model.queries.TaskWithNoName;
import resource_conflict.components.model.queries.UnqualifiedAllocation;
import resource_conflict.components.model.queries.internal.TaskAssigned;

/**
 * A pattern group formed of all patterns defined in queries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package resource_conflict.components.model.queries, the group contains the definition of the following patterns: <ul>
 * <li>differentTaskLength</li>
 * <li>intersectingAllocation</li>
 * <li>qualifications</li>
 * <li>unqualifiedAllocation</li>
 * <li>taskAssigned</li>
 * <li>canAssign</li>
 * <li>patternAssignmentFromNegative</li>
 * <li>patternAssignmentNegativeLength</li>
 * <li>personWithNoName</li>
 * <li>qualificationWithNoName</li>
 * <li>componentWithNoName</li>
 * <li>taskWithNoName</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class QueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static QueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new QueriesAll();
    }
    return INSTANCE;
  }
  
  private static QueriesAll INSTANCE;
  
  private QueriesAll() {
    querySpecifications.add(DifferentTaskLength.instance());
    querySpecifications.add(IntersectingAllocation.instance());
    querySpecifications.add(Qualifications.instance());
    querySpecifications.add(UnqualifiedAllocation.instance());
    querySpecifications.add(TaskAssigned.instance());
    querySpecifications.add(CanAssign.instance());
    querySpecifications.add(PatternAssignmentFromNegative.instance());
    querySpecifications.add(PatternAssignmentNegativeLength.instance());
    querySpecifications.add(PersonWithNoName.instance());
    querySpecifications.add(QualificationWithNoName.instance());
    querySpecifications.add(ComponentWithNoName.instance());
    querySpecifications.add(TaskWithNoName.instance());
  }
}
