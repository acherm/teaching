/**
 */
package fsm09.impl;

import fsm09.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fsm09FactoryImpl extends EFactoryImpl implements Fsm09Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fsm09Factory init() {
		try {
			Fsm09Factory theFsm09Factory = (Fsm09Factory)EPackage.Registry.INSTANCE.getEFactory(Fsm09Package.eNS_URI);
			if (theFsm09Factory != null) {
				return theFsm09Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fsm09FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm09FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Fsm09Package.SUPER_STATE: return createSuperState();
			case Fsm09Package.AUTOMATE: return createAutomate();
			case Fsm09Package.CONDITIONAL_STATE: return createConditionalState();
			case Fsm09Package.STARTER: return createStarter();
			case Fsm09Package.INDIVIDUAL_STATE: return createIndividualState();
			case Fsm09Package.TRANSITION: return createTransition();
			case Fsm09Package.ACTION: return createAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperState createSuperState() {
		SuperStateImpl superState = new SuperStateImpl();
		return superState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automate createAutomate() {
		AutomateImpl automate = new AutomateImpl();
		return automate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalState createConditionalState() {
		ConditionalStateImpl conditionalState = new ConditionalStateImpl();
		return conditionalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Starter createStarter() {
		StarterImpl starter = new StarterImpl();
		return starter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualState createIndividualState() {
		IndividualStateImpl individualState = new IndividualStateImpl();
		return individualState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm09Package getFsm09Package() {
		return (Fsm09Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fsm09Package getPackage() {
		return Fsm09Package.eINSTANCE;
	}

} //Fsm09FactoryImpl
