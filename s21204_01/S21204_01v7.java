package s21204_01;
import java.util.Scanner;
public class S21204_01v7 {

	public static void main(String[] args) {
		String strVal;
		int intVal;
		double douval;
		Scanner sc = new Scanner(System.in);
		
		

		
		
		System.out.println("1 문장을 입력하세요.");
		strVal = sc.nextLine();
		System.out.println("2 점수을 입력하세요.");
		intVal = sc.nextInt();
		System.out.println("3실수을 입력하세요");
		douval = sc.nextDouble();
		
		
		System.out.println("1 입력한 문장은 " +strVal+"입니다.");
		System.out.println("2 입력한 점수은 " +intVal+"입니다.");
		System.out.println("3 입력한 실수은 " +douval+"입니다.");
	}
}
