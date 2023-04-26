import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String str, int number) {
     String smallest = ""; String largest = "";

    for(int i=0;i<=str.length()-number;i++){
        int range = i + number;
        String subStringI = str.substring(i,range);
        if(subStringI.compareTo(largest)>0){
            largest=subStringI;
        }
        if(subStringI.compareTo(smallest)<0){
            smallest=subStringI;
        }
        if(i==0){
            smallest=subStringI;
        }
    }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}