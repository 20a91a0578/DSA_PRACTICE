import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> Arrays = new ArrayList<ArrayList<Integer>>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int d = sc.nextInt();
        for(int j = 0;j<d;j++){
            int a = sc.nextInt();
            ar.add(a);
        }
        Arrays.add(ar);
    }
    int q = sc.nextInt();
    for(int k = 0; k<q; k++){
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        try{
           System.out.println(Arrays.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    sc.close();
    }
}
