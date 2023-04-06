import java.util.Scanner; // Scanner 클래스 포함
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean b;									// true, false 반환을 위한 boolean형 변수 선언	
		b = true;
		System.out.println("연도 입력.");
		int year = input.nextInt();					// 연도 입력
		b = (year % 4 == 0);						// 입력한 값이 4의배수면 true, 아니면 false가 b에 대입된다.
		
		System.out.println(b);// 값 출력
		
		input.close();
	}

}
