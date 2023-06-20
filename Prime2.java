package DSA;
import java.util.*;
public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=1;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
				flag++;
		}
		if(flag==1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
