package s21204_array;

public class EX5_2 {

	public static void main(String[] args) {
		
		int sum=0;
		float average=0;
		int[] score= {98,100,88,90,92};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		
		System.out.println("총점"+sum);
		System.out.println("평균"+average);
		
		
	}
}
