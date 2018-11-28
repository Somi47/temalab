/**
 * Generated from platform:/resource/resource_conflict.components.model/queries/resource_conflict/components/model/queries/queries.vql
 */
package resource_conflict.components.model.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import resource_conflict.components.model.Task;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(severity = "warning", message = "Task with no name", key = {t})
 *         pattern taskWithNoName(t : Task) {
 *             Task.Name(t,"");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TaskWithNoName extends BaseGeneratedEMFQuerySpecification<TaskWithNoName.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.taskWithNoName pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Task fT;
    
    private static List<String> parameterNames = makeImmutableList("t");
    
    private Match(final Task pT) {
      this.fT = pT;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("t".equals(parameterName)) return this.fT;
      return null;
    }
    
    public Task getT() {
      return this.fT;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("t".equals(parameterName) ) {
          this.fT = (Task) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final Task pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.taskWithNoName";
    }
    
    @Override
    public List<String> parameterNames() {
      return TaskWithNoName.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT};
    }
    
    @Override
    public TaskWithNoName.Match toImmutable() {
      return isMutable() ? newMatch(fT) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t\"=" + prettyPrintValue(fT));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TaskWithNoName.Match)) {
          TaskWithNoName.Match other = (TaskWithNoName.Match) obj;
          return Objects.equals(fT, other.fT);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public TaskWithNoName specification() {
      return TaskWithNoName.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TaskWithNoName.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TaskWithNoName.Match newMutableMatch(final Task pT) {
      return new Mutable(pT);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TaskWithNoName.Match newMatch(final Task pT) {
      return new Immutable(pT);
    }
    
    private static final class Mutable extends TaskWithNoName.Match {
      Mutable(final Task pT) {
        super(pT);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TaskWithNoName.Match {
      Immutable(final Task pT) {
        super(pT);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.taskWithNoName pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "warning", message = "Task with no name", key = {t})
   * pattern taskWithNoName(t : Task) {
   *     Task.Name(t,"");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TaskWithNoName
   * 
   */
  public static class Matcher extends BaseMatcher<TaskWithNoName.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TaskWithNoName.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static TaskWithNoName.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_T = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TaskWithNoName.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TaskWithNoName.Match> getAllMatches(final Task pT) {
      return rawStreamAllMatches(new Object[]{pT}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TaskWithNoName.Match> streamAllMatches(final Task pT) {
      return rawStreamAllMatches(new Object[]{pT});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TaskWithNoName.Match> getOneArbitraryMatch(final Task pT) {
      return rawGetOneArbitraryMatch(new Object[]{pT});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Task pT) {
      return rawHasMatch(new Object[]{pT});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Task pT) {
      return rawCountMatches(new Object[]{pT});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Task pT, final Consumer<? super TaskWithNoName.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TaskWithNoName.Match newMatch(final Task pT) {
      return TaskWithNoName.Match.newMatch(pT);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Task> rawStreamAllValuesOft(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Task.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Task> getAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Task> streamAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray());
    }
    
    @Override
    protected TaskWithNoName.Match tupleToMatch(final Tuple t) {
      try {
          return TaskWithNoName.Match.newMatch((Task) t.get(POSITION_T));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TaskWithNoName.Match arrayToMatch(final Object[] match) {
      try {
          return TaskWithNoName.Match.newMatch((Task) match[POSITION_T]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TaskWithNoName.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TaskWithNoName.Match.newMutableMatch((Task) match[POSITION_T]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<TaskWithNoName.Matcher> querySpecification() {
      return TaskWithNoName.instance();
    }
  }
  
  private TaskWithNoName() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TaskWithNoName instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TaskWithNoName.Matcher instantiate(final ViatraQueryEngine engine) {
    return TaskWithNoName.Matcher.on(engine);
  }
  
  @Override
  public TaskWithNoName.Matcher instantiate() {
    return TaskWithNoName.Matcher.create();
  }
  
  @Override
  public TaskWithNoName.Match newEmptyMatch() {
    return TaskWithNoName.Match.newEmptyMatch();
  }
  
  @Override
  public TaskWithNoName.Match newMatch(final Object... parameters) {
    return TaskWithNoName.Match.newMatch((resource_conflict.components.model.Task) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.TaskWithNoName (visibility: PUBLIC, simpleName: TaskWithNoName, identifier: resource_conflict.components.model.queries.TaskWithNoName, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.TaskWithNoName (visibility: PUBLIC, simpleName: TaskWithNoName, identifier: resource_conflict.components.model.queries.TaskWithNoName, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TaskWithNoName INSTANCE = new TaskWithNoName();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TaskWithNoName.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_t = new PParameter("t", "resource_conflict.components.model.Task", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Task")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_t);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.taskWithNoName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_t = body.getOrCreateVariableByName("t");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t, parameter_t)
          ));
          //     Task.Name(t,"")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Task", "Name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "warning");
          annotation.addAttribute("message", "Task with no name");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("t")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
