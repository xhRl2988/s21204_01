package s21204_01;
import java.util.Scanner;
public class S21204_03v3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 기본으로 몇 단까지 할까요: ");
		int k=sc.nextInt();
		for(int i=2; i<=k;i++) {
			System.out.println(i+"단 입니다.");
			System.out.println("============");
			for(int j=1; j<10; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}
		
	}
}
