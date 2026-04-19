package Interviwe_Practice;
import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number:");
        int b = scanner.nextInt();
        System.out.println("Enter the Third Number:");
        int c = scanner.nextInt();

        if(a>b && a>c){
            System.out.println(a+ " is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is the largest number");
        }else{
            System.out.println(c+ " is the largest number");
        }
    }
}
