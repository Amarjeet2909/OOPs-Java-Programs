//Question (t) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr20 {
    public static void main(String args[]){
        int i,j;
        int rows=8;
        for(i=8;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            if(i==8){
                for(j=(rows-1);j>=1;j--)
                {
                    System.out.print(j+" "); 
                }
            }
            for(j=1;j<(2*(rows-i));j++)
            {
                System.out.print("  ");
            }
            if(i==7 || i==6 || i==5 || i==4 || i==3 || i==2 || i==1)
            {
                for(j=i;j>=1;j--)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}