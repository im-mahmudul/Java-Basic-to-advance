import java.util.Scanner;
public class maxnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVal = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            if (i == 1){
                maxVal = num;
            }
            else{
                if (num > maxVal) {
                    maxVal = num;
                }
            }
            }
            System.out.println(maxVal + " is the largest number");
        }
    }
