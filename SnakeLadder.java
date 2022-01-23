package SnakeLadder;

public class SnakeLadder
{
	//position variable
	int apos = 0;
	public static void main(String[] args)
	{
	
	   {
		   System.out.println(" Snake and Laddar Simulation Game ");
		
		   int dieA = (int) Math.floor(Math.random()*10) % 6 + 1;
		   
				System.out.println(" Player A Rolled ! Die Value: "+dieA);
		
				int isValueA = (int) Math.floor(Math.random()*10) % 3 + 1;
				switch ( isValueA ) 
				{
					case 1 :
						
						System.out.println(" You climbed a ladder at: " +dieA);
						break;
		         
					case 2 :
						
						System.out.println(" You got bitten by a snake at: " +dieA);
						break;
		         
					default :
						
						System.out.println(" You hold your position at: " +dieA);
			
				}
	   }
	}
}	
