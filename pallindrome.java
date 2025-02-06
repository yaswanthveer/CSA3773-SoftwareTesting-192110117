import java.util.*;
public class pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int rem=num;
		int reverse=0;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		//System.out.println(reverse);
		if(reverse==rem) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not palindrome number");
		}
	}

}