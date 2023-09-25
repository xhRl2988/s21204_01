package s21204_01;

public class S21204_03v4 {

	public static void main(String[] args) {
		int sum= 0;
		int i= 0;
		while(true) {
			if(sum>100)break;
			++i;
			System.out.println("i="+i+" sum="+sum);
			sum+=i;
		}
		System.out.println("-----------------");
		System.out.println("i="+i+" sum="+sum);
	}
}
