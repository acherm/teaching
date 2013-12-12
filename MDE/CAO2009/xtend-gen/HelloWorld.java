import fsm09.Automate;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;

@SuppressWarnings("all")
public class HelloWorld {
  @Test
  public void test1() {
    InputOutput.<String>println("Hello world!");
  }
  
  public Automate loadAutomate(final URI uri) {
    this.doEMFRegistration();
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resSet = _resourceSetImpl;
    final Resource resource = resSet.getResource(uri, true);
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    return ((Automate) _get);
  }
  
  public Object doEMFRegistration() {
    return null;
  }
  
  public void saveAutomate(final URI uri, final Automate aut) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(aut);
      HashMap<Object,Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void test2() {
    URI _createURI = URI.createURI("foo1.xm1");
    Automate pollS = this.loadAutomate(_createURI);
    URI _createURI_1 = URI.createURI("foo2.q");
    this.saveAutomate(_createURI_1, pollS);
  }
}
