//Question (u) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr21 {
    public static void main(String args[]){
        int i,j;
        int rows=8;
        for(i=1;i<9;i++)
        {
            for(j=0;j<(rows-i);j++)
            {
                System.out.print("  ");
            }
            if(i==1 || i==2 || i==3 || i==4 || i==5)
            for(j=i;j<(2*i);j++)
            {
                System.out.print(j+" ");
            }
            if(i==2 || i==3 || i==4 || i==5)
            for(j=((i)+(i-2));j>=i;j--)
            {
                System.out.print(j+" ");
            }
            if(i==6 || i==7 || i==8)
            for(j=i;j<10;j++)
            {
                System.out.print(j+" ");
            }
            if(i==6 || i==7 || i==8)
            for(j=0;j<=1;j++)
            {
                System.out.print(j+" ");
            }
            if(i==6)
            System.out.print("0 ");
            if(i==7)
        {
            for(j=2;j<=3;j++)
            {
                System.out.print(j+" ");
            }
            for(j=2;j>=0;j--)
            {
                System.out.print(j+" ");
            }
        }
        if(i==8){
        for(j=2;j<=5;j++){
            System.out.print(j+" ");
        }
        for(j=4;j>=0;j--){
            System.out.print(j+" ");
        }
    }
        if(i==6 || i==7 || i==8)
        for(j=9;j>=i;j--){
            System.out.print(j+" ");
        }
            System.out.println();
        }
    }
}