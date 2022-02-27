//Question: 2 | Amarjeet kumar singh | Roll No: 202002021073
import java.util.Scanner;
class Q2 {
    public static void main(String args[]){
       char temp;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the string: ");
       String s= scan.nextLine();
       char[] ch = new char[s.length()+1];
       for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
       for(int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                    if (ch[j] > ch[i]) {
                            temp = ch[i];
                            ch[i] = ch[j];
                            ch[j] = temp;
                    }
            }
    } 
    System.out.println("String after arranging in Alphabetical Order: ");
       for(int j=0;j<=s.length();j++){
           System.out.print(ch[j]);
       }
       scan.close();
    }
}