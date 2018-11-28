/**
 * Generated from platform:/resource/resource_conflict.components.model/queries/resource_conflict/components/model/queries/queries.vql
 */
package resource_conflict.components.model.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
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

/**
 * A pattern group formed of all public patterns defined in queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package resource_conflict.components.model.queries, the group contains the definition of the following patterns: <ul>
 * <li>differentTaskLength</li>
 * <li>intersectingAllocation</li>
 * <li>qualifications</li>
 * <li>unqualifiedAllocation</li>
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
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() {
    querySpecifications.add(DifferentTaskLength.instance());
    querySpecifications.add(IntersectingAllocation.instance());
    querySpecifications.add(Qualifications.instance());
    querySpecifications.add(UnqualifiedAllocation.instance());
    querySpecifications.add(CanAssign.instance());
    querySpecifications.add(PatternAssignmentFromNegative.instance());
    querySpecifications.add(PatternAssignmentNegativeLength.instance());
    querySpecifications.add(PersonWithNoName.instance());
    querySpecifications.add(QualificationWithNoName.instance());
    querySpecifications.add(ComponentWithNoName.instance());
    querySpecifications.add(TaskWithNoName.instance());
  }
  
  public DifferentTaskLength getDifferentTaskLength() {
    return DifferentTaskLength.instance();
  }
  
  public DifferentTaskLength.Matcher getDifferentTaskLength(final ViatraQueryEngine engine) {
    return DifferentTaskLength.Matcher.on(engine);
  }
  
  public IntersectingAllocation getIntersectingAllocation() {
    return IntersectingAllocation.instance();
  }
  
  public IntersectingAllocation.Matcher getIntersectingAllocation(final ViatraQueryEngine engine) {
    return IntersectingAllocation.Matcher.on(engine);
  }
  
  public Qualifications getQualifications() {
    return Qualifications.instance();
  }
  
  public Qualifications.Matcher getQualifications(final ViatraQueryEngine engine) {
    return Qualifications.Matcher.on(engine);
  }
  
  public UnqualifiedAllocation getUnqualifiedAllocation() {
    return UnqualifiedAllocation.instance();
  }
  
  public UnqualifiedAllocation.Matcher getUnqualifiedAllocation(final ViatraQueryEngine engine) {
    return UnqualifiedAllocation.Matcher.on(engine);
  }
  
  public CanAssign getCanAssign() {
    return CanAssign.instance();
  }
  
  public CanAssign.Matcher getCanAssign(final ViatraQueryEngine engine) {
    return CanAssign.Matcher.on(engine);
  }
  
  public PatternAssignmentFromNegative getPatternAssignmentFromNegative() {
    return PatternAssignmentFromNegative.instance();
  }
  
  public PatternAssignmentFromNegative.Matcher getPatternAssignmentFromNegative(final ViatraQueryEngine engine) {
    return PatternAssignmentFromNegative.Matcher.on(engine);
  }
  
  public PatternAssignmentNegativeLength getPatternAssignmentNegativeLength() {
    return PatternAssignmentNegativeLength.instance();
  }
  
  public PatternAssignmentNegativeLength.Matcher getPatternAssignmentNegativeLength(final ViatraQueryEngine engine) {
    return PatternAssignmentNegativeLength.Matcher.on(engine);
  }
  
  public PersonWithNoName getPersonWithNoName() {
    return PersonWithNoName.instance();
  }
  
  public PersonWithNoName.Matcher getPersonWithNoName(final ViatraQueryEngine engine) {
    return PersonWithNoName.Matcher.on(engine);
  }
  
  public QualificationWithNoName getQualificationWithNoName() {
    return QualificationWithNoName.instance();
  }
  
  public QualificationWithNoName.Matcher getQualificationWithNoName(final ViatraQueryEngine engine) {
    return QualificationWithNoName.Matcher.on(engine);
  }
  
  public ComponentWithNoName getComponentWithNoName() {
    return ComponentWithNoName.instance();
  }
  
  public ComponentWithNoName.Matcher getComponentWithNoName(final ViatraQueryEngine engine) {
    return ComponentWithNoName.Matcher.on(engine);
  }
  
  public TaskWithNoName getTaskWithNoName() {
    return TaskWithNoName.instance();
  }
  
  public TaskWithNoName.Matcher getTaskWithNoName(final ViatraQueryEngine engine) {
    return TaskWithNoName.Matcher.on(engine);
  }
}
