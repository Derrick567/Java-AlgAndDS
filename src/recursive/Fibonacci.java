package recursive;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fab(6));
	}
	
	public static int fab(int n){
		if(n== 0 || n==1)
			return 1;
		else
			return fab(n-1) + fab(n-2);
	}
}
