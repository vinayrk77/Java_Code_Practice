package Interviwe_Practice;

public class Linear_Search {
    public static void main(String[] args){
        int a[] = {1,2,3,55,67,69};
        int search_ele = 69;
        boolean flag = false;
        for(int i=0; i<a.length; i++)
        {
            if(search_ele==a[i])
            {
                System.out.println("Element found at: "+i);
                flag = true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }
}
