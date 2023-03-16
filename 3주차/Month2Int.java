import java.util.Scanner;

public class Month2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String x;
		System.out.print("월의 이름을 입력하시오.");
		x = input.next();
		
		switch (x) {
		
			case "jan":
			case "january":
				System.out.print(1);
				break;
			case "februay", "feb":
				System.out.print(2);
				break;
			case "march", "mar":
				System.out.print(3);
				break;
			default:
				System.out.print(0);
				break;
			
		}
		
		input.close();
	}

}
