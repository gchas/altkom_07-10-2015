package kolekcje;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 = "s1";
		String a2 = "s2";
		//String a3 = "s2";
		
		Set<String> set = new HashSet<String>();
		
		set.add(a1);
		set.add(a2);
		//set.add(a3);
		
		/*for (String wynik : set) {
			System.out.println(wynik);
		}*/
		
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		
		/*for (int i = 0 ; i < set.size() ; i++) {
			
			System.out.println(iter.next());
		}*/
		
	}

}
