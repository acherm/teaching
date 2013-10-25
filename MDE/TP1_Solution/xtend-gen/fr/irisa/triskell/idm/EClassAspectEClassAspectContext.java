package fr.irisa.triskell.idm;

import fr.irisa.triskell.idm.EClassAspectEClassAspectProperties;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EClassAspectEClassAspectContext {
  public final static EClassAspectEClassAspectContext INSTANCE = new EClassAspectEClassAspectContext();
  
  public static EClassAspectEClassAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EClass,EClassAspectEClassAspectProperties> map = new java.util.HashMap<EClass, fr.irisa.triskell.idm.EClassAspectEClassAspectProperties>();
  
  public Map<EClass,EClassAspectEClassAspectProperties> getMap() {
    return map;
  }
}
