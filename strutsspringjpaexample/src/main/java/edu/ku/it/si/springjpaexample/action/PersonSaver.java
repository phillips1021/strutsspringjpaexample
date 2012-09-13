/**
 * 
 */
package edu.ku.it.si.springjpaexample.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.ku.it.si.springjpaexample.model.Person;
import edu.ku.it.si.springjpaexample.service.PersonService;

/**
 * Acts as the controller for handling user
 * requests to save a Person object.
 * @author brucephillips
 *
 */
public final class PersonSaver extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private  transient PersonService personService;
	
	private Person person ;

	
	
   /**
    * Save the state of the Person object.
    * 
    */
	public String execute() {

		
		personService.save(person); 
		
		return SUCCESS;
	}
	
	/**
	 * Ensure both a first and last name were provided.
	 */
	public void validate() {
		
		
		if ( person.getFirstName().length() == 0 ){	

			addFieldError( "person.firstName", "First name is required." );
			
		}
		
				
		if ( person.getLastName().length() == 0 ){	

			addFieldError( "person.lastName", "Last name is required." );
			
		}
		
		
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	

}
