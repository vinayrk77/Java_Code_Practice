package Interviwe_Practice;

public class Palindrome_String {
    public static void main(String[] args){
        String str = "vinay";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)){
            System.out.println("paindrome");
        } else{
            System.out.println("not a pallindrome");
        }
    }
}
