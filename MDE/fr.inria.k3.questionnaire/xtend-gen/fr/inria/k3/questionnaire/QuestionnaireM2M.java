package fr.inria.k3.questionnaire;

import fr.inria.k3.questionnaire.Context;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.xtext.example.mydsl.questionnaire.Poll;
import org.xtext.example.mydsl.questionnaire.PollSystem;
import org.xtext.example.mydsl.questionnaire.QuestionnaireFactory;

@SuppressWarnings("all")
public class QuestionnaireM2M {
  @Test
  public Object test2() {
    Object _xblockexpression = null;
    {
      PollSystem pollSystem = QuestionnaireFactory.eINSTANCE.createPollSystem();
      Poll p1 = QuestionnaireFactory.eINSTANCE.createPoll();
      p1.setName("p1");
      EList<Poll> _polls = pollSystem.getPolls();
      _polls.add(p1);
      Context _context = new Context();
      Object _foo = this.foo(pollSystem, _context);
      _xblockexpression = (_foo);
    }
    return _xblockexpression;
  }
  
  public Object foo(final PollSystem sys, final Context c) {
    return null;
  }
}
