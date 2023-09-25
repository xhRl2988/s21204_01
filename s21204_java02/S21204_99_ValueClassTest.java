package s21204_java02;
//클래스 정의
	class Circle{
		int radius;				//자료형 필드 반지름
		String color;			//자료형 필드 색상
		double calcArea() {		//반환형 메소드
			return 3.14 * radius * radius;		//해당 값 리턴
		}
	}


public class S21204_99_ValueClassTest {
	public static void main(String[] args) {
	Circle a=new Circle();			//참조 변수 선언    객체 생성
	a.radius=100;					//객체 필드 접근
	a.color="Blus";					//객체 필드 접근
	double area=a.calcArea();		//객체 메소드 접근
	System.out.println("a필드색상: "+a.color+" 원의 면적="+area);
	
	Circle b=new Circle();
	b.radius=20;
	b.color="White";	
	area =b.calcArea();				//객체 메소드 접근
	System.out.println("b필드색상: "+b.color+" 원의 면적="+area);
	
	Circle c=new Circle();
	area =c.calcArea();				//객체 메소드 접근
	System.out.println("c필드색상: "+c.color+" 원의 면적="+area);
			
	a.radius=10;
	b.radius=20;
	c.radius=30;
	System.err.println("a필드색상: "+a.radius+" "+a.calcArea());
	System.err.println("b필드색상: "+b.radius+" "+b.calcArea());
	System.err.println("c필드색상: "+c.radius+" "+c.calcArea());
	}
}
