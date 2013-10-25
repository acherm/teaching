package fr.irisa.triskell.idm;

import fr.inria.triskell.k3.Aspect
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference

@Aspect(className=typeof(EClass))
class EClassAspect {
	
	String id
	
	def String flat(String tab) {
		var String out = tab + _self.name + " : " 
		out = out  + "\n" + tab + "\t id : " + _self.id
		for (EClass superType : _self.ESuperTypes) {
			out = out + "\n" + superType.flat(tab + "\t");
		}
		return out		
	}
	
	def String _short(String tab) {
		var out = tab + _self.name + " : " 
		out = out  + "\n" + tab + "\t id : " + _self.id
		
		// Attributes
		for (EAttribute attr : _self.EAttributes) {
			out = out + "\n" + tab + "\t attr " + attr.name + " : " + attr.EType.name
		}
		
		// Operations
		for (EOperation op: _self.EOperations) {
			out = out + "\n" + tab + "\t op " + op.name + " ("
			var first = true
			for (EParameter parameter : op.EParameters) {
				if (first) {
					first = false	
				} else {
					out = out + (", ")
				}
				
				out = out + parameter.name + " : " + parameter.EType.name
				 				
			}
			out = out + ") : " + op.EType.name
		}
		
		// References
		for (EReference ref : _self.EReferences) {
			out = out + "\n" + tab + "\t ref " + ref.name + " : " + ref.EType.name 
			out = out + "[" + ref.lowerBound + ".."
			if (ref.upperBound == -1) {
				out = out + "*]"
			} else {
				out = out + ref.upperBound + "]"
			}
		}
		
		return out
	} 	 	 
	

		
	def String flatShort(String tab) {
		var out = _self._short(tab)
		for (EClass superType : _self.ESuperTypes) {
			out = out + "\n" + superType.flatShort(tab + "\t");
		}
		return out
	}
	
	
	def void assignIdentifier() {
		_self.id = _self.name.hashCode + "_" + System.currentTimeMillis
	}
	

}

