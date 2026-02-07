package If_Condition_Practice;
import java.util.*;

public class Ex_04_Even_Odd_User {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("This is a negative number please enter positive");
        }else if(number %2 == 0){
            System.out.println("The number is Even Number");
        }else{
            System.out.println("The number is Odd number");
        }
        scanner.close();
    }
}
