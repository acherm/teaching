package fr.irisa.triskell.idm;

import com.google.common.collect.Iterables;
import fr.irisa.triskell.idm.EClassAspect;
import fr.irisa.triskell.idm.EcoreLoader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEClassAspect {
  @Test
  public void test() {
    InputOutput.<String>println("With aspects");
    EcoreLoader _ecoreLoader = new EcoreLoader();
    final EcoreLoader loader = _ecoreLoader;
    final EPackage metamodel = loader.loadModel("spreadsheet.ecore");
    EList<EClassifier> _eClassifiers = metamodel.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass aClass : _filter) {
      EClassAspect.assignIdentifier(aClass);
    }
    InputOutput.<String>println("--- Flat ---");
    EList<EClassifier> _eClassifiers_1 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_1 = Iterables.<EClass>filter(_eClassifiers_1, EClass.class);
    for (final EClass aClass_1 : _filter_1) {
      String _flat = EClassAspect.flat(aClass_1, "");
      InputOutput.<String>println(_flat);
    }
    InputOutput.println();
    InputOutput.<String>println("--- Short ---");
    EList<EClassifier> _eClassifiers_2 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_2 = Iterables.<EClass>filter(_eClassifiers_2, EClass.class);
    for (final EClass aClass_2 : _filter_2) {
      String __short = EClassAspect._short(aClass_2, "");
      InputOutput.<String>println(__short);
    }
    InputOutput.println();
    InputOutput.<String>println("--- Flat Short ---");
    EList<EClassifier> _eClassifiers_3 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_3 = Iterables.<EClass>filter(_eClassifiers_3, EClass.class);
    for (final EClass aClass_3 : _filter_3) {
      String _flatShort = EClassAspect.flatShort(aClass_3, "");
      InputOutput.<String>println(_flatShort);
    }
  }
}
