package cao2009_sol;

import cao2009_sol.A;
import cao2009_sol.AspectAAAspectProperties;
import fr.inria.triskell.k3.Aspect;

@Aspect(className = A.class)
@SuppressWarnings("all")
public class AspectA {
  public static int abcd(final A _self) {
    cao2009_sol.AspectAAAspectContext _instance = cao2009_sol.AspectAAAspectContext.getInstance();
    				    java.util.Map<cao2009_sol.A,cao2009_sol.AspectAAAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectAAAspectProperties prop = new cao2009_sol.AspectAAAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privabcd(_self); 
  }
  
  public static int YYY(final A _self) {
    cao2009_sol.AspectAAAspectContext _instance = cao2009_sol.AspectAAAspectContext.getInstance();
    				    java.util.Map<cao2009_sol.A,cao2009_sol.AspectAAAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectAAAspectProperties prop = new cao2009_sol.AspectAAAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privYYY(_self); 
  }
  
  public static AspectAAAspectProperties _self_;
  
  public static int x(final A _self) {
    cao2009_sol.AspectAAAspectContext _instance = cao2009_sol.AspectAAAspectContext.getInstance();
    				    java.util.Map<cao2009_sol.A,cao2009_sol.AspectAAAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectAAAspectProperties prop = new cao2009_sol.AspectAAAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privx(_self); 
  }
  
  protected static int privabcd(final A _self) {
    return 13;
  }
  
  protected static int privYYY(final A _self) {
    return 87;
  }
  
  protected static int privx(final A _self) {
     return cao2009_sol.AspectA._self_.x; 
  }
}
