package ch06;

public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1=new Tv();		//Tv t1; t1=new Tv();를 한 문장으로 가능
		Tv t2=new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
	
		t1.channel=5;		//channel 값은 5으로 한다.
		System.out.println("t1의 channel값은 5로 변경하였습니다");
		
		System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");
		
		//t1.channelUp();
		//System.out.println("현재 채널은 "+t1.channel +"입니다.);
		//t1.channelUp();
		//System.out.println("현재 채널은 "+t1.channel +"입니다.);
	
	
	}
}
