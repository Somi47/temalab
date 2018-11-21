/**
 */
package resource_conflict.components.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resource_conflict.components.model.Person#getQualifications <em>Qualifications</em>}</li>
 *   <li>{@link resource_conflict.components.model.Person#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link resource_conflict.components.model.Person#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see resource_conflict.components.model.ModelPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifications</b></em>' reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifications</em>' reference list.
	 * @see resource_conflict.components.model.ModelPackage#getPerson_Qualifications()
	 * @model
	 * @generated
	 */
	EList<Qualification> getQualifications();

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Assignment}.
	 * It is bidirectional and its opposite is '{@link resource_conflict.components.model.Assignment#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference list.
	 * @see resource_conflict.components.model.ModelPackage#getPerson_Assignment()
	 * @see resource_conflict.components.model.Assignment#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<Assignment> getAssignment();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resource_conflict.components.model.ModelPackage#getPerson_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resource_conflict.components.model.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Person
