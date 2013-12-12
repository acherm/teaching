package cao2009_sol;

import cao2009_sol.A;
import cao2009_sol.AspectA;
import cao2009_sol.AspectAutomate;
import fsm09.Automate;
import fsm09.Fsm09Package;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;

@SuppressWarnings("all")
public class CAO2009 {
  public Automate loadPollSystem(final URI uri) {
    Automate _xblockexpression = null;
    {
      this.doEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = (((Automate) _get));
    }
    return _xblockexpression;
  }
  
  public Object doEMFRegistration() {
    Object _xblockexpression = null;
    {
      Fsm09Package.eINSTANCE.eClass();
      final Registry reg = Registry.INSTANCE;
      final Map<String,Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      Object _put = m.put("xmi", _xMIResourceFactoryImpl);
      _xblockexpression = (_put);
    }
    return _xblockexpression;
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
  public void test1() {
    A _a = new A();
    A x = _a;
    x.abc();
    AspectA.abcd(x);
    URI _createURI = URI.createURI("../CAO2009/AutomateCDPlayer-extended.xmi");
    final Automate aut = this.loadPollSystem(_createURI);
    String _plus = ("aut:" + aut);
    InputOutput.<String>println(_plus);
    AspectAutomate.unfoldAll(aut);
    URI _createURI_1 = URI.createURI("../CAO2009/AutomateCDPlayer-extendedu.xmi");
    this.saveAutomate(_createURI_1, aut);
  }
}
