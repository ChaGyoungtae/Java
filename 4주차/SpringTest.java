import java.util.Scanner;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// "www"로 시작하는지와 "quit"을 입력했는지를 보기위한 문자열 s1,s2
		String s1 = "www";	
		String s2 = "quit";
		// 입력받은 문자열을 임시로 저장할 문자열
		String tmp;
		while(true) {
			System.out.print("문자열을 입력하세요>");
			tmp = input.next();
			
			if(tmp.equals(s2)) { // 입력받은 문자열이 quit이라면 반복문 종료
				break;
			}
			else if (s1.equals(tmp.substring(0,3)) == true) { //입력받은문자열의 0~2번째 인덱스의 있는 값이 www라면
				System.out.println(tmp + "는 'www'로 시작합니다.");
			}
			else {
				System.out.println(tmp + "는 'www'로 시작하지않습니다."); //그렇지 않다면
			}
			
		}

		
		
		
		input.close();
				
	}

}
