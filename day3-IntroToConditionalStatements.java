import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;


public class Solution 
{ 
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if(n%2!=0)
    {
     System.out.println("Weird");
    }
    else if(n<=5)
     {
     System.out.println("Not Weird");
     }
     else if(n<=20)
     {
     System.out.println("Weird");
     }
     else
    {
    System.out.println("Not Weird");
     }
   
 }
}
        

       

