package Interviwe_Practice;

public class Max_Min_ofArray {
    public static void main(String[] args){
        int a[] = {300,400,500,800};
        int max =a[0];
        for(int i =1; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum value in a array is: " +max);
        int min =a[0];
        for(int i =1; i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum value in a array is: " +min);
    }
}
