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
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.Person;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern intersectingAllocation(a1:Assignment, a2:Assignment, p:Person) {
 *         	Assignment.person(a1,p);
 *         	Assignment.person(a2,p);
 *         	a1 != a2;
 *         	Assignment.From(a1,f1);
 *         	Assignment.To(a1,t1);
 *         	Assignment.From(a2,f2);
 *         	check(f1 {@literal <} f2);
 *         	check(f2 {@literal <} t1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class IntersectingAllocation extends BaseGeneratedEMFQuerySpecification<IntersectingAllocation.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.intersectingAllocation pattern,
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
    private Assignment fA1;
    
    private Assignment fA2;
    
    private Person fP;
    
    private static List<String> parameterNames = makeImmutableList("a1", "a2", "p");
    
    private Match(final Assignment pA1, final Assignment pA2, final Person pP) {
      this.fA1 = pA1;
      this.fA2 = pA2;
      this.fP = pP;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("a1".equals(parameterName)) return this.fA1;
      if ("a2".equals(parameterName)) return this.fA2;
      if ("p".equals(parameterName)) return this.fP;
      return null;
    }
    
    public Assignment getA1() {
      return this.fA1;
    }
    
    public Assignment getA2() {
      return this.fA2;
    }
    
    public Person getP() {
      return this.fP;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a1".equals(parameterName) ) {
          this.fA1 = (Assignment) newValue;
          return true;
      }
      if ("a2".equals(parameterName) ) {
          this.fA2 = (Assignment) newValue;
          return true;
      }
      if ("p".equals(parameterName) ) {
          this.fP = (Person) newValue;
          return true;
      }
      return false;
    }
    
    public void setA1(final Assignment pA1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA1 = pA1;
    }
    
    public void setA2(final Assignment pA2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA2 = pA2;
    }
    
    public void setP(final Person pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.intersectingAllocation";
    }
    
    @Override
    public List<String> parameterNames() {
      return IntersectingAllocation.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fA1, fA2, fP};
    }
    
    @Override
    public IntersectingAllocation.Match toImmutable() {
      return isMutable() ? newMatch(fA1, fA2, fP) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a1\"=" + prettyPrintValue(fA1) + ", ");
      result.append("\"a2\"=" + prettyPrintValue(fA2) + ", ");
      result.append("\"p\"=" + prettyPrintValue(fP));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fA1, fA2, fP);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof IntersectingAllocation.Match)) {
          IntersectingAllocation.Match other = (IntersectingAllocation.Match) obj;
          return Objects.equals(fA1, other.fA1) && Objects.equals(fA2, other.fA2) && Objects.equals(fP, other.fP);
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
    public IntersectingAllocation specification() {
      return IntersectingAllocation.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static IntersectingAllocation.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static IntersectingAllocation.Match newMutableMatch(final Assignment pA1, final Assignment pA2, final Person pP) {
      return new Mutable(pA1, pA2, pP);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static IntersectingAllocation.Match newMatch(final Assignment pA1, final Assignment pA2, final Person pP) {
      return new Immutable(pA1, pA2, pP);
    }
    
    private static final class Mutable extends IntersectingAllocation.Match {
      Mutable(final Assignment pA1, final Assignment pA2, final Person pP) {
        super(pA1, pA2, pP);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends IntersectingAllocation.Match {
      Immutable(final Assignment pA1, final Assignment pA2, final Person pP) {
        super(pA1, pA2, pP);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.intersectingAllocation pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern intersectingAllocation(a1:Assignment, a2:Assignment, p:Person) {
   * 	Assignment.person(a1,p);
   * 	Assignment.person(a2,p);
   * 	a1 != a2;
   * 	Assignment.From(a1,f1);
   * 	Assignment.To(a1,t1);
   * 	Assignment.From(a2,f2);
   * 	check(f1 {@literal <} f2);
   * 	check(f2 {@literal <} t1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see IntersectingAllocation
   * 
   */
  public static class Matcher extends BaseMatcher<IntersectingAllocation.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static IntersectingAllocation.Matcher on(final ViatraQueryEngine engine) {
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
    public static IntersectingAllocation.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_A1 = 0;
    
    private final static int POSITION_A2 = 1;
    
    private final static int POSITION_P = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(IntersectingAllocation.Matcher.class);
    
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
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<IntersectingAllocation.Match> getAllMatches(final Assignment pA1, final Assignment pA2, final Person pP) {
      return rawStreamAllMatches(new Object[]{pA1, pA2, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<IntersectingAllocation.Match> streamAllMatches(final Assignment pA1, final Assignment pA2, final Person pP) {
      return rawStreamAllMatches(new Object[]{pA1, pA2, pP});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<IntersectingAllocation.Match> getOneArbitraryMatch(final Assignment pA1, final Assignment pA2, final Person pP) {
      return rawGetOneArbitraryMatch(new Object[]{pA1, pA2, pP});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Assignment pA1, final Assignment pA2, final Person pP) {
      return rawHasMatch(new Object[]{pA1, pA2, pP});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Assignment pA1, final Assignment pA2, final Person pP) {
      return rawCountMatches(new Object[]{pA1, pA2, pP});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Assignment pA1, final Assignment pA2, final Person pP, final Consumer<? super IntersectingAllocation.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA1, pA2, pP}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA1 the fixed value of pattern parameter a1, or null if not bound.
     * @param pA2 the fixed value of pattern parameter a2, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public IntersectingAllocation.Match newMatch(final Assignment pA1, final Assignment pA2, final Person pP) {
      return IntersectingAllocation.Match.newMatch(pA1, pA2, pP);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Assignment> rawStreamAllValuesOfa1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A1, parameters).map(Assignment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa1() {
      return rawStreamAllValuesOfa1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa1() {
      return rawStreamAllValuesOfa1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa1(final IntersectingAllocation.Match partialMatch) {
      return rawStreamAllValuesOfa1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa1(final Assignment pA2, final Person pP) {
      return rawStreamAllValuesOfa1(new Object[]{null, pA2, pP});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa1(final IntersectingAllocation.Match partialMatch) {
      return rawStreamAllValuesOfa1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa1(final Assignment pA2, final Person pP) {
      return rawStreamAllValuesOfa1(new Object[]{null, pA2, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Assignment> rawStreamAllValuesOfa2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A2, parameters).map(Assignment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa2() {
      return rawStreamAllValuesOfa2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa2() {
      return rawStreamAllValuesOfa2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa2(final IntersectingAllocation.Match partialMatch) {
      return rawStreamAllValuesOfa2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Assignment> streamAllValuesOfa2(final Assignment pA1, final Person pP) {
      return rawStreamAllValuesOfa2(new Object[]{pA1, null, pP});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa2(final IntersectingAllocation.Match partialMatch) {
      return rawStreamAllValuesOfa2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Assignment> getAllValuesOfa2(final Assignment pA1, final Person pP) {
      return rawStreamAllValuesOfa2(new Object[]{pA1, null, pP}).collect(Collectors.toSet());
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
    public Stream<Person> streamAllValuesOfp(final IntersectingAllocation.Match partialMatch) {
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
    public Stream<Person> streamAllValuesOfp(final Assignment pA1, final Assignment pA2) {
      return rawStreamAllValuesOfp(new Object[]{pA1, pA2, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp(final IntersectingAllocation.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp(final Assignment pA1, final Assignment pA2) {
      return rawStreamAllValuesOfp(new Object[]{pA1, pA2, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected IntersectingAllocation.Match tupleToMatch(final Tuple t) {
      try {
          return IntersectingAllocation.Match.newMatch((Assignment) t.get(POSITION_A1), (Assignment) t.get(POSITION_A2), (Person) t.get(POSITION_P));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IntersectingAllocation.Match arrayToMatch(final Object[] match) {
      try {
          return IntersectingAllocation.Match.newMatch((Assignment) match[POSITION_A1], (Assignment) match[POSITION_A2], (Person) match[POSITION_P]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IntersectingAllocation.Match arrayToMatchMutable(final Object[] match) {
      try {
          return IntersectingAllocation.Match.newMutableMatch((Assignment) match[POSITION_A1], (Assignment) match[POSITION_A2], (Person) match[POSITION_P]);
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
    public static IQuerySpecification<IntersectingAllocation.Matcher> querySpecification() {
      return IntersectingAllocation.instance();
    }
  }
  
  private IntersectingAllocation() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static IntersectingAllocation instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected IntersectingAllocation.Matcher instantiate(final ViatraQueryEngine engine) {
    return IntersectingAllocation.Matcher.on(engine);
  }
  
  @Override
  public IntersectingAllocation.Matcher instantiate() {
    return IntersectingAllocation.Matcher.create();
  }
  
  @Override
  public IntersectingAllocation.Match newEmptyMatch() {
    return IntersectingAllocation.Match.newEmptyMatch();
  }
  
  @Override
  public IntersectingAllocation.Match newMatch(final Object... parameters) {
    return IntersectingAllocation.Match.newMatch((resource_conflict.components.model.Assignment) parameters[0], (resource_conflict.components.model.Assignment) parameters[1], (resource_conflict.components.model.Person) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.IntersectingAllocation (visibility: PUBLIC, simpleName: IntersectingAllocation, identifier: resource_conflict.components.model.queries.IntersectingAllocation, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.IntersectingAllocation (visibility: PUBLIC, simpleName: IntersectingAllocation, identifier: resource_conflict.components.model.queries.IntersectingAllocation, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static IntersectingAllocation INSTANCE = new IntersectingAllocation();
    
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
    private final static IntersectingAllocation.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_a1 = new PParameter("a1", "resource_conflict.components.model.Assignment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Assignment")), PParameterDirection.INOUT);
    
    private final PParameter parameter_a2 = new PParameter("a2", "resource_conflict.components.model.Assignment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Assignment")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p = new PParameter("p", "resource_conflict.components.model.Person", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Person")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_a1, parameter_a2, parameter_p);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.intersectingAllocation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a1","a2","p");
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
          PVariable var_a1 = body.getOrCreateVariableByName("a1");
          PVariable var_a2 = body.getOrCreateVariableByName("a2");
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_f1 = body.getOrCreateVariableByName("f1");
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_f2 = body.getOrCreateVariableByName("f2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_a2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a1, parameter_a1),
             new ExportedParameter(body, var_a2, parameter_a2),
             new ExportedParameter(body, var_p, parameter_p)
          ));
          // 	Assignment.person(a1,p)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "person")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          new Equality(body, var__virtual_0_, var_p);
          // 	Assignment.person(a2,p)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "person")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          new Equality(body, var__virtual_1_, var_p);
          // 	a1 != a2
          new Inequality(body, var_a1, var_a2);
          // 	Assignment.From(a1,f1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "From")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_2_, var_f1);
          // 	Assignment.To(a1,t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a1, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "To")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_3_, var_t1);
          // 	Assignment.From(a2,f2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a2, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "From")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_4_, var_f2);
          // 	check(f1 < f2)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern intersectingAllocation";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("f1", "f2");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer f1 = (Integer) provider.getValue("f1");
                  Integer f2 = (Integer) provider.getValue("f2");
                  return evaluateExpression_1_1(f1, f2);
              }
          },  null); 
          // 	check(f2 < t1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern intersectingAllocation";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("f2", "t1");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer f2 = (Integer) provider.getValue("f2");
                  Integer t1 = (Integer) provider.getValue("t1");
                  return evaluateExpression_1_2(f2, t1);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer f1, final Integer f2) {
    boolean _lessThan = (f1.compareTo(f2) < 0);
    return _lessThan;
  }
  
  private static boolean evaluateExpression_1_2(final Integer f2, final Integer t1) {
    boolean _lessThan = (f2.compareTo(t1) < 0);
    return _lessThan;
  }
}
