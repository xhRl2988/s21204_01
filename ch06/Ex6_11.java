package ch06;
class Data_1{
	int value;
	// 매개변수가 없으면 자동으로 Data_1(){}; 을 만들어줌
}
class Data_2{
	int value;
	Data_2(){};		//여기 막으면 에러남
	Data_2(int x){ //매개변수가 있는 생성자.		
// 매개변수를 생성하면 Data_2(){}; 을 자동생성하지 않아서 직접 만들어 주어야 한다
		value = x;
	}
}
public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 =new Data_1();
		Data_2 d2 =new Data_2();   //compile error발생
	}
}
