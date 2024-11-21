import java.util.Scanner;

public class breakDemo{

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        //int id = input.nextInt();
        for(int i = 1; i <= 10; i++){
            if( i == 6 || i == 8 ){
                continue;
            }
            System.out.println(i+" chocolate given");
        }
    }
}