import java.util.Scanner;

public class Area {  //get the result of an area
    public static void main(String[] args){
        double height=0;
        double width=0;
        double area=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a height: ");
        height=scanner.nextDouble();
        System.out.println("Enter a width: ");
        width= scanner.nextDouble();

        area=width*height;
        System.out.println("The area is: "+area+" cm²");


    }
}
