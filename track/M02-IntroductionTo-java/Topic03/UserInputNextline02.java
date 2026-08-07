
import java.util.Scanner;

public class UserInputNextline02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Always use nextline() in first 
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("full name: " + name);

        System.out.println("Enter age :");
        int age = scan.nextInt();
        System.out.println("Age is : " + age);

        scan.nextLine(); //if we use inbetween or last then use this line

        System.out.println(" enter the other name :");
        String Oname = scan.nextLine();
        System.out.println("Oname is : " + Oname);

        System.out.println("enter the height :");
        double height = scan.nextDouble();
        System.out.println("Height is : " + height);

    }

}
