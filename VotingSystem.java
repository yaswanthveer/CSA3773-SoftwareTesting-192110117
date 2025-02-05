import java.util.Scanner;

class VotingSystem {
    public static String checkVotingEligibility(int age) {
        if (age >= 18) {
            return "Welcome to the voting system. You can vote.";
        } else {
            int shrt = 18 - age;
            return "Sorry, you can vote after: " + shrt + " years";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scan.nextInt();
        System.out.println(checkVotingEligibility(age));
        scan.close();
    }
}