
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(printBinary(0.25));
		
		System.out.println(bitSwaoRequired(31, 1));
		


	}
	
	public static int bitSwaoRequired(int m, int n){
		int c=m^n;
		int count1=0;
		while(c!=0){
			c=c&(c-1);
			count1++;
		}
		return count1;
	}
	
	public static int bitCalculater(int m, int n){
		
		int c=m^n;
		int c1=0;
		while(c!=0){
			if((c&1)==1)c1++;
			c>>=1;
		}
		return c1;
	}

}
