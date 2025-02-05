import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        System.out.println("Reverse of the string '" + str + "' is:");
        for (int j = str.length(); j > 0; --j) {
            System.out.print(str.charAt(j - 1));
        }
    }
}

