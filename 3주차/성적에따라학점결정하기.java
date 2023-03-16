import java.util.Scanner;

public class 성적에따라학점결정하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int rec = input.nextInt();
		
		if(rec >= 90) System.out.print("A");
		else if(rec >= 80) System.out.print("B");
		else if(rec >= 70) System.out.print("C");
	}

}
