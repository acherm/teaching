package cao2009_sol;

import cao2009_sol.AspectAutomateAutomateAspectProperties;
import cao2009_sol.AspectSuperState;
import fr.inria.triskell.k3.Aspect;
import fsm09.Automate;
import fsm09.State;
import fsm09.SuperState;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = Automate.class)
@SuppressWarnings("all")
public class AspectAutomate {
  public static void unfoldAll(final Automate _self) {
    cao2009_sol.AspectAutomateAutomateAspectContext _instance = cao2009_sol.AspectAutomateAutomateAspectContext.getInstance();
    				    java.util.Map<fsm09.Automate,cao2009_sol.AspectAutomateAutomateAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectAutomateAutomateAspectProperties prop = new cao2009_sol.AspectAutomateAutomateAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privunfoldAll(_self); 
  }
  
  public static AspectAutomateAutomateAspectProperties _self_;
  
  protected static void privunfoldAll(final Automate _self) {
    EList<State> _states = _self.getStates();
    final Procedure1<State> _function = new Procedure1<State>() {
      public void apply(final State state) {
        if ((state instanceof SuperState)) {
          InputOutput.<String>println("Unfolding");
          final SuperState sState = ((SuperState) state);
          AspectSuperState.unfoldingTransitions(sState);
        }
      }
    };
    IterableExtensions.<State>forEach(_states, _function);
  }
}
