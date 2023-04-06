import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y;
		x = input.nextInt();
		y = input.nextInt();
		if (x > y) {
			System.out.print("더 큰 정수: " + x);
		}
		else if (y > x) {
			System.out.print("더 큰 정수: " + y);
		}
		else {
			System.out.print("두 수는 같습니다.");
		}
		input.close();
	}

}
