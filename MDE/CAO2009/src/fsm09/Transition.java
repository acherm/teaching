/**
 */
package fsm09;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm09.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fsm09.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link fsm09.Transition#getEtiquette <em>Etiquette</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm09.Fsm09Package#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsm09.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see fsm09.Fsm09Package#getTransition_Source()
	 * @see fsm09.State#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link fsm09.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fsm09.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see fsm09.Fsm09Package#getTransition_Target()
	 * @see fsm09.State#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link fsm09.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Etiquette</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiquette</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiquette</em>' attribute.
	 * @see #setEtiquette(String)
	 * @see fsm09.Fsm09Package#getTransition_Etiquette()
	 * @model
	 * @generated
	 */
	String getEtiquette();

	/**
	 * Sets the value of the '{@link fsm09.Transition#getEtiquette <em>Etiquette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiquette</em>' attribute.
	 * @see #getEtiquette()
	 * @generated
	 */
	void setEtiquette(String value);

} // Transition
