import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int a;
		a = input.nextInt();
		if(a % 2 == 0) {
			System.out.print("입력된 정수는 짝수입니다.\n");
		}
		else {
			System.out.printf("입력된 정수는 홀수입니다.\n");
		}
		System.out.print("프로그램이 종료되었습니다.");
	}

}
