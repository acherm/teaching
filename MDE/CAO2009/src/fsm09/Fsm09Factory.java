/**
 */
package fsm09;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsm09.Fsm09Package
 * @generated
 */
public interface Fsm09Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fsm09Factory eINSTANCE = fsm09.impl.Fsm09FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State</em>'.
	 * @generated
	 */
	SuperState createSuperState();

	/**
	 * Returns a new object of class '<em>Automate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automate</em>'.
	 * @generated
	 */
	Automate createAutomate();

	/**
	 * Returns a new object of class '<em>Conditional State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional State</em>'.
	 * @generated
	 */
	ConditionalState createConditionalState();

	/**
	 * Returns a new object of class '<em>Starter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Starter</em>'.
	 * @generated
	 */
	Starter createStarter();

	/**
	 * Returns a new object of class '<em>Individual State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual State</em>'.
	 * @generated
	 */
	IndividualState createIndividualState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fsm09Package getFsm09Package();

} //Fsm09Factory
