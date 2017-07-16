package sort;

public class InsertSortDemo {

	public static void main(String[] args) {
		int a[] = {6,91,90,16,1};
		insertSort(a);
		for(int i: a){
		System.out.println(i);
		}
	}
	
	
	static void insertSort(int a[]){
		int n = a.length;
		int i,j;
		for( i=1 ; i<n ; i++){
			int tmp = a[i];
			for(j=i;j>0 && a[j-1] >tmp ;j--){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
}
