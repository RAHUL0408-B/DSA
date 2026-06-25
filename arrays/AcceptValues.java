import java.util.Scanner;

public class AcceptValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next();  // Use nextLine() for full name with spaces

        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
    }
}