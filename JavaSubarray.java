import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n,i,j,sum,c=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<a.length;i++)
        a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=i;j<n;j++)
            {
                sum+=a[j];
            if(sum<0)
            c++;
            }
        }
        System.out.println(c);
    }
}
