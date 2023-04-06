import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[5]; // 배열 생성
		int tmp; //임시 저장 변수 생성
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		while(i<5) {
			System.out.print("정수 입력: ");
			tmp = input.nextInt(); //임시 저장 변수에 입력을 받아서
			if(tmp > 0) { // 입력받은수가 양수이면
				s[i] = tmp; // 배열에 저장한다.
				i++;		// 배열에 저장했을때만 i를 증가시킨다.
			}
		}
		
		Arrays.sort(s);	//배열의 원소를 오름차순으로 정렬하고
		System.out.printf("가운데 값: %d",s[s.length/2]); //가운데 값 출력
		input.close();
	}
	
}
