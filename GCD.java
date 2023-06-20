package DSA;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		int ans=1;
		if(a>b)
			c=a-b;
		else
			c=b-a;
		for(int i=1;i<=c;i++)
		{
			if(a%i==0 && b%i==0)
			{
				ans=i;
			}
		}
		System.out.println("GCD: "+ans);
	}

}
