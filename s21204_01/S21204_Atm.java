package s21204_01;
import java.util.*;
public class S21204_Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int g;
		int m;
		int A=0;
		int B=0;
		int s;
		while(true) {
			System.out.println("메뉴 선택 : 1.입금  2.출금  9.종료");
			a=sc.nextInt();
			if(a==9) {
				System.out.println("나가 ^v^");
				break;	
			}
			
			System.out.println("계좌 선택 : 전메뉴=0  A=1  B=2  종료=9");
			g=sc.nextInt();
			if(g==9) {
				System.out.println("나가^v^");
				break;
			}else if(g==0) {
				continue;				
			}
			
			
			System.out.println("금액 입력 : ");
			m=sc.nextInt();
			
			if(a==1) {
				if(g==1) {
					A=A+m;
					s=A+B;
					System.out.println("A잔액:"+A+"총금액:"+s);
					System.out.println("B잔액:"+B+"총금액:"+s);
					System.out.println("총금액:"+s);
					
				}else if(g==2) {
					B=B+m;
					s=A+B;
					System.out.println("A잔액:"+A+"총금액:"+s);
					System.out.println("B잔액:"+B+"총금액:"+s);
					System.out.println("총금액:"+s);
				}
			}else if(a==2) {
				if(g==1) {
					A=A-m;
					s=A+B;
					System.out.println("A잔액:"+A+"총금액:"+s);
					System.out.println("B잔액:"+B+"총금액:"+s);
					System.out.println("총금액:"+s);
				}else if(g==2) {
					B=B-m;
					s=A+B;
					System.out.println("A잔액:"+A+"총금액:"+s);
					System.out.println("B잔액:"+B+"총금액:"+s);
					System.out.println("총금액:"+s);
				}
			}
		}
	}
}
