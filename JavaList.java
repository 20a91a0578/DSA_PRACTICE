import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> ar=new  ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            ar.add(a);
        }
        // System.out.println(ar);
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            String qu=sc.next();
            
            if(qu.equals("Insert")){
                int p=sc.nextInt();
                int ele=sc.nextInt();
                ar.add(p,ele);
            }
            if(qu.equals("Delete")){
                int q=sc.nextInt();
                ar.remove(q);
            }
        }
        for(Integer i:ar)
        System.out.print(i+" ");
    }
    
}
