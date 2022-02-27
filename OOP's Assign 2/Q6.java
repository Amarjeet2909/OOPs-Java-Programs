//Question 6 | Amarjeet kumar singh | Roll no: 202002021073
import java.util.Scanner;
public class Q6
{
    public static void main(String args[])
    {
        int n, nonzero=0, i;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.print("How many Number you want to Enter : ");
        n = scan.nextInt();
		
        System.out.println("Enter " +n+ " Numbers : ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<n; i++)
        {
           if(arr[i]!=0)
           nonzero++;
        }
        scan.close();
        System.out.print("Number of Non-Zeros elements are: " + nonzero );
    }
}