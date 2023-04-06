import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		x = input.nextInt();
		
		if(x % 3 == 0) // 입력받은 수가 3의 배수라면
		{
			System.out.print("3의 배수입니다."); // 메시지 출력
		}
		
		input.close();
	}

}
