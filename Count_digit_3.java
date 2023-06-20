package DSA;
import java.util.*;
public class Count_digit_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digits = (int) Math.floor(Math.log10(n) + 1);
        System.out.println(digits);
	}

}
