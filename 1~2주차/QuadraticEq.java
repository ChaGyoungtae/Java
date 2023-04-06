import java.util.Scanner; // Scanner 클래스 포함

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float a = 1;
		System.out.println("b: ");											// b와 c의 값 입력
		float b = input.nextFloat();
		System.out.println("c: ");
		float c = input.nextFloat();
		float result1 = (float)((b*-1) + Math.sqrt(b*b - 4*a*c)) / (2*a);	// Math.sqrt를 이용해 두 근 구하기
		float result2 = (float)(((b*-1) - Math.sqrt(b*b - 4*a*c)) / (2*a));
		
		System.out.println(result1+","+result2); // 두 근 출력
		input.close();
	}

}
