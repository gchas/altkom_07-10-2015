package kolekcje;

public class InterfaceDemo {

	public static void main(String[] args) {
				
		Person person = new Person();

		person.setName("Ania");		
		person.setAge(55);
				
		PersonService personService  = new PersonServiceImpl(person);
		
		System.out.println("Name: " + personService.getName());
		System.out.println("Age: " + personService.getAge());
	}

}
