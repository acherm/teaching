package cao2009_sol

import fr.inria.triskell.k3.Aspect
import fsm09.Automate
import fsm09.SuperState

import static extension cao2009_sol.AspectSuperState.* 

@Aspect(className=typeof(Automate))
class AspectAutomate {
	
	
	def unfoldAll() {
	
	_self.states.forEach [ state |
	    
		if (state instanceof SuperState) {
			println("Unfolding")
			val sState = state as SuperState
			sState.unfoldingTransitions()
		}
		
		]

	} 
}