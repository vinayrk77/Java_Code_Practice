package Interviwe_Practice;

public class Swap_Two_Numbers {
    public static void main(String args[]) {
        int a = 300;
        int b = 400;
        System.out.println("Numbers before swapping are..."+a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Numbers after swapping are..."+a+" "+b);
    }
}
