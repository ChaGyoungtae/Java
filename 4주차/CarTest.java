
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Car c = new Car();
		
		System.out.println(c.toString()); // 초기상태 출력
		c.changeGear(3);				//기어를 3으로 변경
		System.out.println(c.toString()); // changeGear메서드 실행후 차의 상태
		c.speedUp();					//스피드 10증가
		System.out.println(c.toString()); // speedUp메서드 실행후 차의 상태
		c.speedDown();					//스피드 10감소
		System.out.println(c.toString()); // speedDown메서드 실행후 차의 상태
		
	}

}
