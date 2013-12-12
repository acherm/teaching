package cao2009_sol

import fr.inria.triskell.k3.Aspect
import fsm09.Starter
import fsm09.SuperState
import fsm09.Transition
import fsm09.impl.Fsm09FactoryImpl
import java.util.HashSet


/*
 * weaving unfolding and folding capabilities into the right place (SuperState)
 * (basically a retranscript of Kermeta code into Xtend) 
 */
@Aspect(className=typeof(SuperState))
class AspectSuperState {
	
		
	def void unfoldingTransitions() {
		_self.outgoingTransitions.forEach[tr |
			
			val etiquette = tr.etiquette
			println(("Unfolding..." + etiquette))
			
			val target = tr.target 
				
		// construct a new transition for each state contained in the super state
			_self.children.forEach [ st |
			
			if (!(st instanceof Starter)) {
			
			val newTr = Fsm09FactoryImpl.eINSTANCE.createTransition
			newTr.etiquette = etiquette
			newTr.source = st
			newTr.target = target
			
			st.outgoingTransitions.add(newTr)
			}
			
			]
			
		]		
		
		// "unfolded" transitions can be removed 
		//_self.outgoingTransitions.clear
	}
	
	
	// transitions of a contained state that have the same etiquette and target
	// are transformed into an unique transition that will belong to the super state 
	
	
	def void foldTransitions() {
	   val toFolds = new HashSet<Transition>()
	   
	   
	   val transitions = _self.collectTransitions()
		transitions.forEach[ Transition tr1 |
				transitions.forEach [ Transition tr2 |
					val b12 = tr1.etiquette.equals(tr2.etiquette) && tr1.target.equals(tr2.target) // AspectSuperState::equivalent (tr1, tr2) 
					if (tr1 != tr2 && b12) {
						if (!toFolds.contains(tr2) && !toFolds.contains(tr1)) {
							toFolds.add(tr1)
						}
					}
				]
				
		]			
	
		toFolds.forEach [ tr |
		
			val etiquette = tr.etiquette
			println ("folding..." + etiquette) 

			val target = tr.target
			
			val newTransition = Fsm09FactoryImpl.eINSTANCE.createTransition
			newTransition.etiquette = etiquette
			newTransition.source = _self
			newTransition.target = target
			_self.outgoingTransitions.add (newTransition)
		
		]
		
	}
	
	
	def collectTransitions() {
		val transitions = new HashSet<Transition>()
		_self.children.forEach [ st1 |											
				transitions.addAll(st1.outgoingTransitions)				
		]	
		transitions
	}
	
	def static boolean equivalent (Transition t1, Transition t2) {
		t1.etiquette.equals(t2.etiquette) && t1.target.equals(t2.target)
	}
}