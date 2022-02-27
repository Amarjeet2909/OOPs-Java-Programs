//Question 5 | Amarjeet kumar singh | Roll no: 202002021073
public class Q5 {
  
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
  
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 10, 10, 20, 20, 20 };
        int n = a.length;
  
        n = removeduplicates(a, n);
        System.out.print("Elements after deleting deplicates is: ");   
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}