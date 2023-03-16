import java.util.Scanner; //Scanner 클래스 포함

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		final double PI = 3.141592;											// PI 부동소수점 상수 선언
		
		System.out.println("반지름 길이를 입력하시오: ");
		double radius = input.nextInt();									// radius 값 입력
		
		double circle = radius * radius * PI;
		System.out.println("반지름이 "+radius+"인 원의 면적은 "+circle+"입니다.");	// 원의 면적값 출력
	}

}
