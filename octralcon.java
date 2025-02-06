import java.util.Scanner;
public class octralcon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int decimal = sc.nextInt();
		String binary = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		System.out.println("Binary num :"+binary);
		System.out.println("Octal num :"+octal);
	}

}