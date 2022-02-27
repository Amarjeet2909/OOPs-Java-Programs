//Question (e) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr5{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<7;i++)
        {
            if(i==0 || i==6){
                for(j=0;j<7;j++)
                {
                    System.out.print("# ");
                }
                System.out.print("\n");
            }
            else{
                System.out.print("#");
                for(j=0;j<3;j++)
                {
                    System.out.print("   ");
                }
                System.out.print("  #");
                System.out.print("\n");
            }
        }
    }
}
