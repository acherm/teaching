package fr.irisa.triskell.idm;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

@SuppressWarnings("all")
public class EcoreLoader {
  public EPackage loadModel(final String path) {
    EcoreResourceFactoryImpl _ecoreResourceFactoryImpl = new EcoreResourceFactoryImpl();
    EcoreResourceFactoryImpl fact = _ecoreResourceFactoryImpl;
    boolean _containsKey = Registry.INSTANCE.containsKey(EcorePackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    }
    Map<String,Object> _extensionToFactoryMap = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("ecore", fact);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSetImpl rs = _resourceSetImpl;
    URI uri = URI.createURI(path);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    EPackage p = ((EPackage) _get);
    return p;
  }
}
