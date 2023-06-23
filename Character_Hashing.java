package DSA;
import java.util.*;
public class Character_Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] hash=new int[256];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			hash[256-(int)ch]+=1;
		}
		System.out.println("Enter no of character to check= ");
		int count=sc.nextInt();
		while(count>0)
		{
			System.out.println("Enter character= ");
			char ch=sc.next().charAt(0);
			System.out.println(ch +" occurs "+ hash[256-(int)ch]+" times.");
			count--;
		}
	}

}
