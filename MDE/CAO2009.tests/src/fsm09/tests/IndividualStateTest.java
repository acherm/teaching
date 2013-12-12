/**
 */
package fsm09.tests;

import fsm09.Fsm09Factory;
import fsm09.IndividualState;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualStateTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualStateTest.class);
	}

	/**
	 * Constructs a new Individual State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndividualState getFixture() {
		return (IndividualState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Fsm09Factory.eINSTANCE.createIndividualState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IndividualStateTest
