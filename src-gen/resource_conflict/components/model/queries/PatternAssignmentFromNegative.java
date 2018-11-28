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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import resource_conflict.components.model.Assignment;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // Error constraints
 *         {@literal @}Constraint(severity = "error", message = "Assignment can not be from negative time", key = {a})
 *         pattern patternAssignmentFromNegative(a : Assignment) {
 *             Assignment.From(a,from);
 *             check(from {@literal <} 0);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PatternAssignmentFromNegative extends BaseGeneratedEMFQuerySpecification<PatternAssignmentFromNegative.Matcher> {
  /**
   * Pattern-specific match representation of the resource_conflict.components.model.queries.patternAssignmentFromNegative pattern,
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
    private Assignment fA;
    
    private static List<String> parameterNames = makeImmutableList("a");
    
    private Match(final Assignment pA) {
      this.fA = pA;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("a".equals(parameterName)) return this.fA;
      return null;
    }
    
    public Assignment getA() {
      return this.fA;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (Assignment) newValue;
          return true;
      }
      return false;
    }
    
    public void setA(final Assignment pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    @Override
    public String patternName() {
      return "resource_conflict.components.model.queries.patternAssignmentFromNegative";
    }
    
    @Override
    public List<String> parameterNames() {
      return PatternAssignmentFromNegative.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fA};
    }
    
    @Override
    public PatternAssignmentFromNegative.Match toImmutable() {
      return isMutable() ? newMatch(fA) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fA);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PatternAssignmentFromNegative.Match)) {
          PatternAssignmentFromNegative.Match other = (PatternAssignmentFromNegative.Match) obj;
          return Objects.equals(fA, other.fA);
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
    public PatternAssignmentFromNegative specification() {
      return PatternAssignmentFromNegative.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PatternAssignmentFromNegative.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PatternAssignmentFromNegative.Match newMutableMatch(final Assignment pA) {
      return new Mutable(pA);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PatternAssignmentFromNegative.Match newMatch(final Assignment pA) {
      return new Immutable(pA);
    }
    
    private static final class Mutable extends PatternAssignmentFromNegative.Match {
      Mutable(final Assignment pA) {
        super(pA);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PatternAssignmentFromNegative.Match {
      Immutable(final Assignment pA) {
        super(pA);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the resource_conflict.components.model.queries.patternAssignmentFromNegative pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Error constraints
   * {@literal @}Constraint(severity = "error", message = "Assignment can not be from negative time", key = {a})
   * pattern patternAssignmentFromNegative(a : Assignment) {
   *     Assignment.From(a,from);
   *     check(from {@literal <} 0);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PatternAssignmentFromNegative
   * 
   */
  public static class Matcher extends BaseMatcher<PatternAssignmentFromNegative.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PatternAssignmentFromNegative.Matcher on(final ViatraQueryEngine engine) {
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
    public static PatternAssignmentFromNegative.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_A = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PatternAssignmentFromNegative.Matcher.class);
    
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
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PatternAssignmentFromNegative.Match> getAllMatches(final Assignment pA) {
      return rawStreamAllMatches(new Object[]{pA}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PatternAssignmentFromNegative.Match> streamAllMatches(final Assignment pA) {
      return rawStreamAllMatches(new Object[]{pA});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PatternAssignmentFromNegative.Match> getOneArbitraryMatch(final Assignment pA) {
      return rawGetOneArbitraryMatch(new Object[]{pA});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Assignment pA) {
      return rawHasMatch(new Object[]{pA});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Assignment pA) {
      return rawCountMatches(new Object[]{pA});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Assignment pA, final Consumer<? super PatternAssignmentFromNegative.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PatternAssignmentFromNegative.Match newMatch(final Assignment pA) {
      return PatternAssignmentFromNegative.Match.newMatch(pA);
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
    
    @Override
    protected PatternAssignmentFromNegative.Match tupleToMatch(final Tuple t) {
      try {
          return PatternAssignmentFromNegative.Match.newMatch((Assignment) t.get(POSITION_A));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PatternAssignmentFromNegative.Match arrayToMatch(final Object[] match) {
      try {
          return PatternAssignmentFromNegative.Match.newMatch((Assignment) match[POSITION_A]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PatternAssignmentFromNegative.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PatternAssignmentFromNegative.Match.newMutableMatch((Assignment) match[POSITION_A]);
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
    public static IQuerySpecification<PatternAssignmentFromNegative.Matcher> querySpecification() {
      return PatternAssignmentFromNegative.instance();
    }
  }
  
  private PatternAssignmentFromNegative() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PatternAssignmentFromNegative instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PatternAssignmentFromNegative.Matcher instantiate(final ViatraQueryEngine engine) {
    return PatternAssignmentFromNegative.Matcher.on(engine);
  }
  
  @Override
  public PatternAssignmentFromNegative.Matcher instantiate() {
    return PatternAssignmentFromNegative.Matcher.create();
  }
  
  @Override
  public PatternAssignmentFromNegative.Match newEmptyMatch() {
    return PatternAssignmentFromNegative.Match.newEmptyMatch();
  }
  
  @Override
  public PatternAssignmentFromNegative.Match newMatch(final Object... parameters) {
    return PatternAssignmentFromNegative.Match.newMatch((resource_conflict.components.model.Assignment) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: resource_conflict.components.model.queries.PatternAssignmentFromNegative (visibility: PUBLIC, simpleName: PatternAssignmentFromNegative, identifier: resource_conflict.components.model.queries.PatternAssignmentFromNegative, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: resource_conflict.components.model.queries.PatternAssignmentFromNegative (visibility: PUBLIC, simpleName: PatternAssignmentFromNegative, identifier: resource_conflict.components.model.queries.PatternAssignmentFromNegative, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: resource_conflict.components.model.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static PatternAssignmentFromNegative INSTANCE = new PatternAssignmentFromNegative();
    
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
    private final static PatternAssignmentFromNegative.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_a = new PParameter("a", "resource_conflict.components.model.Assignment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/model", "Assignment")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_a);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "resource_conflict.components.model.queries.patternAssignmentFromNegative";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a");
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
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_from = body.getOrCreateVariableByName("from");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a)
          ));
          //     Assignment.From(a,from)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/model", "Assignment")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/model", "Assignment", "From")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Int")));
          new Equality(body, var__virtual_0_, var_from);
          //     check(from < 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern patternAssignmentFromNegative";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("from");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer from = (Integer) provider.getValue("from");
                  return evaluateExpression_1_1(from);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "Assignment can not be from negative time");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("a")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer from) {
    return ((from).intValue() < 0);
  }
}
