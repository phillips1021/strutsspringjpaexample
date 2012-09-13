package edu.ku.it.si.springjpaexample.action;

import org.apache.struts2.StrutsSpringTestCase;

import com.opensymphony.xwork2.ActionProxy;

import edu.ku.it.si.springjpaexample.model.Gender;
import edu.ku.it.si.springjpaexample.model.Person;



public class PersonSaverTest extends StrutsSpringTestCase {
	
	@Override
	public String getContextLocations() {
		
		return "applicationContextTest.xml";
		
	}
	

	public void testInput() throws Exception {
		
		
		
		ActionProxy proxy = getActionProxy("inputPersonSave");
		
		PersonSaver action = (PersonSaver) proxy.getAction();
		
		assertNotNull(action);
		
		String result = proxy.execute() ;
		
		assertEquals("Result of calling input method is not input but it should be.", "input", result);
		
	
	}
	
	
	public void testExecute() throws Exception {
		
		
		request.setParameter("person.firstName", "George");
		request.setParameter("person.lastName", "Hosler");
		request.setParameter("person.gender", "MALE");
		
		ActionProxy proxy = getActionProxy("executePersonSave");
		
		PersonSaver action = (PersonSaver) proxy.getAction();
		
		assertNotNull(action);
		
		String result = proxy.execute() ;
		
		assertEquals("Result of calling execute method is not success but it should be.", "success", result);
		
		Person person = action.getPerson() ;
		
		
		assertEquals("Person's first name is not George but should be.", "George", person.getFirstName() );
		
		assertEquals("Person's gender is not MALE but it should be.", Gender.MALE, person.getGender());
		
		

		
	}

}
