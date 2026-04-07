import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Ah! i see you are: "+age);
        scanner.nextLine(); //if a string follow it avoid an error

        System.out.println("Enter your favorite color: ");
        String color=scanner.nextLine();
        System.out.println("Your favorite color is: "+color);

        System.out.println("Are you a student? :");
        boolean isStudent=scanner.nextBoolean();

        if(isStudent){ //condition for boolean
            System.out.println("Oh! you're a student!");
        } else{
            System.out.println("Hey! You are not a student!");
        }

        System.out.println("Hello, "+name+", i see you're "+age);
        scanner.close();

    }
}