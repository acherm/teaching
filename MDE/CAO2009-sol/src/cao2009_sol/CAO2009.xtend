package cao2009_sol

import fsm09.Automate
import fsm09.Fsm09Package
import fsm09.impl.SuperStateImpl
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Test


import static extension cao2009_sol.AspectA.* 
import static extension cao2009_sol.AspectAutomate.* 

class CAO2009 {
	
	 def loadPollSystem(URI uri) {
                doEMFRegistration()
                var res = new ResourceSetImpl().getResource(uri, true);
                res.contents.get(0) as Automate
        }
	
	def doEMFRegistration() {
		//org.eclipse.xtext.resource.IResourceFactory resourceFactory =
		
		Fsm09Package.eINSTANCE.eClass(); 
		val reg = Resource.Factory.Registry.INSTANCE;
		val m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		
		
		//org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = //injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", resourceFactory);
		//org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", serviceProvider);
		//http://fsm09/1.0
	}
        
        def saveAutomate(URI uri, Automate aut) {
                var Resource rs = new ResourceSetImpl().createResource(uri); 
                rs.getContents.add(aut); 
                rs.save(new HashMap());
        }
        
        @Test
        def void test1() {
        	
        
               var A x = new A()
               x.abc 
               x.abcd
                
                // loading
               val aut = loadPollSystem(URI::createURI("../CAO2009/AutomateCDPlayer-extended.xmi")) 
               println("aut:" + aut)
               aut.unfoldAll
               saveAutomate(URI::createURI("../CAO2009/AutomateCDPlayer-extendedu.xmi"), aut)
               
              
              // p.unfolding()  
              //  savePollSystem(URI::createURI("foo1.xmi"), aut)
                
              
                
                 
                        
        }
}