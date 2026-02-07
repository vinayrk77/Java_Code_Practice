package If_Condition_Practice;
import java.util.*;

public class ex_03_if_else_User {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("It is a positive number");
        }else if (num < 0){
            System.out.println("It is a negative number");
        }else{
            System.out.println("The number you provided is zero");
        }
        scanner.close();
    }
}
