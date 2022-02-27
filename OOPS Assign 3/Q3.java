//Question: 3 | Amarjeet kumar singh | Roll No: 202002021073
import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
       int i,temp=0;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the string: ");
       String s= scan.nextLine();
       scan.close();
       char[] A = new char[s.length()+1];
       for(i = 0; i < s.length(); i++) {
            A[i] = s.charAt(i);
        }
       for(i=0;i<A.length;i++){
            if(A[i]==' '){
               if(A[i-1]=='y' || A[i-1]=='Y' || A[i-1]=='z' || A[i-1]=='Z'){
                  temp++;
               }
            }
            else if(i==(A.length-2)){
                if(A[i]=='y' || A[i]=='Y' || A[i]=='z' || A[i]=='Z'){
                    temp++;
                 } 
            }
       }
       System.out.println(temp);  
    }
}