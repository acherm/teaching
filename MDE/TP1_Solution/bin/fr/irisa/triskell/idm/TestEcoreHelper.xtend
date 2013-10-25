package fr.irisa.triskell.idm;

import org.eclipse.emf.ecore.EClass
import org.junit.Test
class TestEcoreHelper {

	@Test
	def void test() {
		println("Without aspects")
		
		val loader = new EcoreLoader
		val docHelper = new EcoreHelper()
		val metamodel = loader.loadModel("spreadsheet.ecore")
		
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			docHelper.assignIdentifier(aClass)	
		}
		
		println("--- Flat ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.flat(aClass, ""));
		}
		
		println
		
		println("--- Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper._short(aClass, ""));	
		}
		
		println
	
		println("--- Flat Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.flatShort(aClass, ""));	
		}
	}
	
	

}
