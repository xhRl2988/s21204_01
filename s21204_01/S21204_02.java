package s21204_01;

public class S21204_02 {

	public static void main(String[] args) {
		double pi =3.141592;
		
		// 결과1: 3.141592
		System.out.println("결과1 : "+Math.round(pi));
		// 결과2: 3.141592
		System.out.println("결과2 : "+pi);
		// 결과3: 3141.592
		System.out.println("결과3 : "+(pi*1000));
		// 결과4: 3142
		System.out.println("결과4 : "+Math.round(pi*1000));
		// 결과5: 3.142
		System.out.println("결과5 : "+(((double)Math.round((pi*1000))/1000)));
		// 결과6: 3.141
		System.out.println("결과6 : "+(((int)(pi*1000)/1000.0)));
}
}
