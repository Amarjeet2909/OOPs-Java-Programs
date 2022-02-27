// Solution Using Labelled break or labelled continue statement
class LabelContAssign{
    public static void main(String args[]){
	int n = 4;
	first: for(int i=1; i<=n; i++)
	    	{
	   second: for(int j=i; j<n; j++)
		    {
		System.out.print("  ");
	        }
	   third: for(int j=0; j<=i*2-1; j++)
		    {
		if(j==i*2-1)
        {
		    System.out.println();
		    continue first;
        }
		System.out.print(i+" ");
	        }
	    }
    }
}