package DSA;
import java.util.*;
public class Hashing_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] hash=new int[1000000];
		for(int i=0;i<n;i++)
		{
			hash[arr[i]]+=1;
		}
		System.out.println("Enter the count of value for which you wants to check occurence= ");
		int count=sc.nextInt();
		while(count>0)
		{
			System.out.println("Enter value= ");
			int val=sc.nextInt();
			System.out.println(val+" occurs "+hash[val]+" times");
			count--;
		}
		
	}

}
