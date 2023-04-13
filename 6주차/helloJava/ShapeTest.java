package helloJava;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1,s2;
		Rectangle r1;
		s1 = new Rectangle(1, 2, 3, 4);
		s2 = new Rectangle(5, 6, 7, 8);
		r1 = new Rectangle(4, 3, 2, 1);
		
		
		System.out.println(((Rectangle)s1).width);
		System.out.println(((Rectangle)s2).height);
		System.out.println(r1.height + r1.width);
		
		
	}

}
