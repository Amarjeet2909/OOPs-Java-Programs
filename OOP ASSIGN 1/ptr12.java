//Question (l) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr12 {
    public static void main(String args[])
    {
    int i,j;
    int rows=11;
    for(i=6;i>=0;i--)
    {
        for(j=0;j<i;j++){
          System.out.print("  ");
        }
        for(j=0;j<((rows)-(2*i));j++){
          System.out.print("# ");
        }
        for(j=0;j<i;j++){
          System.out.print(" ");
        }
        System.out.println();
    }
    for(i=1;i<6;i++)
    {
        for(j=0;j<i;j++){
          System.out.print("  ");
        }
        for(j=0;j<((rows)-(2*i));j++){
          System.out.print("# ");
        }
        for(j=0;j<i;j++){
          System.out.print(" ");
        }
        System.out.println();
    }
}
}