package Interviwe_Practice;

public class Duplicate_Elements {
    public static void main(String[] args){
        String a[] = {"Books","pen","paper","Scale","Books"};
        boolean flag = false;

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i].equals(a[j]))
                {
                    System.out.println("Duplicate element found: "+a[i]);
                    flag = true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("No Duplicate element found");
        }

    }
}
