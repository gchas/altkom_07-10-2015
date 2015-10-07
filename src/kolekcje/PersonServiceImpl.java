package kolekcje;

public class PersonServiceImpl implements PersonService {

	private Person person;
	
	public PersonServiceImpl(Person person) {
		this.person = person;
	}
		
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String getName() {
		return person.getName();
	}

	@Override
	public int getAge() {
		return person.getAge();
	}

}
