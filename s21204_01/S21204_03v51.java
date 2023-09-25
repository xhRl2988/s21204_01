package s21204_01;
import java.util.Scanner;
public class S21204_03v51 {
	public static void main(String[] args) {
		String day_S1 = "(1) 월요일이 좋다";
		String day_S2 = "(2) 화요일이 좋다";
		String day_S3 = "(3) 수요일이 좋다";
		String day_S4 = "(4) 목요일이 좋다";
		String day_S5 = "(5) 금요일이 좋다";
		int menu = 0;
		int num = 0;
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("(1) 월요일이 좋다");
			System.out.println("(2) 화요일이 좋다");
			System.out.println("(3) 수요일이 좋다");
			System.out.println("(4) 목요일이 좋다");
			System.out.println("(5) 금요일이 좋다");
			System.out.println("좋아하는 날을 선택합니다 (종료:0)");
			String tmp=sc.nextLine();
			menu=Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("장비를 정지합니다.");
				break;
			}else if(menu==1) {
				System.out.println(day_S1);
				break;
			}else if(menu==2) {
				System.out.println(day_S2);
				break;
			}else if(menu==3) {
				System.out.println(day_S3);
				break;
			}else if(menu==4) {
				System.out.println(day_S4);
				break;
			}else if(menu==5) {
				System.out.println(day_S5);
				break;
			}else {
				System.out.println("다시");
				continue;
			}
		}
		
	}
}

