package recursive;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fab(8));
		System.out.println(fabLoop(8));
	}
	
	public static int fab(int n){
		if(n== 0 || n==1)
			return 1;
		else
			return fab(n-1) + fab(n-2);
	}
	
	
	public static int fabLoop(int n){
		if(n== 0 || n==1)
			return 1;
		
		else{
				int a=1;
				int b=1;
				int tmp = 0;
				for(int i=2;i<=n;i++){
					int temp = a + b;
					a = b;
					b =temp;
				}
				return b;
			}
		
	}
}
