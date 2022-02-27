//Question: 4 | Amarjeet kumar singh | Roll No: 202002021073
import java.util.Scanner;
public class Q4{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the string: ");
       String s= scan.nextLine();
       scan.close();
       char[] A = new char[s.length()+1];
       for(int i = 0; i < s.length(); i++) {
            A[i] = s.charAt(i);
        }
        System.out.print("String after modification is: ");
        for(int k=0;k<A.length;k++){
            if(k==0 && A[k]=='a')
              System.out.print(A[k]);
            else if(k==1 && A[k]=='b')
                System.out.print(A[k]);  
            else if(k>1)
            System.out.print(A[k]);
        }
    }
}