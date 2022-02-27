//Question (g) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr7 {
    public static void main(String args[])
    {
        int i,j,k;
        for(i=7;i>0;i--)
        {
            if(i==1 || i==7)
            {   
                for(j=0;j<7;j++)
                {
                System.out.print("# ");
                }
                System.out.print("\n");
            }
            else
            {
                    for(k=1;k<i;k++){
                    System.out.print("  ");
                    }
                    for(k=1;k<=1;k++){
                    System.out.print("# ");
                    }
                    System.out.print("\n");
            }
        }
    }
}