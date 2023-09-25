package s21204_01;
import java.util.Scanner;
public class S21204_v3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("현재 월을 입력하세요: ");
		int month=scanner.nextInt();
		switch (month) {
		case 1:
		case 2:	
		case 3:
		System.out.println("봄");
			break;
		case 4:
		case 5:
		case 6:
		System.out.println("여름");
			break;
		case 7:
		case 8:
		case 9:
		System.out.println("가을");
			break;
		case 10:
		case 11:
		case 12:
		System.out.println("겨울");
			break;
		default:
			System.out.println("다시");
		}
		
		
	}
}
