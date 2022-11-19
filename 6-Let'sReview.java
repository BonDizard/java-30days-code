import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();s.nextLine();
        String[] a = new String[n];
        for(int i=0;i<n;i++)
        {
           a[i] = s.nextLine(); 
        }
        for(int i=0;i<n;i++)
        {
            char[] arr = a[i].toCharArray();
            for(int e=0;e<arr.length;e+=2)
            {
                System.out.print(arr[e]);
            }
            System.out.print(" ");
            for(int k = 1 ; k <arr.length; k+=2)
              {
                    System.out.print(arr[k]);
              }            
         System.out.println();
        }
    }
}
