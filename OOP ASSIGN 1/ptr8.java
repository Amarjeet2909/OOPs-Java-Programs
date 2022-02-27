//Question (h) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr8 {
    public static void main(String args[])
    {
        int i,j,k;
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
                if(i==1 || i==5)
                System.out.print("  ");
                if(i==2 || i==4)
                System.out.print("    ");
                if(i==3)
                System.out.print("      ");
                System.out.print("# ");
                if(i==1 || i==5){
                    for(k=0;k<3;k++){
                        System.out.print("  ");
                    }
                    System.out.print("#"); 
                }
                if(i==2 || i==4){
                        System.out.print("  ");
                        System.out.print("#");
                }
                for(k=0;k<i;k++){
                    System.out.print("  ");
                }
                System.out.print("\n");
            }
        }
    }
}