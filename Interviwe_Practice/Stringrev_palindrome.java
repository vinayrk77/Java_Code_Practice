package Interviwe_Practice;
import java.util.Scanner;

public class Stringrev_palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine().trim().toLowerCase();;
        String org_str = str;
        int len = str.length();
        String rev = "";

        for(int i = len-1; i >=0; i--){
            rev = rev+str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println(org_str+" This is a Palindrome");
        }else{
            System.out.println(org_str+" This is not a Palindrome");
        }
    }
}
