package s21204_01;
//삽입 정렬
//자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교 하여, 
//자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
public class SortInsertion {
	public static void main(String[] args) {
		int [] arr = {20,19,14,16,18};
		for (int i = 1; i < arr.length; i++) {
			int standard = arr[i]; 
			int aux = i - 1;   
			while (aux >= 0 && standard < arr[aux]) {
				arr[aux + 1] = arr[aux];   
				aux--;
			}
			arr[aux + 1] = standard;  
		}
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
//		 다른 버전
//		int[] dim = {10,7,2,5,1,6,4};
//		System.out.println("Arry Length : "+dim.length);
//		System.out.print("source : ");
//		for(int a=0; a<dim.length; a++) {
//			System.out.print(dim[a]+" ");
//		}
//		for(int i=1; i<dim.length; i++) {
//			int j=i-1;
//			int temp =dim[i];
//			while(j>=0 && temp<dim[j]) {
//				dim[j+1] = dim[j];
//				j--;
//			}
//			dim[j+1]=temp;
//			System.out.println(" ");
//			for(int a=0; a<dim.length; a++) {
//				System.out.print(dim[a]+ " ");
//			}
//		}
//		System.out.println(" ");
//		System.out.print("result : ");
//		for(int a=0; a<dim.length; a++) {
//			System.out.print(dim[a]+" ");
//		}
		
		
	}
}
