//Question (c) Name: Amarjeet kumar singh | Roll no: 202002021073
class ptr3 {
    public static void main(String args[])
    {
        int i,j;
        int k=0;
        for(i=8;i>0;i--)
        {
           for(j=i;j>0;j--)
           {
               System.out.print("# ");
           }
           System.out.print("\n");
           if(k==0){
           System.out.print("  ");
           k++;
           }
           else if(k==1){
            System.out.print("    ");
            k++;
           }
           else if(k==2){
            System.out.print("      ");
            k++;
           }
           else if(k==3){
            System.out.print("        ");
            k++;
           }
           else if(k==4){
            System.out.print("          ");
            k++;
           }
           else if(k==5){
            System.out.print("            ");
            k++;
           }
           else if(k==6){
            System.out.print("              ");
           }
        }
    }
}
