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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
//import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
//import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.Task;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern differentTaskLength(t:Task, a:Assignment) {
 *         	Task.assignment(t,a);
 *         	Task.Estimate(t,taskEstimatedTime);
 *         	Assignment.From(a,from);
 *         	Assignment.To(a,to);
 *         	difference == eval(to-from);
 *         	difference != taskEstimatedTime;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DifferentTaskLength extends BaseGeneratedEMFQuerySpecification<DifferentTaskLength.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.differentTaskLength pattern,
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
    
    private Assignment fA;
    
    private static List<String> parameterNames = makeImmutableList("t", "a");
    
    private Match(final Task pT, final Assignment pA) {
      this.fT = pT;
      this.fA = pA;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("t".equals(parameterName)) return this.fT;
      if ("a".equals(parameterName)) return this.fA;
      return null;
    }
    
    public Task getT() {
      return this.fT;
    }
    
    public Assignment getA() {
      return this.fA;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("t".equals(parameterName) ) {
          this.fT = (Task) newValue;
          return true;
      }
      if ("a".equals(parameterName) ) {
          this.fA = (Assignment) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final Task pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    public void setA(final Assignment pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.differentTaskLength";
    }
    
    @Override
    public List<String> parameterNames() {
      return DifferentTaskLength.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT, fA};
    }
    
    @Override
    public DifferentTaskLength.Match toImmutable() {
      return isMutable() ? newMatch(fT, fA) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
      result.append("\"a\"=" + prettyPrintValue(fA));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT, fA);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DifferentTaskLength.Match)) {
          DifferentTaskLength.Match other = (DifferentTaskLength.Match) obj;
          return Objects.equals(fT, other.fT) && Objects.equals(fA, other.fA);
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
    public DifferentTaskLength specification() {
      return DifferentTaskLength.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DifferentTaskLength.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DifferentTaskLength.Match newMutableMatch(final Task pT, final Assignment pA) {
      return new Mutable(pT, pA);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DifferentTaskLength.Match newMatch(final Task pT, final Assignment pA) {
      return new Immutable(pT, pA);
    }
    
    private static final class Mutable extends DifferentTaskLength.Match {
      Mutable(final Task pT, final Assignment pA) {
        super(pT, pA);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DifferentTaskLength.Match {
      Immutable(final Task pT, final Assignment pA) {
        super(pT, pA);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.differentTaskLength pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern differentTaskLength(t:Task, a:Assignment) {
   * 	Task.assignment(t,a);
   * 	Task.Estimate(t,taskEstimatedTime);
   * 	Assignment.From(a,from);
   * 	Assignment.To(a,to);
   * 	difference == eval(to-from);
   * 	difference != taskEstimatedTime;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DifferentTaskLength
   * 
   */
  public static class Matcher extends BaseMatcher<DifferentTaskLength.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DifferentTaskLength.Matcher on(final ViatraQueryEngine engine) {
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
    public static DifferentTaskLength.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_T = 0;
    
    private final static int POSITION_A = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DifferentTaskLength.Matcher.class);
    
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
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DifferentTaskLength.Match> getAllMatches(final Task pT, final Assignment pA) {
      return rawStreamAllMatches(new Object[]{pT, pA}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DifferentTaskLength.Match> streamAllMatches(final Task pT, final Assignment pA) {
      return rawStreamAllMatches(new Object[]{pT, pA});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DifferentTaskLength.Match> getOneArbitraryMatch(final Task pT, final Assignment pA) {
      return rawGetOneArbitraryMatch(new Object[]{pT, pA});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Task pT, final Assignment pA) {
      return rawHasMatch(new Object[]{pT, pA});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Task pT, final Assignment pA) {
      return rawCountMatches(new Object[]{pT, pA});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Task pT, final Assignment pA, final Consumer<? super DifferentTaskLength.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT, pA}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DifferentTaskLength.Match newMatch(final Task pT, final Assignment pA) {
      return DifferentTaskLength.Match.newMatch(pT, pA);
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
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Task> streamAllValuesOft(final DifferentTaskLength.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Task> streamAllValuesOft(final Assignment pA) {
      return rawStreamAllValuesOft(new Object[]{null, pA});
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Task> getAllValuesOft(final DifferentTaskLength.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Task> getAllValuesOft(final Assignment pA) {
      return rawStreamAllValuesOft(new Object[]{null, pA}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Assignment> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(Assignment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa(final DifferentTaskLength.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa(final Task pT) {
      return rawStreamAllValuesOfa(new Object[]{pT, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa(final DifferentTaskLength.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa(final Task pT) {
      return rawStreamAllValuesOfa(new Object[]{pT, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected DifferentTaskLength.Match tupleToMatch(final Tuple t) {
      try {
          return DifferentTaskLength.Match.newMatch((Task) t.get(POSITION_T), (Assignment) t.get(POSITION_A));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DifferentTaskLength.Match arrayToMatch(final Object[] match) {
      try {
          return DifferentTaskLength.Match.newMatch((Task) match[POSITION_T], (Assignment) match[POSITION_A]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DifferentTaskLength.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DifferentTaskLength.Match.newMutableMatch((Task) match[POSITION_T], (Assignment) match[POSITION_A]);
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
    public static IQuerySpecification<DifferentTaskLength.Matcher> querySpecification() {
      return DifferentTaskLength.instance();
    }
  }
  
  private DifferentTaskLength() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DifferentTaskLength instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DifferentTaskLength.Matcher instantiate(final ViatraQueryEngine engine) {
    return DifferentTaskLength.Matcher.on(engine);
  }
  
  @Override
  public DifferentTaskLength.Matcher instantiate() {
    return DifferentTaskLength.Matcher.create();
  }
  
  @Override
  public DifferentTaskLength.Match newEmptyMatch() {
    return DifferentTaskLength.Match.newEmptyMatch();
  }
  
  @Override
  public DifferentTaskLength.Match newMatch(final Object... parameters) {
    return DifferentTaskLength.Match.newMatch((resource_conflict.components.model.Task) parameters[0], (resource_conflict.components.model.Assignment) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.DifferentTaskLength (visibility: PUBLIC, simpleName: DifferentTaskLength, identifier: resource_conflict.components.model.queries.DifferentTaskLength, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.DifferentTaskLength (visibility: PUBLIC, simpleName: DifferentTaskLength, identifier: resource_conflict.components.model.queries.DifferentTaskLength, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DifferentTaskLength INSTANCE = new DifferentTaskLength();
    
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
    private final static DifferentTaskLength.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_t = new PParameter("t", "resource_conflict.components.model.Task", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Task")), PParameterDirection.INOUT);
    
    private final PParameter parameter_a = new PParameter("a", "resource_conflict.components.model.Assignment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Assignment")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_t, parameter_a);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.differentTaskLength";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t","a");
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
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_taskEstimatedTime = body.getOrCreateVariableByName("taskEstimatedTime");
          PVariable var_from = body.getOrCreateVariableByName("from");
          PVariable var_to = body.getOrCreateVariableByName("to");
          PVariable var_difference = body.getOrCreateVariableByName("difference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t, parameter_t),
             new ExportedParameter(body, var_a, parameter_a)
          ));
          // 	Task.assignment(t,a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Task", "assignment")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          new Equality(body, var__virtual_0_, var_a);
          // 	Task.Estimate(t,taskEstimatedTime)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Task", "Estimate")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_1_, var_taskEstimatedTime);
          // 	Assignment.From(a,from)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "From")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_2_, var_from);
          // 	Assignment.To(a,to)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "To")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_3_, var_to);
          // 	difference == eval(to-from)
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern differentTaskLength";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("from", "to");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer from = (Integer) provider.getValue("from");
                  Integer to = (Integer) provider.getValue("to");
                  return evaluateExpression_1_1(from, to);
              }
          },  var__virtual_4_ ); 
          new Equality(body, var_difference, var__virtual_4_);
          // 	difference != taskEstimatedTime
          new Inequality(body, var_difference, var_taskEstimatedTime);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1(final Integer from, final Integer to) {
    return ((to).intValue() - (from).intValue());
  }
}
