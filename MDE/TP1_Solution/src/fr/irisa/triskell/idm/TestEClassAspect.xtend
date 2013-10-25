package fr.irisa.triskell.idm

import org.eclipse.emf.ecore.EClass
import org.junit.Test


import static extension fr.irisa.triskell.idm.EClassAspect.*

class TestEClassAspect {
	@Test
	def void test() {
		println("With aspects")
		
		val loader = new EcoreLoader
		val metamodel = loader.loadModel("spreadsheet.ecore")
		
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			aClass.assignIdentifier	
		}
		
		println("--- Flat ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(aClass.flat(""))
		}
		println
		
		println("--- Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(aClass._short(""))
		}
		println
		
		println("--- Flat Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(aClass.flatShort(""))
		}
	}
}