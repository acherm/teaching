/**
 */
package fsm09;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm09.SuperState#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm09.Fsm09Package#getSuperState()
 * @model
 * @generated
 */
public interface SuperState extends State {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link fsm09.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see fsm09.Fsm09Package#getSuperState_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getChildren();

} // SuperState
