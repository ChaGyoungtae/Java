package helloJava;

public class SmartTv extends Television{

	public String youtubeID;
	public SmartTv(int c, int v, String ID) {
		super(c,v,true);
		youtubeID = ID;

	}
	public void SMprint() {
		super.print();
		System.out.println("youtube ID : " + this.youtubeID);
	}
}
