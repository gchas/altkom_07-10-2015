package prepaid;

public class Test {

	public static void main(String[] args) throws PrepaidException {
		// TODO Auto-generated method stub

		try {
			PrepaidPhone pp = new PrepaidPhone(10);		
			pp.makeCall(499);
		} catch (PrepaidException pe) {
			System.out.println("Wystpi problem: " + pe.getMessage());
		}
	}

}

//https://github.com/gchas/altkom123