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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import resource_conflict.components.model.Person;
import resource_conflict.components.model.Task;
import resource_conflict.components.model.queries.UnqualifiedAllocation;
import resource_conflict.components.model.queries.internal.TaskAssigned;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern canAssign(t:Task, p:Person) {
 *         	neg find taskAssigned(t);
 *         	neg find unqualifiedAllocation(t,p);
 *         	AllocationProblem.persons(a,p);
 *         	AllocationProblem.components.tasks(a,t);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CanAssign extends BaseGeneratedEMFQuerySpecification<CanAssign.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.canAssign pattern,
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
    
    private Person fP;
    
    private static List<String> parameterNames = makeImmutableList("t", "p");
    
    private Match(final Task pT, final Person pP) {
      this.fT = pT;
      this.fP = pP;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("t".equals(parameterName)) return this.fT;
      if ("p".equals(parameterName)) return this.fP;
      return null;
    }
    
    public Task getT() {
      return this.fT;
    }
    
    public Person getP() {
      return this.fP;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("t".equals(parameterName) ) {
          this.fT = (Task) newValue;
          return true;
      }
      if ("p".equals(parameterName) ) {
          this.fP = (Person) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final Task pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    public void setP(final Person pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.canAssign";
    }
    
    @Override
    public List<String> parameterNames() {
      return CanAssign.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT, fP};
    }
    
    @Override
    public CanAssign.Match toImmutable() {
      return isMutable() ? newMatch(fT, fP) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
      result.append("\"p\"=" + prettyPrintValue(fP));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT, fP);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CanAssign.Match)) {
          CanAssign.Match other = (CanAssign.Match) obj;
          return Objects.equals(fT, other.fT) && Objects.equals(fP, other.fP);
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
    public CanAssign specification() {
      return CanAssign.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CanAssign.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CanAssign.Match newMutableMatch(final Task pT, final Person pP) {
      return new Mutable(pT, pP);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CanAssign.Match newMatch(final Task pT, final Person pP) {
      return new Immutable(pT, pP);
    }
    
    private static final class Mutable extends CanAssign.Match {
      Mutable(final Task pT, final Person pP) {
        super(pT, pP);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CanAssign.Match {
      Immutable(final Task pT, final Person pP) {
        super(pT, pP);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.canAssign pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern canAssign(t:Task, p:Person) {
   * 	neg find taskAssigned(t);
   * 	neg find unqualifiedAllocation(t,p);
   * 	AllocationProblem.persons(a,p);
   * 	AllocationProblem.components.tasks(a,t);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CanAssign
   * 
   */
  public static class Matcher extends BaseMatcher<CanAssign.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CanAssign.Matcher on(final ViatraQueryEngine engine) {
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
    public static CanAssign.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_T = 0;
    
    private final static int POSITION_P = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CanAssign.Matcher.class);
    
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
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CanAssign.Match> getAllMatches(final Task pT, final Person pP) {
      return rawStreamAllMatches(new Object[]{pT, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CanAssign.Match> streamAllMatches(final Task pT, final Person pP) {
      return rawStreamAllMatches(new Object[]{pT, pP});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CanAssign.Match> getOneArbitraryMatch(final Task pT, final Person pP) {
      return rawGetOneArbitraryMatch(new Object[]{pT, pP});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Task pT, final Person pP) {
      return rawHasMatch(new Object[]{pT, pP});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Task pT, final Person pP) {
      return rawCountMatches(new Object[]{pT, pP});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Task pT, final Person pP, final Consumer<? super CanAssign.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT, pP}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CanAssign.Match newMatch(final Task pT, final Person pP) {
      return CanAssign.Match.newMatch(pT, pP);
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
    public Stream<Task> streamAllValuesOft(final CanAssign.Match partialMatch) {
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
    public Stream<Task> streamAllValuesOft(final Person pP) {
      return rawStreamAllValuesOft(new Object[]{null, pP});
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Task> getAllValuesOft(final CanAssign.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Task> getAllValuesOft(final Person pP) {
      return rawStreamAllValuesOft(new Object[]{null, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Person> rawStreamAllValuesOfp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_P, parameters).map(Person.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Person> streamAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Person> streamAllValuesOfp(final CanAssign.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Person> streamAllValuesOfp(final Task pT) {
      return rawStreamAllValuesOfp(new Object[]{pT, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp(final CanAssign.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp(final Task pT) {
      return rawStreamAllValuesOfp(new Object[]{pT, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected CanAssign.Match tupleToMatch(final Tuple t) {
      try {
          return CanAssign.Match.newMatch((Task) t.get(POSITION_T), (Person) t.get(POSITION_P));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CanAssign.Match arrayToMatch(final Object[] match) {
      try {
          return CanAssign.Match.newMatch((Task) match[POSITION_T], (Person) match[POSITION_P]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CanAssign.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CanAssign.Match.newMutableMatch((Task) match[POSITION_T], (Person) match[POSITION_P]);
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
    public static IQuerySpecification<CanAssign.Matcher> querySpecification() {
      return CanAssign.instance();
    }
  }
  
  private CanAssign() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CanAssign instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CanAssign.Matcher instantiate(final ViatraQueryEngine engine) {
    return CanAssign.Matcher.on(engine);
  }
  
  @Override
  public CanAssign.Matcher instantiate() {
    return CanAssign.Matcher.create();
  }
  
  @Override
  public CanAssign.Match newEmptyMatch() {
    return CanAssign.Match.newEmptyMatch();
  }
  
  @Override
  public CanAssign.Match newMatch(final Object... parameters) {
    return CanAssign.Match.newMatch((resource_conflict.components.model.Task) parameters[0], (resource_conflict.components.model.Person) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.CanAssign (visibility: PUBLIC, simpleName: CanAssign, identifier: resource_conflict.components.model.queries.CanAssign, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.CanAssign (visibility: PUBLIC, simpleName: CanAssign, identifier: resource_conflict.components.model.queries.CanAssign, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CanAssign INSTANCE = new CanAssign();
    
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
    private final static CanAssign.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_t = new PParameter("t", "resource_conflict.components.model.Task", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Task")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p = new PParameter("p", "resource_conflict.components.model.Person", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Person")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_t, parameter_p);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.canAssign";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t","p");
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
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_a = body.getOrCreateVariableByName("a");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t, parameter_t),
             new ExportedParameter(body, var_p, parameter_p)
          ));
          // 	neg find taskAssigned(t)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_t), TaskAssigned.instance().getInternalQueryRepresentation());
          // 	neg find unqualifiedAllocation(t,p)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_t, var_p), UnqualifiedAllocation.instance().getInternalQueryRepresentation());
          // 	AllocationProblem.persons(a,p)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "AllocationProblem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "AllocationProblem", "persons")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          new Equality(body, var__virtual_0_, var_p);
          // 	AllocationProblem.components.tasks(a,t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "AllocationProblem")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "AllocationProblem", "components")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Component")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Component", "tasks")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Task")));
          new Equality(body, var__virtual_2_, var_t);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
