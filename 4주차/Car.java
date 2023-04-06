
public class Car {
	private String color = "red";	// 초기 데이터 설정, private로 클래스에 직접 접근하여 데이터조정을 불가능하게 함.
	private int gear = 2;
	private int speed = 80;
	
	
	public String toString() {
		return "Car [color=" + color + ",spped=" + speed + ",gear=" + gear + "]"; // 현자 자동차의 색, 속도, 기어 값
	}
	
	public void changeGear(int g) { //입력받은 int형 값을 Car.gear에 저장
		gear = g;
	}
	
	public void speedUp() {	// 해당 메서드 실행시 이전 스피드에 10을 더함.
		speed = speed + 10;
	}
	
	public void speedDown() { // 해당 메서드 실행시 이전 스피드에 10을 뺌.
		speed = speed - 10;
	}
}
