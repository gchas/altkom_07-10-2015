package kolekcje;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String info = "ala;ela;ola";
		
		StringTokenizer st = new StringTokenizer(info, ";");

		while (st.hasMoreTokens()) {
			
			String token = st.nextToken();
			
			System.out.println("Token: " + token);
		}		
	}

}
