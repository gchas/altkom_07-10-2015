package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("elem1", 5);
		map.put("elem2", 12);
		
		for (String wynik : map.keySet()) {
			
			System.out.println("key: " + wynik);
		}
		
		for (Integer wynik : map.values()) {
			
			System.out.println("value: " + wynik);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("key: " + key + " value: " + value);
		}
	}

}
