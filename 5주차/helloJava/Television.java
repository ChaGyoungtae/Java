package helloJava;

public class Television {
	int channel;
	int volume;
	boolean onOff;

	
	public Television (int c) {
		this(c,10
				
				
				,true);
	}
	
	public Television (int c, int v) {
		this(c,v,true);
	}
	
	public Television (int c, int v, boolean o) { //생성자
		this.channel = c;
		this.volume = v;
		this.onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	public String toString() {
		return "채널은 " + channel + "이고 볼륨은 " + volume + "입니다.";
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
