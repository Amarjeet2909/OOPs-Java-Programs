// Solution Using break or continue statement
class ContAssign{
    public static void main(String args[]){
	int n = 4;
	for(int i=1; i<=n; i++)
	    {
	    for(int k=i; k<=n; k++)
	    {
		if(k==n)
		{
		    continue;
		}
		System.out.print("  ");
	    }
	    for(int j=1; j<=i*2-1; j++)
	    {
		System.out.print(i+" ");
	    }
	    System.out.println();
	}
    }
}