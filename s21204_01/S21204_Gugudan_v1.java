package s21204_01;
import java.util.*;
import java.io.*;
public class S21204_Gugudan_v1 {

	public static void main(String[] args) {
		int x,y;
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
//		System.out.println("args.length:"+args.length);
		
		x=r.nextInt(23)+1;
		y=r.nextInt(9)+1;
		
		System.out.println();
		System.out.println("* 구구단 "+x+"단에 대한 문제입니다");
		System.out.println();
		System.out.print(x+"*"+y+"= ");
		int s=sc.nextInt();
		if(s==x*y) {
			System.out.println("정답입니다");
		}else {
			System.out.println("틀렸습니다");
			System.out.println("정답은 "+x*y+"입니다");
		}
		
		
		
		
		
		
	}
}
