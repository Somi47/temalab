/**
 */
package resource_conflict.components.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resource_conflict.components.model.Task#getQualificationsRequired <em>Qualifications Required</em>}</li>
 *   <li>{@link resource_conflict.components.model.Task#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link resource_conflict.components.model.Task#getName <em>Name</em>}</li>
 *   <li>{@link resource_conflict.components.model.Task#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link resource_conflict.components.model.Task#getRequirementsToStart <em>Requirements To Start</em>}</li>
 * </ul>
 *
 * @see resource_conflict.components.model.ModelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifications Required</b></em>' reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifications Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifications Required</em>' reference list.
	 * @see resource_conflict.components.model.ModelPackage#getTask_QualificationsRequired()
	 * @model
	 * @generated
	 */
	EList<Qualification> getQualificationsRequired();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see resource_conflict.components.model.ModelPackage#getTask_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignments();

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
	 * @see resource_conflict.components.model.ModelPackage#getTask_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resource_conflict.components.model.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimate</em>' attribute.
	 * @see #setEstimate(int)
	 * @see resource_conflict.components.model.ModelPackage#getTask_Estimate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getEstimate();

	/**
	 * Sets the value of the '{@link resource_conflict.components.model.Task#getEstimate <em>Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimate</em>' attribute.
	 * @see #getEstimate()
	 * @generated
	 */
	void setEstimate(int value);

	/**
	 * Returns the value of the '<em><b>Requirements To Start</b></em>' reference list.
	 * The list contents are of type {@link resource_conflict.components.model.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements To Start</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements To Start</em>' reference list.
	 * @see resource_conflict.components.model.ModelPackage#getTask_RequirementsToStart()
	 * @model
	 * @generated
	 */
	EList<Task> getRequirementsToStart();

} // Task
