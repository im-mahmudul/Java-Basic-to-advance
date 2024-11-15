import java.util.Scanner;
public class learn{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name here: ");
        String name = input.nextLine();
        System.out.println("Enter your student ID: ");
        int ID = input.nextInt();
        System.out.println("Enter your CGPA: ");
        double cpga = input.nextDouble();
        input.nextLine();
        System.out.println("Enter your Department: ");
        String dpt = input.nextLine();
        input.close();

        System.out.println("Your name is " +name);
        System.out.println("Your Student ID is: " + ID);
        System.out.println("Your CGPA is " + cpga);
        System.out.println("Your department is " + dpt);
        
    }
}