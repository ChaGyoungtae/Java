package helloJava;

public class BankTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Badbank b1 = new Badbank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("Badbank의 이자율: " + b1.getInterestRate());
		System.out.println("Normalbank의 이자율: " + b2.getInterestRate());
		System.out.println("Goodbank의 이자율: " + b3.getInterestRate());
	}

}
