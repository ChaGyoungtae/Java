package helloJava;

public class Manager extends Employee {
	private int bonus; //매니저에만 있는 보너스 변수
	
	public Manager(String n, String a, int s, int r, int b) { //상속받은 employee안에 있는 변수와 보너스에 대한 생성자
		super(n, a, s, r);
		bonus = b;
		// TODO Auto-generated constructor stub
	}

	
	
	public void test() { //name, address, salary 출력
		System.out.println("name=" + name);
		System.out.println("address=" + address);
		System.out.println("salary=" + salary);
		
		
	}
	
	public String toString() { //변수 정보 반환
		return "Manager [name="+this.name+", address="+this.address+", salary="+this.salary+", bonus="+this.bonus+"]";
	}

}
