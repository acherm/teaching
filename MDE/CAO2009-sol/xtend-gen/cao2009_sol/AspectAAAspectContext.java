package cao2009_sol;

import cao2009_sol.A;
import cao2009_sol.AspectAAAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AspectAAAspectContext {
  public final static AspectAAAspectContext INSTANCE = new AspectAAAspectContext();
  
  public static AspectAAAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<A,AspectAAAspectProperties> map = new java.util.HashMap<cao2009_sol.A, cao2009_sol.AspectAAAspectProperties>();
  
  public Map<A,AspectAAAspectProperties> getMap() {
    return map;
  }
}
