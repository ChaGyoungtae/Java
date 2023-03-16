import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("양의 정수 입력: ");
		x = input.nextInt();
		
		System.out.println(x + "의 약수는 다음과 같습니다.");
		for(int i = 1; i<=x ; i++) {
			if(x % i == 0) System.out.print(i +" ");
		}
		
		input.close();
	}

}
