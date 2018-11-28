/**
 */
package resource_conflict.components.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resource_conflict.components.model.AllocationProblem#getComponents <em>Components</em>}</li>
 *   <li>{@link resource_conflict.components.model.AllocationProblem#getQualificationTypes <em>Qualification Types</em>}</li>
 *   <li>{@link resource_conflict.components.model.AllocationProblem#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see resource_conflict.components.model.ModelPackage#getAllocationProblem()
 * @model
 * @generated
 */
public interface AllocationProblem extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see resource_conflict.components.model.ModelPackage#getAllocationProblem_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Qualification Types</b></em>' containment reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Types</em>' containment reference list.
	 * @see resource_conflict.components.model.ModelPackage#getAllocationProblem_QualificationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Qualification> getQualificationTypes();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see resource_conflict.components.model.ModelPackage#getAllocationProblem_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // AllocationProblem
