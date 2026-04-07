import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){ //Sushi shop program

        Scanner scanner=new Scanner(System.in);

        double price = 0;
        String items;
        int quantity;
        double total;

        System.out.println("Welcome to your Sushi shop market!");
        System.out.println("Check on the menu and tell us what you would like!");
        System.out.println("\n     ---Menu---\n|Box sushi miam: 20.2$| \n|Box maki sushi: 24$|\n|Box full nigiri: 37.20$|\n|Single sushi: 2.10$|");

        {System.out.println("\nYou made your choice? tell us your choice! only one possible! ");
        items=scanner.nextLine();

        if(items.equalsIgnoreCase("Box sushi miam")){
            items="Box sushi miam";
            price=20.2;

        } else if (items.equalsIgnoreCase("Box maki sushi")) {
            items="Box maki sushi";
            price=24.0;

        } else if (items.equalsIgnoreCase("Box full nigiri")) {
            items="Box full nigiri";
            price=37.20;

        }else if (items.equalsIgnoreCase("Single sushi")) {
            items = "Single sushi";
            price = 2.10;
        }

        System.out.println("Select a quantity for you choice!");
        quantity=scanner.nextInt();
        total=quantity*price;
            System.out.println("Here! You ordered "+quantity+" "+items+"!");
            System.out.println("Your total is "+total+"$!");}

    }
  }

