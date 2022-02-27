//Question 9 | Amarjeet kumar singh | Roll no: 202002021073
import java.util.HashSet;
public class Q9{    
   public static void main(String[] args) {
        int A[] = {49, 1, 3, 200, 2, 4, 70, 5};  
		System.out.println("\nThe longest consecutive element sequence is: "+ls(A));
    }
    
    public static int ls(int[] A) {
      final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : A) h_set.add(i);

        int ls_len = 0;
        for (int i : A) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            ls_len = Math.max(ls_len, length);
        }
        return ls_len;
    }
}