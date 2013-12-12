/**
 */
package fsm09;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm09.IndividualState#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm09.Fsm09Package#getIndividualState()
 * @model
 * @generated
 */
public interface IndividualState extends State {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fsm09.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fsm09.Fsm09Package#getIndividualState_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // IndividualState
