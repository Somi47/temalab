/**
 */
package resource_conflict.components.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import resource_conflict.components.model.Assignment;
import resource_conflict.components.model.ModelPackage;
import resource_conflict.components.model.Qualification;
import resource_conflict.components.model.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resource_conflict.components.model.impl.TaskImpl#getQualificationsRequired <em>Qualifications Required</em>}</li>
 *   <li>{@link resource_conflict.components.model.impl.TaskImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link resource_conflict.components.model.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link resource_conflict.components.model.impl.TaskImpl#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link resource_conflict.components.model.impl.TaskImpl#getRequirementsToStart <em>Requirements To Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getQualificationsRequired() <em>Qualifications Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationsRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualificationsRequired;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected Assignment assignment;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimate() <em>Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTIMATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEstimate() <em>Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected int estimate = ESTIMATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirementsToStart() <em>Requirements To Start</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementsToStart()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> requirementsToStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualificationsRequired() {
		if (qualificationsRequired == null) {
			qualificationsRequired = new EObjectResolvingEList<Qualification>(Qualification.class, this,
					ModelPackage.TASK__QUALIFICATIONS_REQUIRED);
		}
		return qualificationsRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignment(Assignment newAssignment, NotificationChain msgs) {
		Assignment oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.TASK__ASSIGNMENT, oldAssignment, newAssignment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(Assignment newAssignment) {
		if (newAssignment != assignment) {
			NotificationChain msgs = null;
			if (assignment != null)
				msgs = ((InternalEObject) assignment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.TASK__ASSIGNMENT, null, msgs);
			if (newAssignment != null)
				msgs = ((InternalEObject) newAssignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.TASK__ASSIGNMENT, null, msgs);
			msgs = basicSetAssignment(newAssignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__ASSIGNMENT, newAssignment,
					newAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstimate() {
		return estimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimate(int newEstimate) {
		int oldEstimate = estimate;
		estimate = newEstimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__ESTIMATE, oldEstimate, estimate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getRequirementsToStart() {
		if (requirementsToStart == null) {
			requirementsToStart = new EObjectResolvingEList<Task>(Task.class, this,
					ModelPackage.TASK__REQUIREMENTS_TO_START);
		}
		return requirementsToStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.TASK__ASSIGNMENT:
			return basicSetAssignment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.TASK__QUALIFICATIONS_REQUIRED:
			return getQualificationsRequired();
		case ModelPackage.TASK__ASSIGNMENT:
			return getAssignment();
		case ModelPackage.TASK__NAME:
			return getName();
		case ModelPackage.TASK__ESTIMATE:
			return getEstimate();
		case ModelPackage.TASK__REQUIREMENTS_TO_START:
			return getRequirementsToStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.TASK__QUALIFICATIONS_REQUIRED:
			getQualificationsRequired().clear();
			getQualificationsRequired().addAll((Collection<? extends Qualification>) newValue);
			return;
		case ModelPackage.TASK__ASSIGNMENT:
			setAssignment((Assignment) newValue);
			return;
		case ModelPackage.TASK__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.TASK__ESTIMATE:
			setEstimate((Integer) newValue);
			return;
		case ModelPackage.TASK__REQUIREMENTS_TO_START:
			getRequirementsToStart().clear();
			getRequirementsToStart().addAll((Collection<? extends Task>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.TASK__QUALIFICATIONS_REQUIRED:
			getQualificationsRequired().clear();
			return;
		case ModelPackage.TASK__ASSIGNMENT:
			setAssignment((Assignment) null);
			return;
		case ModelPackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.TASK__ESTIMATE:
			setEstimate(ESTIMATE_EDEFAULT);
			return;
		case ModelPackage.TASK__REQUIREMENTS_TO_START:
			getRequirementsToStart().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.TASK__QUALIFICATIONS_REQUIRED:
			return qualificationsRequired != null && !qualificationsRequired.isEmpty();
		case ModelPackage.TASK__ASSIGNMENT:
			return assignment != null;
		case ModelPackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.TASK__ESTIMATE:
			return estimate != ESTIMATE_EDEFAULT;
		case ModelPackage.TASK__REQUIREMENTS_TO_START:
			return requirementsToStart != null && !requirementsToStart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Estimate: ");
		result.append(estimate);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
