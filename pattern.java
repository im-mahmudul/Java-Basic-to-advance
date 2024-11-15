import java.util.Scanner;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print: ");
        int num = sc.nextInt();
         for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j);
            }
            System.out.println();
         }
    } 
}
