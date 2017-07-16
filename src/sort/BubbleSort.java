package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {6,61,3,2,1,60};
		bubbleSort(a);
		
		for(int i: a){
			System.out.println(i);
			}
	}

	
	static void bubbleSort(int a[]){
		int n =a.length;
		int i,j;
		for(i=0;i<=n-2;i++){
			
			for(j=n-1;j>i;j--){
				if(a[j-1]>a[j])
					swap(a,j-1,j);
			}
		}
	}
	
	private static void swap(int[] arr, int firstIdx, int secondIdx) {
		int tmp = arr[firstIdx];
		arr[firstIdx] =arr[secondIdx];
		arr[secondIdx] =tmp;
	}
}
