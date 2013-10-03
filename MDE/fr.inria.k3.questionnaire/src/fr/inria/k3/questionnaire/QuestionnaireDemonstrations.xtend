package fr.inria.k3.questionnaire

import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import org.xtext.example.mydsl.QuestionnaireStandaloneSetupGenerated
import org.xtext.example.mydsl.questionnaire.PollSystem

import static org.junit.Assert.*
import java.util.Collections
import java.util.List
import org.xtext.example.mydsl.questionnaire.Poll
import java.io.FileWriter

class QuestionnaireDemonstrations {

	
	def loadPollSystem(URI uri) {
		new QuestionnaireStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as PollSystem
	}
	
	def savePollSystem(URI uri, PollSystem pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(pollS); 
		rs.save(new HashMap());
	}
	
	@Test
	def test1() {
		
		// loading
		var pollS = loadPollSystem(URI.createURI("foo1.q")) 
		assertNotNull(pollS)
		assertEquals(2, pollS.polls.size)
		savePollSystem(URI.createURI("foo1.xmi"), pollS)
		
		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
		pollS.polls.forEach[p | p.name = p.name + "_poll"]

		// serializing
		savePollSystem(URI.createURI("foo2.q"), pollS) 
		
		 
			
	}
	
	
	@Test
	def test2() {
		
	// loading
	var pollS = loadPollSystem(URI.createURI("foo1.q")) 
		
	// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
	var html = toPolls(pollS.polls)
	assertNotNull(html)
	
	// serializing (note: we could type check the HTML 
	// with Xtext by specifying the grammar for instance)
	val fw = new FileWriter("foo1.html")
	fw.write(html.toString)
	fw.close
		
		
	}
	
	def toPolls(List<Poll> polls) '''
	  <html>
	    <body>
	      «FOR p : polls»
	        «IF p.name != null»
	           <h1>«p.name»</h1>
	        «ENDIF»
	        «FOR q : p.questions»
	        <p>
	        	<h2>«q.text»</h2>
	        	<ul>
	        	 «FOR o : q.options»
	        	 <li>«o.text»</li>
	        	 «ENDFOR»
	        	</ul>
	        </p>
	        «ENDFOR»
	      «ENDFOR»
	    </body>
	  </html>
	'''
	
	

}