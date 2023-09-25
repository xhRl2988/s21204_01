package s21204_01;
//버블 정렬   
//인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 서로 교환한다
public class SortBubble {
	public static void main(String[] args) {
		int[] dim = {6,3,11,8,1,5,9,0,2,4,10,7,-1,-9};
		System.out.println("Attay Length : " + dim.length);

		for(int a=0; a<dim.length; a++) {
			System.out.println(dim[a]+" ");	
		}
		System.out.println(" ");
		System.out.println("-----------------------");
		for(int i=1; i<dim.length; i++) {
		
			for(int j=0; j<dim.length-i; j++) {
				if(dim[j] > dim[j+1]) {
					int temp =dim[j+1];
					dim[j+1] =dim[j];
					dim[j]=temp;
				}
			}
			for(int a=0; a<dim.length; a++) {
				System.out.print(dim[a]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int a=0; a<dim.length; a++) {
			System.out.print(dim[a]+" ");
		}
	}
}
