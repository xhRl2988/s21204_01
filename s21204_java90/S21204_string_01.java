package s21204_java90;

public class S21204_string_01 {

	public static void main(String[] args) {
		//문자열 비교 == 사용하면 원하지 않는 결과 나올 수 있다.
		//문자열 비교 equal() 메소드를 사용한다.
		//문자열 비교 각 변수에 저장된 번지를 비교하기 때문에 new 연자자로 객체는 각각 다르다.
		
		String s1 = new String("김현수");     
		String s2 = new String("김현수");
		String s3 = "김현수";
		String s4 = "김현수";
		
		System.out.println("new 연사자로 객체 생성된 s1==s2 비교 :"+(s1==s2));
		System.out.println("상수로 된 리터럴 값 비교는 s3==s4 비교 :"+(s3==s4));		
		System.out.println("상수로 된 리터럴 값 비교는 s1.equals(s2):"+s1.equals(s2));		
		
		System.out.println("s1:"+s1+" hashcode : "+System.identityHashCode(s1));
		System.out.println("s2:"+s2+" hashcode : "+System.identityHashCode(s2));
		System.out.println("s3:"+s3+" hashcode : "+System.identityHashCode(s3));
		System.out.println("s4:"+s4+" hashcode : "+System.identityHashCode(s4));
	}
}
