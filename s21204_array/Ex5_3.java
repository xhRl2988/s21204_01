package s21204_array;

public class Ex5_3 {

	public static void main(String[] args) {
		int[] score= {98,11,88,90,92,75,12,77,100};
		
		int max=score[0];
		int min=score[0];

		for(int i=0; i<score.length; i++) {
			if(max<score[i]) {
				max=score[i];
			}else if(score[i]<min) {
				min= score[i];
			}
			
		}
		
		
		
		
		
		System.out.println("최댓값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
