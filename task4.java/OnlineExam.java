import java.util.Scanner;
class OnlineExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 0;

        // Questions
        System.out.println("1. What is the capital of India?");
        System.out.println("a. Mumbai");
        System.out.println("b. Delhi");
        System.out.println("c. Kolkata");
        String ans1 = sc.nextLine().toLowerCase();
        if (ans1.equals("b")) {
            marks++;
        }

        System.out.println("2. What is the largest country in the world by area?");
        System.out.println("a. USA");
        System.out.println("b. Russia");
        System.out.println("c. China");
        String ans2 = sc.nextLine().toLowerCase();
        if (ans2.equals("b")) {
            marks++;
        }

        System.out.println("3. Who is the author of the Harry Potter series?");
        System.out.println("a. J.K. Rowling");
        System.out.println("b. Stephen King");
        System.out.println("c. Dan Brown");
        String ans3 = sc.nextLine().toLowerCase();
        if (ans3.equals("a")) {
            marks++;
        }

        System.out.println("4. What is the currency of Japan?");
        System.out.println("a. Yen");
        System.out.println("b. Euro");
        System.out.println("c. Dollar");
        String ans4 = sc.nextLine().toLowerCase();
        if (ans4.equals("a")) {
            marks++;
        }

        // Display results
        System.out.println("Your total score is " + marks + " out of 4.");
    }
}
