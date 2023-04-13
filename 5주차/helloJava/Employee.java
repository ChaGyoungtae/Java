package helloJava;

public class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	public Employee(String n, String a, int s, int r) { //생성자
		this.name = n;
		this.address = a;
		this.salary = s;
		this.rrn = r;
	}
	
	@Override
	public String toString() { //변수 정보 반환
		return "Employee [name="+this.name+", address="+this.address+", salary="+this.salary+", rrn="+this.rrn+"]";
	}
}
