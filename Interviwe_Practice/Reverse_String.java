package Interviwe_Practice;

public class Reverse_String {
    public static void main(String[] args){
        String str = "vinay";
        String rev = "";
        int len = str.length();
        System.out.println(len);
        for(int i = len -1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    }