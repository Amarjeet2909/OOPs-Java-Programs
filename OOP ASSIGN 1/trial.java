import java.util.*;
import java.util.Scanner;
public class trial {
    public static void main(String args[]){
        int count=1;
        int max=0;
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("How many Number you want to Enter : ");
        n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
           arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if((arr[k]-arr[k-1])==1){
                    count++;
                }
                else
                break;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
        scan.close();
    }
}