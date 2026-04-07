import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){  //MadLib game
        Scanner scanner=new Scanner(System.in);

        String name; //assignation later in the scanner inputs
        int age;
        String verb;
        String description;
        String color;
        String place;

        System.out.println("Enter a name: ");
        name=scanner.nextLine();

        System.out.println("Enter an age: ");
        age=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a verb -ing: ");
        verb=scanner.nextLine();

        System.out.println("Enter a description: ");
        description=scanner.nextLine();

        System.out.println("Enter a color: ");
        color=scanner.nextLine();

        System.out.println("Enter a place: ");
        place=scanner.nextLine();


        System.out.println("\nI went "+verb+" and i saw "+name+".");
        System.out.println("But since i'm "+age+" it was "+verb+".");
        System.out.println("And so "+description);
        System.out.println("Yet the color was "+color+" as well and it was "+place+" no less! what a joy!");
    }
}
