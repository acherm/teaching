package cao2009_sol;

import cao2009_sol.AspectSuperStateSuperStateAspectProperties;
import fsm09.SuperState;
import java.util.Map;

@SuppressWarnings("all")
public class AspectSuperStateSuperStateAspectContext {
  public final static AspectSuperStateSuperStateAspectContext INSTANCE = new AspectSuperStateSuperStateAspectContext();
  
  public static AspectSuperStateSuperStateAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<SuperState,AspectSuperStateSuperStateAspectProperties> map = new java.util.HashMap<fsm09.SuperState, cao2009_sol.AspectSuperStateSuperStateAspectProperties>();
  
  public Map<SuperState,AspectSuperStateSuperStateAspectProperties> getMap() {
    return map;
  }
}
