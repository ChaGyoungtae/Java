
public class KoreanChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		char a = '\uAC00';
		do {
			do {
				System.out.print(a);
				i++;
				a++;
			} while(i < 588);
			System.out.println();
			for(int j = 0; j<588; j++) {
				System.out.print("ㅡ");
			}
			System.out.println();

			i = 0;

		} while(a != '\uD7A4');
	
		
		
		
	}

}
