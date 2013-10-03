package fr.inria.k3.questionnaire

import org.junit.Test
import org.xtext.example.mydsl.questionnaire.PollSystem
import org.xtext.example.mydsl.questionnaire.QuestionnaireFactory

class QuestionnaireM2M {
	
	
	
	
	
	@Test
	def test2() {
		
		var pollSystem = QuestionnaireFactory.eINSTANCE.createPollSystem ;
		var p1 = QuestionnaireFactory.eINSTANCE.createPoll() ; 
		p1.setName("p1");
		pollSystem.polls.add(p1) 
		//
		
		
		pollSystem.foo (new Context)
		
	}
	
	def foo(PollSystem sys, Context c) {
		// treatment
	}
}

class Context {
	
	new() {
		
	}
	
}