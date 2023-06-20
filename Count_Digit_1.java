package DSA;
import java.util.*;
public class Count_Digit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}
