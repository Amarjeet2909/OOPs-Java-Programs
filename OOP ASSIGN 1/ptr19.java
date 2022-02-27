//Question (s) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr19 {
    public static void main(String args[]){
        int i,j;
        int row=8;
        for(i=1;i<9;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            if(i==8)
            {
                for(j=(row-1);j>=1;j--){
                System.out.print(j+" ");
                }
            }
            for(j=1;j<(2*(row-i));j++)
            {
                System.out.print("  ");
            }
            if(i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7){
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
               }
            System.out.println();
        }
    }
}