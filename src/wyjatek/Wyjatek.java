package wyjatek;

public class Wyjatek {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Wyjatek wyjatek = new Wyjatek();
		wyjatek.method();
	}

	public void method() throws Exception {
		
		oper1();
		try {
			oper2();
			oper3();
		} catch (MyArithmeticException e) {

			//blok jest pomijany, ponieważ ArithmeticException jest nadklasą MyArithmeticException
			System.out.println("Obsługuję wyjątek");
			oper4();
		}
		oper5();
	}
	
	public void oper1() {
		System.out.println("oper1");
	}
	
	public void oper2() throws Exception {
		System.out.println("oper2");

		//throw new Exception ("Wystapil jakis blad");
		
		int a = 5;
		if (a == 5) {
			a = a / 0;
		}
	}
	
	public void oper3() {
		System.out.println("oper3");
	}
	
	public void oper4() {
		System.out.println("oper4");
	}
	
	public void oper5() {
		System.out.println("oper5");
	}
}
