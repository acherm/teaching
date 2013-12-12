package cao2009_sol

import fr.inria.triskell.k3.Aspect

public class A {
	
	val a = 9 
		
	def abc() {
		return a
	}
}


@Aspect(className=typeof(A))
class AspectA {
		
    val int x = 98		

	def abcd() {
		return 13		
	}
	
	def YYY() {
		return 87		
	}
	
}