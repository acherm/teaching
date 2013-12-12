package cao2009_sol;

import cao2009_sol.AspectAutomateAutomateAspectProperties;
import fsm09.Automate;
import java.util.Map;

@SuppressWarnings("all")
public class AspectAutomateAutomateAspectContext {
  public final static AspectAutomateAutomateAspectContext INSTANCE = new AspectAutomateAutomateAspectContext();
  
  public static AspectAutomateAutomateAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Automate,AspectAutomateAutomateAspectProperties> map = new java.util.HashMap<fsm09.Automate, cao2009_sol.AspectAutomateAutomateAspectProperties>();
  
  public Map<Automate,AspectAutomateAutomateAspectProperties> getMap() {
    return map;
  }
}
