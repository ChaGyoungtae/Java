package helloJava;

public class Box {
	private int width, length, height; //접근제어
	
	Box(int w, int l, int h) { //생성자
		width = w;
		length = l;
		height = h;
	}
		
	boolean isSameBox(Box obj) { //크기가 같으면 true, 아니면 false 출력
		if((obj.width == width) & (obj.height == height) & (obj.length == length)){
			return true;
		}
		else
			return false;
	}
}
