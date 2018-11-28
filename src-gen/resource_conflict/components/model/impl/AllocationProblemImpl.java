/**
 */
package resource_conflict.components.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resource_conflict.components.model.AllocationProblem;
import resource_conflict.components.model.Component;
import resource_conflict.components.model.ModelPackage;
import resource_conflict.components.model.Person;
import resource_conflict.components.model.Qualification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resource_conflict.components.model.impl.AllocationProblemImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link resource_conflict.components.model.impl.AllocationProblemImpl#getQualificationTypes <em>Qualification Types</em>}</li>
 *   <li>{@link resource_conflict.components.model.impl.AllocationProblemImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationProblemImpl extends MinimalEObjectImpl.Container implements AllocationProblem {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getQualificationTypes() <em>Qualification Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualificationTypes;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALLOCATION_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this,
					ModelPackage.ALLOCATION_PROBLEM__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualificationTypes() {
		if (qualificationTypes == null) {
			qualificationTypes = new EObjectContainmentEList<Qualification>(Qualification.class, this,
					ModelPackage.ALLOCATION_PROBLEM__QUALIFICATION_TYPES);
		}
		return qualificationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, ModelPackage.ALLOCATION_PROBLEM__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ALLOCATION_PROBLEM__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case ModelPackage.ALLOCATION_PROBLEM__QUALIFICATION_TYPES:
			return ((InternalEList<?>) getQualificationTypes()).basicRemove(otherEnd, msgs);
		case ModelPackage.ALLOCATION_PROBLEM__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.ALLOCATION_PROBLEM__COMPONENTS:
			return getComponents();
		case ModelPackage.ALLOCATION_PROBLEM__QUALIFICATION_TYPES:
			return getQualificationTypes();
		case ModelPackage.ALLOCATION_PROBLEM__PERSONS:
			return getPersons();
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
		case ModelPackage.ALLOCATION_PROBLEM__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case ModelPackage.ALLOCATION_PROBLEM__QUALIFICATION_TYPES:
			getQualificationTypes().clear();
			getQualificationTypes().addAll((Collection<? extends Qualification>) newValue);
			return;
		case ModelPackage.ALLOCATION_PROBLEM__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
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
		case ModelPackage.ALLOCATION_PROBLEM__COMPONENTS:
			getComponents().clear();
			return;
		case ModelPackage.ALLOCATION_PROBLEM__QUALIFICATION_TYPES:
			getQualificationTypes().clear();
			return;
		case ModelPackage.ALLOCATION_PROBLEM__PERSONS:
			getPersons().clear();
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
		case ModelPackage.ALLOCATION_PROBLEM__COMPONENTS:
			return components != null && !components.isEmpty();
		case ModelPackage.ALLOCATION_PROBLEM__QUALIFICATION_TYPES:
			return qualificationTypes != null && !qualificationTypes.isEmpty();
		case ModelPackage.ALLOCATION_PROBLEM__PERSONS:
			return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationProblemImpl
