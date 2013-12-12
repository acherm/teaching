import fsm09.Automate
import fsm09.Fsm09Package
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test

class HelloWorld {
	
	@Test
	def void test1() {
		println("Hello world!")
	}
	
	 def loadAutomate(URI uri) {
	 		
			    doEMFRegistration();
			    // Obtain a new resource set
			    val resSet = new ResourceSetImpl();
			
			    // Get the resource
			    val resource = resSet.getResource(uri, true);
			        
			    // Get the first model element and cast it to the right type, in my
			    // example everything is hierarchical included in this first node
			    return resource.getContents().get(0) as Automate;
			    
        }
	
	def doEMFRegistration() {
		
		/*
	// Create a resource set to hold the resources.
		//
		val resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(Fsm09Package.eNS_URI, 
			 Fsm09Package.eINSTANCE);*/


	
	}
        
        def saveAutomate(URI uri, Automate aut) {
                var Resource rs = new ResourceSetImpl().createResource(uri); 
                rs.getContents.add(aut); 
                rs.save(new HashMap());
        }
        
        @Test
        def test2() {
                
                // loading
                var pollS = loadAutomate(URI::createURI("foo1.xm1")) 
           
              

                // serializing
                saveAutomate(URI.createURI("foo2.q"), pollS)             
                 
                        
        }
}