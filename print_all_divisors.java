package DSA;
import java.util.*;
public class print_all_divisors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				System.out.print(i+" ");
//			}
//		}
		for(int i=1;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
			if(i!=n/i)
				System.out.print(n/i+" ");
		}
	}
}
