//Question (p) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr16 {
    public static void main(String args[]){
        int i,j;
        int rows=8;
        for(i=8;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            for(j=0;j<=(rows-i);j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}