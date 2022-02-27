//Question: 1 | Amarjeet kumar singh | Roll No: 202002021073
public class Q1 
{
	static int wins = 0;
    	static int draws = 0;
    	static int defeats = 0;
    	static int goals_scored = 0;
    	static int goals_conceded = 0;
    	static int points = 0;
    	public static void main(String args[]) 
	{
        	String results="Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1,Manchester United 3 Fulham 1,Liverpool 2 Manchester United 1,Swansea 2 Manchester United 4";
        	String result_array[]=results.split(",");

        	for(int i=0; i<result_array.length; i++)
        	getResults(result_array[i].trim());

        	final int winCredit = 3;
        	final int drawCredit = 1;
        	final int lossCredit = 0;
        	points = wins*winCredit + draws*drawCredit + defeats*lossCredit;

        	System.out.println("number of wins ="+wins);
        	System.out.println("number of draws ="+draws);
        	System.out.println("number of defeats ="+defeats);
        	System.out.println("goal scored ="+goals_scored);
        	System.out.println("goals conceded ="+goals_conceded);
        	System.out.println("number of points ="+points);
    	}
    	public static void getResults(String result) 
	{
        	String str = result.replaceAll("[^0-9]+", " ");
        	str = str.trim();
        	String scores[]=str.split(" ");
        	int for_ManU, against_ManU;
        	if(result.startsWith("Manchester United")) 
		{
            		for_ManU = Integer.parseInt(scores[0]);
           		against_ManU = Integer.parseInt(scores[1]);
        	}
        	else 
		{
            		against_ManU = Integer.parseInt(scores[0]);
            		for_ManU = Integer.parseInt(scores[1]);
        	}

        	if(for_ManU > against_ManU)
        		wins++;
        	else if(for_ManU < against_ManU)
        		defeats++;
        	else if(for_ManU == against_ManU)
        		draws++;

        	goals_scored += for_ManU;
        	goals_conceded += against_ManU;
    	}
}