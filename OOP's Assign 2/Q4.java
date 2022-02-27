//Question 4 | Amarjeet kumar singh | Roll no: 202002021073
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Q4 {
    public static void main(String args[]){
    int []a= new int[20];
    int []b= new int[20];
    int n, sml=0, lar=0, i, spos=0, lpos=0, temp ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Numbers of terms: ") ;
    n = sc.nextInt();
    System.out.print("\nEnter the terms : \n") ;
    for (  i = 1 ; i <= n ; i++)
    {
        a[i] = sc.nextInt();
        b[i] = a[i] ;
    }
    sml = a[1] ;
    for (  i = 1 ; i <= n ; i++)
    {
    if ( a[i] <= sml )
    {
    sml = a[i] ;
    spos = i ;
    }
    if ( lar <= a[i] )
    {
    lar = a[i] ;
    lpos = i ;
    }}
    temp = a[spos];
    a[spos] = a[lpos] ;
    a[lpos] = temp ;
    
    System.out.print("The Array enter by user are :\n") ;
    for (  i = 1 ; i <= n ; i++)
    System.out.print(b[i]+" ") ;
    
    System.out.print("\nThe Array after interchanging the largenst and smallest element :\n") ;
    for (  i = 1 ; i <= n ; i++)
    System.out.print(a[i]+" ") ;
    sc.close();
   }   
}