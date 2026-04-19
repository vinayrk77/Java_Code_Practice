package Interviwe_Practice;

public class CountSumOfDigits {
    public static void main(String [] args){
        int num = 345678;
        int sum = 0;
        while(num>0){
            sum = sum+num%10;
            num=num/10;
        }
        System.out.println("The sum of fiven digits is:" +sum);
    }
}
