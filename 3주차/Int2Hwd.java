import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("숫자를 입력하시오.: ");
		x = input.nextInt();
		
		switch (x) {
			
			case 0:
				System.out.print("없음");
				break;
			case 1:
				System.out.print("하나");
				break;
			case 2:
				System.out.print("둘");
				break;
			default:
				System.out.print("많음");
				break;
		}
		input.close();
	}

}
