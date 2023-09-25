package s21204_01;
import java.util.Scanner;
public class S21204_03v5 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("(1)월요일 좋아~ 월요일 좋아~");
			System.out.println("(2)수요일이 좋다"); 
			System.out.println("(3)금요일이 좋다"); 
			System.out.println("(4)학교가는 날은 좋다"); 
			System.out.println("좋아하는 날을 선택하세요(종료:0)");
			
			String tmp = sc.nextLine();
			menu =Integer.parseInt(tmp);
		
			if(menu == 0) {
				System.out.println("장비를 정지합니다.");
				break;
			}else if(!(1<= menu && menu <=4)) {
				System.out.println("정확히 입력하세요");
				continue;
			}
			System.out.println("선택하신 번호는 "+menu+"번 입니다.");
			break;
		}	
	}
}
