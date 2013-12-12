package cao2009_sol;

import cao2009_sol.AspectSuperStateSuperStateAspectProperties;
import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fsm09.Starter;
import fsm09.State;
import fsm09.SuperState;
import fsm09.Transition;
import fsm09.impl.Fsm09FactoryImpl;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * weaving unfolding and folding capabilities into the right place (SuperState)
 * (basically a retranscript of Kermeta code into Xtend)
 */
@Aspect(className = SuperState.class)
@SuppressWarnings("all")
public class AspectSuperState {
  public static void unfoldingTransitions(final SuperState _self) {
    cao2009_sol.AspectSuperStateSuperStateAspectContext _instance = cao2009_sol.AspectSuperStateSuperStateAspectContext.getInstance();
    				    java.util.Map<fsm09.SuperState,cao2009_sol.AspectSuperStateSuperStateAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectSuperStateSuperStateAspectProperties prop = new cao2009_sol.AspectSuperStateSuperStateAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privunfoldingTransitions(_self); 
  }
  
  public static void foldTransitions(final SuperState _self) {
    cao2009_sol.AspectSuperStateSuperStateAspectContext _instance = cao2009_sol.AspectSuperStateSuperStateAspectContext.getInstance();
    				    java.util.Map<fsm09.SuperState,cao2009_sol.AspectSuperStateSuperStateAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectSuperStateSuperStateAspectProperties prop = new cao2009_sol.AspectSuperStateSuperStateAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privfoldTransitions(_self); 
  }
  
  public static HashSet<Transition> collectTransitions(final SuperState _self) {
    cao2009_sol.AspectSuperStateSuperStateAspectContext _instance = cao2009_sol.AspectSuperStateSuperStateAspectContext.getInstance();
    				    java.util.Map<fsm09.SuperState,cao2009_sol.AspectSuperStateSuperStateAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectSuperStateSuperStateAspectProperties prop = new cao2009_sol.AspectSuperStateSuperStateAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privcollectTransitions(_self); 
  }
  
  public static boolean equivalent(final SuperState _self, final Transition t1, final Transition t2) {
    cao2009_sol.AspectSuperStateSuperStateAspectContext _instance = cao2009_sol.AspectSuperStateSuperStateAspectContext.getInstance();
    				    java.util.Map<fsm09.SuperState,cao2009_sol.AspectSuperStateSuperStateAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						cao2009_sol.AspectSuperStateSuperStateAspectProperties prop = new cao2009_sol.AspectSuperStateSuperStateAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privequivalent(_self,t1,t2); 
  }
  
  public static AspectSuperStateSuperStateAspectProperties _self_;
  
  protected static void privunfoldingTransitions(final SuperState _self) {
    EList<Transition> _outgoingTransitions = _self.getOutgoingTransitions();
    final Procedure1<Transition> _function = new Procedure1<Transition>() {
      public void apply(final Transition tr) {
        final String etiquette = tr.getEtiquette();
        String _plus = ("Unfolding..." + etiquette);
        InputOutput.<String>println(_plus);
        final State target = tr.getTarget();
        EList<State> _children = _self.getChildren();
        final Procedure1<State> _function = new Procedure1<State>() {
          public void apply(final State st) {
            boolean _not = (!(st instanceof Starter));
            if (_not) {
              final Transition newTr = Fsm09FactoryImpl.eINSTANCE.createTransition();
              newTr.setEtiquette(etiquette);
              newTr.setSource(st);
              newTr.setTarget(target);
              EList<Transition> _outgoingTransitions = st.getOutgoingTransitions();
              _outgoingTransitions.add(newTr);
            }
          }
        };
        IterableExtensions.<State>forEach(_children, _function);
      }
    };
    IterableExtensions.<Transition>forEach(_outgoingTransitions, _function);
  }
  
  protected static void privfoldTransitions(final SuperState _self) {
    HashSet<Transition> _hashSet = new HashSet<Transition>();
    final HashSet<Transition> toFolds = _hashSet;
    final HashSet<Transition> transitions = AspectSuperState.collectTransitions(_self);
    final Procedure1<Transition> _function = new Procedure1<Transition>() {
      public void apply(final Transition tr1) {
        final Procedure1<Transition> _function = new Procedure1<Transition>() {
          public void apply(final Transition tr2) {
            boolean _and = false;
            String _etiquette = tr1.getEtiquette();
            String _etiquette_1 = tr2.getEtiquette();
            boolean _equals = _etiquette.equals(_etiquette_1);
            if (!_equals) {
              _and = false;
            } else {
              State _target = tr1.getTarget();
              State _target_1 = tr2.getTarget();
              boolean _equals_1 = _target.equals(_target_1);
              _and = (_equals && _equals_1);
            }
            final boolean b12 = _and;
            boolean _and_1 = false;
            boolean _notEquals = (!Objects.equal(tr1, tr2));
            if (!_notEquals) {
              _and_1 = false;
            } else {
              _and_1 = (_notEquals && b12);
            }
            if (_and_1) {
              boolean _and_2 = false;
              boolean _contains = toFolds.contains(tr2);
              boolean _not = (!_contains);
              if (!_not) {
                _and_2 = false;
              } else {
                boolean _contains_1 = toFolds.contains(tr1);
                boolean _not_1 = (!_contains_1);
                _and_2 = (_not && _not_1);
              }
              if (_and_2) {
                toFolds.add(tr1);
              }
            }
          }
        };
        IterableExtensions.<Transition>forEach(transitions, _function);
      }
    };
    IterableExtensions.<Transition>forEach(transitions, _function);
    final Procedure1<Transition> _function_1 = new Procedure1<Transition>() {
      public void apply(final Transition tr) {
        final String etiquette = tr.getEtiquette();
        String _plus = ("folding..." + etiquette);
        InputOutput.<String>println(_plus);
        final State target = tr.getTarget();
        final Transition newTransition = Fsm09FactoryImpl.eINSTANCE.createTransition();
        newTransition.setEtiquette(etiquette);
        newTransition.setSource(_self);
        newTransition.setTarget(target);
        EList<Transition> _outgoingTransitions = _self.getOutgoingTransitions();
        _outgoingTransitions.add(newTransition);
      }
    };
    IterableExtensions.<Transition>forEach(toFolds, _function_1);
  }
  
  protected static HashSet<Transition> privcollectTransitions(final SuperState _self) {
    HashSet<Transition> _xblockexpression = null;
    {
      HashSet<Transition> _hashSet = new HashSet<Transition>();
      final HashSet<Transition> transitions = _hashSet;
      EList<State> _children = _self.getChildren();
      final Procedure1<State> _function = new Procedure1<State>() {
        public void apply(final State st1) {
          EList<Transition> _outgoingTransitions = st1.getOutgoingTransitions();
          transitions.addAll(_outgoingTransitions);
        }
      };
      IterableExtensions.<State>forEach(_children, _function);
      _xblockexpression = (transitions);
    }
    return _xblockexpression;
  }
  
  protected static boolean privequivalent(final SuperState _self, final Transition t1, final Transition t2) {
    boolean _and = false;
    String _etiquette = t1.getEtiquette();
    String _etiquette_1 = t2.getEtiquette();
    boolean _equals = _etiquette.equals(_etiquette_1);
    if (!_equals) {
      _and = false;
    } else {
      State _target = t1.getTarget();
      State _target_1 = t2.getTarget();
      boolean _equals_1 = _target.equals(_target_1);
      _and = (_equals && _equals_1);
    }
    return _and;
  }
}
