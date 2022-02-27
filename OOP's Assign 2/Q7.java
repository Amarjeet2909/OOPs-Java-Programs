//Question 7 | Amarjeet kumar singh | Roll no: 202002021073
import java.util.Scanner;
public class Q7 {
    public static void getPairsCount(int[] arr)
    {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 50)
                {
                    System.out.println("Pair with a given sum " + "50" +
                                       " is (" + arr[i] + ", " + arr[j] + ")");
                }
    }
    public static void main(String args[])
   {
        int  []arr = new int[10];
        System.out.print("Enter 10 elements in the Array: ");
        Scanner scan = new Scanner(System.in);
        for(int j=0; j<10; j++)
           arr[j] = scan.nextInt();
        getPairsCount(arr);
        scan.close();
    }
}