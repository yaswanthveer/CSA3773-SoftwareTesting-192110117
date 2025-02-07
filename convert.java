import java.util.*;
public class convert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days:");
		int days = sc.nextInt();
		 
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        remainingDays %= 30;
        int weeks = remainingDays / 7;
        remainingDays %= 7;
        
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(weeks + " weeks");
        System.out.println(remainingDays + " days");
	}

}