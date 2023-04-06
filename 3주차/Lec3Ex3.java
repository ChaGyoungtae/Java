
public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i<= 1000; i++) {
			for(int j = 2; j<=i ; j++) {
				if(i == j) {
					System.out.print(i +" ");
				}
				else if(i % j == 0) {
					break;
				}
			}
		}
	}

}
