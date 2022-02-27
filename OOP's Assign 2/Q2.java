//Question 2 | Amarjeet kumar singh | Roll no: 202002021073
public class Q2 {
    public static void main(String args[])
    {
        int sum=0,p,i;
        System.out.print("\n Perfect numbers between 1 and 100 are: ");
        for(i= 1; i<= 1000; i++){
        p=1;
        while(p<=(i/2)){
        if(i % p == 0)
        sum=sum+p;
        p++;
        }
        if(sum==i)
        System.out.print(" " + i);
        sum=0;
        }
    }
}