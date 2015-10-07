package kolekcje;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String a1 = "a1";
		String a2 = "a2";
		
		Integer b1 = 12;
		
		List list =  new ArrayList();
		
		list.add(a1);
		list.add(a2);
		
		list.add(b1);
		
		for (Object ob : list) {
			
			System.out.println(ob);
		}*/
		
		/*String a1 = "a1";
		String a2 = "a2";
		
		Integer b1 = 12;
		
		List<String> list =  new ArrayList<String>();
		
		list.add(a1);
		list.add(a2);
		
		//list.add(b1);
		
		for (Object ob : list) {
			
			System.out.println(ob);
		}*/
		
		/*Car car1 = new Car();
		car1.setKolor("blue");
		
		Car car2 = new Car();
		car2.setKolor("red");
		
		List<Car> list =  new ArrayList<Car>();
		
		list.add(car1);
		list.add(car2);
		
		//list.add(b1);
		
		for (Car car : list) {
			
			System.out.println(car.getKolor());
		}*/
		
		
		Street s1 = new Street();
		s1.setName("nazwa1");

		Street s2 = new Street();
		s2.setName("nazwa2");
		
		List<Street> list =  new ArrayList<Street>();
		
		list.add(s1);
		list.add(s2);
		
		//list.add(b1);
		
		for (Street s : list) {
			
			System.out.println(s.getName());
		}
	}

}
