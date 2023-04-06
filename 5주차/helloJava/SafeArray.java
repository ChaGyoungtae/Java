package helloJava;

public class SafeArray {
	private int a[];
	public int length;
	
	public SafeArray(int size) { //생성자
		a = new int[size];
		length = size;
	}

	public int getA(int index) { //잘못된 인덱스에 접근하지 못하도록 입력받은 index가 0보다 크거나 같고 length보다 작은 경우에만 반환 
		if(index >= 0 && index < length) {
			return a[index];
		}
		else {
			System.out.println("잘못된 인덱스 " + index);
			return -1;
		}
	}

	public void setA(int index, int value) { //잘못된 인덱스에 접근하지 못하도록 입력받은 index가 0보다 크거나 같고 length보다 작은 경우에만 value값이 a에 들어감
	if(index >= 0 && index < length) {
		a[index] = value;
	}
	else {
		System.out.println("잘못된 인덱스 " + index);
		return;
	}

	}
}
