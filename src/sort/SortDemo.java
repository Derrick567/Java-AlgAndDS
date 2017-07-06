package sort;

public class SortDemo {
	
	public static void main(String[] args) {
		int arr[] = {5,6,4,9,1};
		selectSort(arr);
		
	}
	
	static void selectSort(int[] list){
		int n = list.length;
		for(int i=0 ; i<n-1 ; i++){
			int min = i;
			
			for(int j = i+1 ;j<n ; j ++){
				//find the smallest integer's index
				if(list[j] < list[min]){
					min = j ;
				}
			}
				swap(list, i,min);
		}
	}
	
	private static void swap(int[] arr, int firstIdx, int secondIdx) {
		int tmp = arr[firstIdx];
		arr[firstIdx] =arr[secondIdx];
		arr[secondIdx] =tmp;
	}
	
}
