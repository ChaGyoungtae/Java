package helloJava;


public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv1 = new Television(7,9);
		System.out.println(myTv1.count);
		Television myTv2 = new Television(7,9);
		System.out.println(myTv1.count);
		Television myTv3 = new Television(7,9,true);
		System.out.println(myTv1.count);
		Television myTv4 = new Television(7,9,true);
		System.out.println(myTv1.count);
		
		myTv1.setChannel(11);
		int ch = myTv1.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		System.out.println("나의 " + myTv1.toString());
	}

}
