import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the username:");
            String str1 = in.nextLine();
            System.out.println("Re-enter the username:");
            String str2 = in.nextLine();

            if (str1.equals(str2)) {
                System.out.println("Usernames match.");
            } else {
                System.out.println("Usernames do not match.");
            }
        } finally {
            in.close(); 
        }
    }
}
