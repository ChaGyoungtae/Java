
public class KoreanChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		char a = '\uAC00'; //유니코드 가장 첫 글자 '가'를 저장
		do {
			do {
				System.out.print(a); //출력하고
				i++;				 //출력했으므로 i에 1증가
				a++;				 //유니코드도 1증가시킨다.
			} while(i < 588);		 //각 자음당 글자가 588개 이므로 588번 반복 후 개행
			System.out.println();	
			for(int j = 0; j<588; j++) {	
				System.out.print("ㅡ");		// 자음별로 가로선으로 구분
			}
			System.out.println();

			i = 0;

		} while(a != '\uD7A4');		// '힣' 까지 출력
	
		
		
		
	}

}
