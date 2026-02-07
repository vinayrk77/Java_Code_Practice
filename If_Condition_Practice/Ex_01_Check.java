package If_Condition_Practice;

public class Ex_01_Check {
    public static void main(String[] args){
        int num = 0;

        if(num > 0){
            System.out.println("positive number");
        }else if(num < 0){
            System.out.println("Negative number");
        }else{
            System.out.println("Number is zero but you are hero");
        }
    }
}
