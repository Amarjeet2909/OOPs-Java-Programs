class myptr {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                if(j==1)
                System.out.print("1 ");
                else
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){

                if(j==i)
                System.out.print("1 ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
