//Question (n) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr14 {
    public static void main(String args[])
    {
        int i,j;
        int rows=8;
        for(i=8;i>0;i--)
        {
           for(j=0;j<(rows-i);j++){
               System.out.print("  ");
           }
           for(j=1;j<=i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
        }
    }
}