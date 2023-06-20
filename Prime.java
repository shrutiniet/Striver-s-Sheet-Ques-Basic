package DSA;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=1;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
				flag++;
		}
		if(flag==2)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
	}
}
