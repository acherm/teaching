package fr.inria.k3.questionnaire;

import com.google.common.base.Objects;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.example.mydsl.QuestionnaireStandaloneSetupGenerated;
import org.xtext.example.mydsl.questionnaire.Option;
import org.xtext.example.mydsl.questionnaire.Poll;
import org.xtext.example.mydsl.questionnaire.PollSystem;
import org.xtext.example.mydsl.questionnaire.Question;

@SuppressWarnings("all")
public class QuestionnaireDemonstrations {
  public PollSystem loadPollSystem(final URI uri) {
    PollSystem _xblockexpression = null;
    {
      QuestionnaireStandaloneSetupGenerated _questionnaireStandaloneSetupGenerated = new QuestionnaireStandaloneSetupGenerated();
      _questionnaireStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = (((PollSystem) _get));
    }
    return _xblockexpression;
  }
  
  public void savePollSystem(final URI uri, final PollSystem pollS) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(pollS);
      HashMap<Object,Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void test1() {
    URI _createURI = URI.createURI("foo1.q");
    PollSystem pollS = this.loadPollSystem(_createURI);
    Assert.assertNotNull(pollS);
    EList<Poll> _polls = pollS.getPolls();
    int _size = _polls.size();
    Assert.assertEquals(2, _size);
    URI _createURI_1 = URI.createURI("foo1.xmi");
    this.savePollSystem(_createURI_1, pollS);
    EList<Poll> _polls_1 = pollS.getPolls();
    final Procedure1<Poll> _function = new Procedure1<Poll>() {
      public void apply(final Poll p) {
        String _name = p.getName();
        String _plus = (_name + "_poll");
        p.setName(_plus);
      }
    };
    IterableExtensions.<Poll>forEach(_polls_1, _function);
    URI _createURI_2 = URI.createURI("foo2.q");
    this.savePollSystem(_createURI_2, pollS);
  }
  
  @Test
  public void test2() {
    try {
      URI _createURI = URI.createURI("foo1.q");
      PollSystem pollS = this.loadPollSystem(_createURI);
      EList<Poll> _polls = pollS.getPolls();
      CharSequence html = this.toPolls(_polls);
      Assert.assertNotNull(html);
      FileWriter _fileWriter = new FileWriter("foo1.html");
      final FileWriter fw = _fileWriter;
      String _string = html.toString();
      fw.write(_string);
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence toPolls(final List<Poll> polls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    {
      for(final Poll p : polls) {
        {
          String _name = p.getName();
          boolean _notEquals = (!Objects.equal(_name, null));
          if (_notEquals) {
            _builder.append("    ");
            _builder.append("<h1>");
            String _name_1 = p.getName();
            _builder.append(_name_1, "    ");
            _builder.append("</h1>");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Question> _questions = p.getQuestions();
          for(final Question q : _questions) {
            _builder.append("    ");
            _builder.append("<p>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("\t");
            _builder.append("<h2>");
            String _text = q.getText();
            _builder.append(_text, "    	");
            _builder.append("</h2>");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("\t");
            _builder.append("<ul>");
            _builder.newLine();
            {
              EList<Option> _options = q.getOptions();
              for(final Option o : _options) {
                _builder.append("    ");
                _builder.append("\t ");
                _builder.append("<li>");
                String _text_1 = o.getText();
                _builder.append(_text_1, "    	 ");
                _builder.append("</li>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("    ");
            _builder.append("\t");
            _builder.append("</ul>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("</p>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("  ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
