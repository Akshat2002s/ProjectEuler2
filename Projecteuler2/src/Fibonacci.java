import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int term1=1;
		int term2=2;
		int term=0;
		int ans=0;
		
		while(term<4000000){
			term= term1+term2;
			term1=term2;
			term2=term;
	
			System.out.println(term);
			if(term%2==0) {
				ans+=term;
			}
		}
		System.out.println(ans+1+1);
	}

}

