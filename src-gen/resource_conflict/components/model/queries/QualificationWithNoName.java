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
import resource_conflict.components.model.Qualification;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(severity = "warning", message = "Qualification with no name", key = {q})
 *         pattern qualificationWithNoName(q : Qualification) {
 *             Qualification.Name(q,"");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class QualificationWithNoName extends BaseGeneratedEMFQuerySpecification<QualificationWithNoName.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.qualificationWithNoName pattern,
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
    private Qualification fQ;
    
    private static List<String> parameterNames = makeImmutableList("q");
    
    private Match(final Qualification pQ) {
      this.fQ = pQ;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("q".equals(parameterName)) return this.fQ;
      return null;
    }
    
    public Qualification getQ() {
      return this.fQ;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("q".equals(parameterName) ) {
          this.fQ = (Qualification) newValue;
          return true;
      }
      return false;
    }
    
    public void setQ(final Qualification pQ) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fQ = pQ;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.qualificationWithNoName";
    }
    
    @Override
    public List<String> parameterNames() {
      return QualificationWithNoName.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fQ};
    }
    
    @Override
    public QualificationWithNoName.Match toImmutable() {
      return isMutable() ? newMatch(fQ) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"q\"=" + prettyPrintValue(fQ));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fQ);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof QualificationWithNoName.Match)) {
          QualificationWithNoName.Match other = (QualificationWithNoName.Match) obj;
          return Objects.equals(fQ, other.fQ);
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
    public QualificationWithNoName specification() {
      return QualificationWithNoName.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static QualificationWithNoName.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static QualificationWithNoName.Match newMutableMatch(final Qualification pQ) {
      return new Mutable(pQ);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static QualificationWithNoName.Match newMatch(final Qualification pQ) {
      return new Immutable(pQ);
    }
    
    private static final class Mutable extends QualificationWithNoName.Match {
      Mutable(final Qualification pQ) {
        super(pQ);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends QualificationWithNoName.Match {
      Immutable(final Qualification pQ) {
        super(pQ);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.qualificationWithNoName pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "warning", message = "Qualification with no name", key = {q})
   * pattern qualificationWithNoName(q : Qualification) {
   *     Qualification.Name(q,"");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see QualificationWithNoName
   * 
   */
  public static class Matcher extends BaseMatcher<QualificationWithNoName.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static QualificationWithNoName.Matcher on(final ViatraQueryEngine engine) {
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
    public static QualificationWithNoName.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_Q = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(QualificationWithNoName.Matcher.class);
    
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
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<QualificationWithNoName.Match> getAllMatches(final Qualification pQ) {
      return rawStreamAllMatches(new Object[]{pQ}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<QualificationWithNoName.Match> streamAllMatches(final Qualification pQ) {
      return rawStreamAllMatches(new Object[]{pQ});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<QualificationWithNoName.Match> getOneArbitraryMatch(final Qualification pQ) {
      return rawGetOneArbitraryMatch(new Object[]{pQ});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Qualification pQ) {
      return rawHasMatch(new Object[]{pQ});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Qualification pQ) {
      return rawCountMatches(new Object[]{pQ});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Qualification pQ, final Consumer<? super QualificationWithNoName.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pQ}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pQ the fixed value of pattern parameter q, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public QualificationWithNoName.Match newMatch(final Qualification pQ) {
      return QualificationWithNoName.Match.newMatch(pQ);
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
    
    @Override
    protected QualificationWithNoName.Match tupleToMatch(final Tuple t) {
      try {
          return QualificationWithNoName.Match.newMatch((Qualification) t.get(POSITION_Q));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected QualificationWithNoName.Match arrayToMatch(final Object[] match) {
      try {
          return QualificationWithNoName.Match.newMatch((Qualification) match[POSITION_Q]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected QualificationWithNoName.Match arrayToMatchMutable(final Object[] match) {
      try {
          return QualificationWithNoName.Match.newMutableMatch((Qualification) match[POSITION_Q]);
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
    public static IQuerySpecification<QualificationWithNoName.Matcher> querySpecification() {
      return QualificationWithNoName.instance();
    }
  }
  
  private QualificationWithNoName() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static QualificationWithNoName instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected QualificationWithNoName.Matcher instantiate(final ViatraQueryEngine engine) {
    return QualificationWithNoName.Matcher.on(engine);
  }
  
  @Override
  public QualificationWithNoName.Matcher instantiate() {
    return QualificationWithNoName.Matcher.create();
  }
  
  @Override
  public QualificationWithNoName.Match newEmptyMatch() {
    return QualificationWithNoName.Match.newEmptyMatch();
  }
  
  @Override
  public QualificationWithNoName.Match newMatch(final Object... parameters) {
    return QualificationWithNoName.Match.newMatch((resource_conflict.components.model.Qualification) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.QualificationWithNoName (visibility: PUBLIC, simpleName: QualificationWithNoName, identifier: resource_conflict.components.model.queries.QualificationWithNoName, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.QualificationWithNoName (visibility: PUBLIC, simpleName: QualificationWithNoName, identifier: resource_conflict.components.model.queries.QualificationWithNoName, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static QualificationWithNoName INSTANCE = new QualificationWithNoName();
    
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
    private final static QualificationWithNoName.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_q = new PParameter("q", "resource_conflict.components.model.Qualification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Qualification")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_q);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.qualificationWithNoName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("q");
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
          PVariable var_q = body.getOrCreateVariableByName("q");
          new TypeConstraint(body, Tuples.flatTupleOf(var_q), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Qualification")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_q, parameter_q)
          ));
          //     Qualification.Name(q,"")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "");
          new TypeConstraint(body, Tuples.flatTupleOf(var_q), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Qualification")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_q, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Qualification", "Name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "String")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "warning");
          annotation.addAttribute("message", "Qualification with no name");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("q")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
