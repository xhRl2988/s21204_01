package s21204_01;
//선택 정렬
//n개의 레코드 중에서 최솟값을 찾아 첫 번째 레코드 위치로 간다
public class SortSelection {
	public static void main(String[] args) {
		int[] arr = {9, 4, 5, 11, 8};
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if(arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp;  // i를 j로 변경
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); // 정렬 후 결과 출력
		}
		
		
	}
}
