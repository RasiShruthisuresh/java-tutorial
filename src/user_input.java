import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // reads everything including spaces; use scanner.next() if you don't want spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is " + gpa);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student: " + isStudent);

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not enrolled");
        }

        System.out.println("You are " + age + " years old");
        System.out.println("Hello " + name);

        scanner.close();
    }
}

// COMMON ISSUES:
// After nextInt(), nextDouble(), or nextBoolean(), a leftover newline character stays in the input buffer.
// If you call scanner.nextLine() right after one of those, it reads that leftover newline as an empty string.
// (Not an issue in this program since nextLine() is called first — but watch for it if you reorder things.)