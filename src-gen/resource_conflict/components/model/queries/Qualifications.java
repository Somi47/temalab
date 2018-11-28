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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import resource_conflict.components.model.Person;
import resource_conflict.components.model.Qualification;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern qualifications(p:Person, q:Qualification) {
 *             Person.qualifications(p,q);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Qualifications extends BaseGeneratedEMFQuerySpecification<Qualifications.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.qualifications pattern,
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
    private Person fP;
    
    private Qualification fQ;
    
    private static List<String> parameterNames = makeImmutableList("p", "q");
    
    private Match(final Person pP, final Qualification pQ) {
      this.fP = pP;
      this.fQ = pQ;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("p".equals(parameterName)) return this.fP;
      if ("q".equals(parameterName)) return this.fQ;
      return null;
    }
    
    public Person getP() {
      return this.fP;
    }
    
    public Qualification getQ() {
      return this.fQ;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("p".equals(parameterName) ) {
          this.fP = (Person) newValue;
          return true;
      }
      if ("q".equals(parameterName) ) {
          this.fQ = (Qualification) newValue;
          return true;
      }
      return false;
    }
    
    public void setP(final Person pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }
    
    public void setQ(final Qualification pQ) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fQ = pQ;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.qualifications";
    }
    
    @Override
    public List<String> parameterNames() {
      return Qualifications.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fP, fQ};
    }
    
    @Override
    public Qualifications.Match toImmutable() {
      return isMutable() ? newMatch(fP, fQ) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"p\"=" + prettyPrintValue(fP) + ", ");
      result.append("\"q\"=" + prettyPrintValue(fQ));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fP, fQ);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Qualifications.Match)) {
          Qualifications.Match other = (Qualifications.Match) obj;
          return Objects.equals(fP, other.fP) && Objects.equals(fQ, other.fQ);
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
    public Qualifications specification() {
      return Qualifications.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Qualifications.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Qualifications.Match newMutableMatch(final Person pP, final Qualification pQ) {
      return new Mutable(pP, pQ);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Qualifications.Match newMatch(final Person pP, final Qualification pQ) {
      return new Immutable(pP, pQ);
    }
    
    private static final class Mutable extends Qualifications.Match {
      Mutable(final Person pP, final Qualification pQ) {
        super(pP, pQ);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Qualifications.Match {
      Immutable(final Person pP, final Qualification pQ) {
        super(pP, pQ);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.qualifications pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern qualifications(p:Person, q:Qualification) {
   *     Person.qualifications(p,q);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Qualifications
   * 
   */
  public static class Matcher extends BaseMatcher<Qualifications.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Qualifications.Matcher on(final ViatraQueryEngine engine) {
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
    public static Qualifications.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_P = 0;
    
    private final static int POSITION_Q = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Qualifications.Matcher.class);
    
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
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Qualifications.Match> getAllMatches(final Person pP, final Qualification pQ) {
      return rawStreamAllMatches(new Object[]{pP, pQ}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Qualifications.Match> streamAllMatches(final Person pP, final Qualification pQ) {
      return rawStreamAllMatches(new Object[]{pP, pQ});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Qualifications.Match> getOneArbitraryMatch(final Person pP, final Qualification pQ) {
      return rawGetOneArbitraryMatch(new Object[]{pP, pQ});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Person pP, final Qualification pQ) {
      return rawHasMatch(new Object[]{pP, pQ});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Person pP, final Qualification pQ) {
      return rawCountMatches(new Object[]{pP, pQ});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Person pP, final Qualification pQ, final Consumer<? super Qualifications.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pP, pQ}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Qualifications.Match newMatch(final Person pP, final Qualification pQ) {
      return Qualifications.Match.newMatch(pP, pQ);
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
    public Stream<Person> streamAllValuesOfp(final Qualifications.Match partialMatch) {
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
    public Stream<Person> streamAllValuesOfp(final Qualification pQ) {
      return rawStreamAllValuesOfp(new Object[]{null, pQ});
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp(final Qualifications.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Person> getAllValuesOfp(final Qualification pQ) {
      return rawStreamAllValuesOfp(new Object[]{null, pQ}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Qualification> rawStreamAllValuesOfq(final Object[] parameters) {
      return rawStreamAllValues(POSITION_Q, parameters).map(Qualification.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Qualification> getAllValuesOfq() {
      return rawStreamAllValuesOfq(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Qualification> streamAllValuesOfq() {
      return rawStreamAllValuesOfq(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Qualification> streamAllValuesOfq(final Qualifications.Match partialMatch) {
      return rawStreamAllValuesOfq(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Qualification> streamAllValuesOfq(final Person pP) {
      return rawStreamAllValuesOfq(new Object[]{pP, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Qualification> getAllValuesOfq(final Qualifications.Match partialMatch) {
      return rawStreamAllValuesOfq(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for q.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Qualification> getAllValuesOfq(final Person pP) {
      return rawStreamAllValuesOfq(new Object[]{pP, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Qualifications.Match tupleToMatch(final Tuple t) {
      try {
          return Qualifications.Match.newMatch((Person) t.get(POSITION_P), (Qualification) t.get(POSITION_Q));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Qualifications.Match arrayToMatch(final Object[] match) {
      try {
          return Qualifications.Match.newMatch((Person) match[POSITION_P], (Qualification) match[POSITION_Q]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Qualifications.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Qualifications.Match.newMutableMatch((Person) match[POSITION_P], (Qualification) match[POSITION_Q]);
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
    public static IQuerySpecification<Qualifications.Matcher> querySpecification() {
      return Qualifications.instance();
    }
  }
  
  private Qualifications() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Qualifications instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Qualifications.Matcher instantiate(final ViatraQueryEngine engine) {
    return Qualifications.Matcher.on(engine);
  }
  
  @Override
  public Qualifications.Matcher instantiate() {
    return Qualifications.Matcher.create();
  }
  
  @Override
  public Qualifications.Match newEmptyMatch() {
    return Qualifications.Match.newEmptyMatch();
  }
  
  @Override
  public Qualifications.Match newMatch(final Object... parameters) {
    return Qualifications.Match.newMatch((resource_conflict.components.model.Person) parameters[0], (resource_conflict.components.model.Qualification) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.Qualifications (visibility: PUBLIC, simpleName: Qualifications, identifier: resource_conflict.components.model.queries.Qualifications, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.Qualifications (visibility: PUBLIC, simpleName: Qualifications, identifier: resource_conflict.components.model.queries.Qualifications, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Qualifications INSTANCE = new Qualifications();
    
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
    private final static Qualifications.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p = new PParameter("p", "resource_conflict.components.model.Person", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Person")), PParameterDirection.INOUT);
    
    private final PParameter parameter_q = new PParameter("q", "resource_conflict.components.model.Qualification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Qualification")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p, parameter_q);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.qualifications";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("p","q");
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
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_q = body.getOrCreateVariableByName("q");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_q), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Qualification")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_p, parameter_p),
             new ExportedParameter(body, var_q, parameter_q)
          ));
          //     Person.qualifications(p,q)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Person")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Person", "qualifications")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Qualification")));
          new Equality(body, var__virtual_0_, var_q);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
