//Question (f) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr6 {
    public static void main(String args[])
    {
        int i,k,j;
        for(i=0;i<7;i++)
        {
            if(i==0 || i==6)
            {   
                for(j=0;j<7;j++)
                {
                System.out.print("# ");
                }
                System.out.print("\n");
            }
            else
            {
                    for(k=1;k<=i;k++){
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
