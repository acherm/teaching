package fr.irisa.triskell.idm;

import fr.inria.triskell.k3.Aspect;
import fr.irisa.triskell.idm.EClassAspectEClassAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

@Aspect(className = EClass.class)
@SuppressWarnings("all")
public class EClassAspect {
  public static String flat(final EClass _self, final String tab) {
    fr.irisa.triskell.idm.EClassAspectEClassAspectContext _instance = fr.irisa.triskell.idm.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<EClass,fr.irisa.triskell.idm.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						fr.irisa.triskell.idm.EClassAspectEClassAspectProperties prop = new fr.irisa.triskell.idm.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privflat(_self,tab); 
  }
  
  public static String _short(final EClass _self, final String tab) {
    fr.irisa.triskell.idm.EClassAspectEClassAspectContext _instance = fr.irisa.triskell.idm.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<EClass,fr.irisa.triskell.idm.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						fr.irisa.triskell.idm.EClassAspectEClassAspectProperties prop = new fr.irisa.triskell.idm.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return priv_short(_self,tab); 
  }
  
  public static String flatShort(final EClass _self, final String tab) {
    fr.irisa.triskell.idm.EClassAspectEClassAspectContext _instance = fr.irisa.triskell.idm.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<EClass,fr.irisa.triskell.idm.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						fr.irisa.triskell.idm.EClassAspectEClassAspectProperties prop = new fr.irisa.triskell.idm.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privflatShort(_self,tab); 
  }
  
  public static void assignIdentifier(final EClass _self) {
    fr.irisa.triskell.idm.EClassAspectEClassAspectContext _instance = fr.irisa.triskell.idm.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<EClass,fr.irisa.triskell.idm.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						fr.irisa.triskell.idm.EClassAspectEClassAspectProperties prop = new fr.irisa.triskell.idm.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privassignIdentifier(_self); 
  }
  
  public static EClassAspectEClassAspectProperties _self_;
  
  public static String id(final EClass _self) {
    fr.irisa.triskell.idm.EClassAspectEClassAspectContext _instance = fr.irisa.triskell.idm.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<EClass,fr.irisa.triskell.idm.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						fr.irisa.triskell.idm.EClassAspectEClassAspectProperties prop = new fr.irisa.triskell.idm.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privid(_self); 
  }
  
  public static void id(final EClass _self, final String id) {
    fr.irisa.triskell.idm.EClassAspectEClassAspectContext _instance = fr.irisa.triskell.idm.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<EClass,fr.irisa.triskell.idm.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						fr.irisa.triskell.idm.EClassAspectEClassAspectProperties prop = new fr.irisa.triskell.idm.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privid(_self,id); 
  }
  
  protected static String privflat(final EClass _self, final String tab) {
    String _name = _self.getName();
    String _plus = (tab + _name);
    String out = (_plus + " : ");
    String _plus_1 = (out + "\n");
    String _plus_2 = (_plus_1 + tab);
    String _plus_3 = (_plus_2 + "\t id : ");
    String _id = EClassAspect.id(_self);
    String _plus_4 = (_plus_3 + _id);
    out = _plus_4;
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      String _plus_5 = (out + "\n");
      String _plus_6 = (tab + "\t");
      String _flat = EClassAspect.flat(superType, _plus_6);
      String _plus_7 = (_plus_5 + _flat);
      out = _plus_7;
    }
    return out;
  }
  
  protected static String priv_short(final EClass _self, final String tab) {
    String _name = _self.getName();
    String _plus = (tab + _name);
    String out = (_plus + " : ");
    String _plus_1 = (out + "\n");
    String _plus_2 = (_plus_1 + tab);
    String _plus_3 = (_plus_2 + "\t id : ");
    String _id = EClassAspect.id(_self);
    String _plus_4 = (_plus_3 + _id);
    out = _plus_4;
    EList<EAttribute> _eAttributes = _self.getEAttributes();
    for (final EAttribute attr : _eAttributes) {
      String _plus_5 = (out + "\n");
      String _plus_6 = (_plus_5 + tab);
      String _plus_7 = (_plus_6 + "\t attr ");
      String _name_1 = attr.getName();
      String _plus_8 = (_plus_7 + _name_1);
      String _plus_9 = (_plus_8 + " : ");
      EClassifier _eType = attr.getEType();
      String _name_2 = _eType.getName();
      String _plus_10 = (_plus_9 + _name_2);
      out = _plus_10;
    }
    EList<EOperation> _eOperations = _self.getEOperations();
    for (final EOperation op : _eOperations) {
      {
        String _plus_11 = (out + "\n");
        String _plus_12 = (_plus_11 + tab);
        String _plus_13 = (_plus_12 + "\t op ");
        String _name_3 = op.getName();
        String _plus_14 = (_plus_13 + _name_3);
        String _plus_15 = (_plus_14 + " (");
        out = _plus_15;
        boolean first = true;
        EList<EParameter> _eParameters = op.getEParameters();
        for (final EParameter parameter : _eParameters) {
          {
            if (first) {
              first = false;
            } else {
              String _plus_16 = (out + ", ");
              out = _plus_16;
            }
            String _name_4 = parameter.getName();
            String _plus_17 = (out + _name_4);
            String _plus_18 = (_plus_17 + " : ");
            EClassifier _eType_1 = parameter.getEType();
            String _name_5 = _eType_1.getName();
            String _plus_19 = (_plus_18 + _name_5);
            out = _plus_19;
          }
        }
        String _plus_16 = (out + ") : ");
        EClassifier _eType_1 = op.getEType();
        String _name_4 = _eType_1.getName();
        String _plus_17 = (_plus_16 + _name_4);
        out = _plus_17;
      }
    }
    EList<EReference> _eReferences = _self.getEReferences();
    for (final EReference ref : _eReferences) {
      {
        String _plus_11 = (out + "\n");
        String _plus_12 = (_plus_11 + tab);
        String _plus_13 = (_plus_12 + "\t ref ");
        String _name_3 = ref.getName();
        String _plus_14 = (_plus_13 + _name_3);
        String _plus_15 = (_plus_14 + " : ");
        EClassifier _eType_1 = ref.getEType();
        String _name_4 = _eType_1.getName();
        String _plus_16 = (_plus_15 + _name_4);
        out = _plus_16;
        String _plus_17 = (out + "[");
        int _lowerBound = ref.getLowerBound();
        String _plus_18 = (_plus_17 + Integer.valueOf(_lowerBound));
        String _plus_19 = (_plus_18 + "..");
        out = _plus_19;
        int _upperBound = ref.getUpperBound();
        int _minus = (-1);
        boolean _equals = (_upperBound == _minus);
        if (_equals) {
          String _plus_20 = (out + "*]");
          out = _plus_20;
        } else {
          int _upperBound_1 = ref.getUpperBound();
          String _plus_21 = (out + Integer.valueOf(_upperBound_1));
          String _plus_22 = (_plus_21 + "]");
          out = _plus_22;
        }
      }
    }
    return out;
  }
  
  protected static String privflatShort(final EClass _self, final String tab) {
    String out = EClassAspect._short(_self, tab);
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      String _plus = (out + "\n");
      String _plus_1 = (tab + "\t");
      String _flatShort = EClassAspect.flatShort(superType, _plus_1);
      String _plus_2 = (_plus + _flatShort);
      out = _plus_2;
    }
    return out;
  }
  
  protected static void privassignIdentifier(final EClass _self) {
    String _name = _self.getName();
    int _hashCode = _name.hashCode();
    String _plus = (Integer.valueOf(_hashCode) + "_");
    long _currentTimeMillis = System.currentTimeMillis();
    String _plus_1 = (_plus + Long.valueOf(_currentTimeMillis));
    EClassAspect.id(_self, _plus_1);
  }
  
  protected static String privid(final EClass _self) {
     return fr.irisa.triskell.idm.EClassAspect._self_.id; 
  }
  
  protected static void privid(final EClass _self, final String id) {
    fr.irisa.triskell.idm.EClassAspect._self_.id = id; 
  }
}
