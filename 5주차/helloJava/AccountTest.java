package helloJava;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setName("TOM");
		obj.setBalance(100000);
		obj.setRegNumber(12345678);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + " 계좌번호는 " + obj.getRegNumber() + "입니다");
	}

}
