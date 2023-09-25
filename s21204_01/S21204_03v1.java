package s21204_01;
import java.util.Scanner;
public class S21204_03v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int Score =  sc.nextInt();
		
		if(Score >=90) {
			System.out.println("학점:A");
		}else if(Score>=80&&Score<=89) {
			System.out.println("학점:B");
		}else if(Score>=70&&Score<=79) {
			System.out.println("학점:C");	
		}
		System.out.println("당신의 점수는"+Score+"입니다");
		
	}
}
