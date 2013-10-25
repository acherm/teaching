package fr.irisa.triskell.idm;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class EcoreHelper {
  private Map<EClass,String> ids = new Function0<Map<EClass,String>>() {
    public Map<EClass,String> apply() {
      HashMap<EClass,String> _hashMap = new HashMap<EClass, String>();
      return _hashMap;
    }
  }.apply();
  
  public String flat(final EClass aClass, final String tab) {
    String _name = aClass.getName();
    String _plus = (tab + _name);
    String out = (_plus + " : ");
    String _plus_1 = (out + "\n");
    String _plus_2 = (_plus_1 + tab);
    String _plus_3 = (_plus_2 + "\t id : ");
    String _get = this.ids.get(aClass);
    String _plus_4 = (_plus_3 + _get);
    out = _plus_4;
    EList<EClass> _eSuperTypes = aClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      String _plus_5 = (out + "\n");
      String _plus_6 = (tab + "\t");
      String _flat = this.flat(superType, _plus_6);
      String _plus_7 = (_plus_5 + _flat);
      out = _plus_7;
    }
    return out;
  }
  
  public String _short(final EClass aClass, final String tab) {
    String _name = aClass.getName();
    String _plus = (tab + _name);
    String out = (_plus + " : ");
    String _plus_1 = (out + "\n");
    String _plus_2 = (_plus_1 + tab);
    String _plus_3 = (_plus_2 + "\t id : ");
    String _get = this.ids.get(aClass);
    String _plus_4 = (_plus_3 + _get);
    out = _plus_4;
    EList<EAttribute> _eAttributes = aClass.getEAttributes();
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
    EList<EOperation> _eOperations = aClass.getEOperations();
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
    EList<EReference> _eReferences = aClass.getEReferences();
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
        String _xifexpression = null;
        int _upperBound = ref.getUpperBound();
        int _minus = (-1);
        boolean _equals = (_upperBound == _minus);
        if (_equals) {
          _xifexpression = "*]";
        } else {
          int _upperBound_1 = ref.getUpperBound();
          String _plus_20 = (Integer.valueOf(_upperBound_1) + "]");
          _xifexpression = _plus_20;
        }
        String _plus_21 = (out + _xifexpression);
        out = _plus_21;
      }
    }
    return out;
  }
  
  public String flatShort(final EClass aClass, final String tab) {
    String out = this._short(aClass, tab);
    EList<EClass> _eSuperTypes = aClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      String _plus = (out + "\n");
      String _plus_1 = (tab + "\t");
      String _flatShort = this.flatShort(superType, _plus_1);
      String _plus_2 = (_plus + _flatShort);
      out = _plus_2;
    }
    return out;
  }
  
  public void assignIdentifier(final EClass aClass) {
    String _name = aClass.getName();
    int _hashCode = _name.hashCode();
    String _plus = (Integer.valueOf(_hashCode) + "_");
    long _currentTimeMillis = System.currentTimeMillis();
    String _plus_1 = (_plus + Long.valueOf(_currentTimeMillis));
    this.ids.put(aClass, _plus_1);
  }
}
