package SnakeLadder;


public class SnakeLadder {
	public static void main(String[] args) 
	{
		int apos=0;
		int bpos=0;

		int aflag=0;
		int bflag=0;
		
		int apos_temp;
		int bpos_temp;
		
		int dieRolls=0;
		
		System.out.println("Snake and Ladder Simulation Game\n\n");
		while(true) 
		{
			dieRolls++;
//Player A
			int dieA=(int)Math.floor(Math.random()*10)%6 + 1;
			if(aflag==1)
			{
				int lsvalueA=(int)Math.floor(Math.random()*10)%2 +1;

				switch(lsvalueA) 
				{
					case 1 : 
					{
						apos_temp=apos;
						apos+=dieA;
						if(apos>100) 
						{
							apos=apos_temp;
							System.out.println("\nPlayer A need to get Die value "+(100-apos)+" to win\n");
							break;
						}
						System.out.println("\n Player A Rolled ! Die Value : "+dieA +"\n Player A Climbed Ladder with +"+dieA+"\n Player A's current position: "+apos+"\n");
						break;
					}
					case 2:
					{
						apos-=dieA;
						if(apos<=0) 
						{
							apos=0;
							aflag=0;
							System.out.println("\nOh ! Player A is Knocked Out . Need Die value 1 to get inside Game\n");
							break;
						}
						System.out.println("\n Player A Rolled ! Die Value : "+dieA +"\n Player A bitten by snake with -"+dieA+"\n Player A's current position: "+apos+"\n");
						break;
					}
				}
				
			}
			if(aflag==0 && dieA==1) 
			{
				aflag=1;
				apos=1;
				System.out.println("\nPlayer A is entered into Game!! \n Player A's current position : "+apos+"\n");
			}
			if(apos>=100) 
			{
				System.out.println("\n Game Over !\n\n Player A wins with "+dieRolls+ " Die Rolls\n");
				return;
			}
			
//Player B
			int dieB=(int)Math.floor(Math.random()*10)%6 + 1;
			if(bflag==1) 
			{
				int lsvalueB=(int)Math.floor(Math.random()*10)%2 +1;

				switch(lsvalueB) 
				{
					case 1 : 
					{
						bpos_temp=bpos;
						bpos+=dieB;
						if(bpos>100) 
						{
							bpos=bpos_temp;
							System.out.println("\nPlayer B need to get Die value "+(100-bpos)+" to win\n");
							break;
						}
						System.out.println("\n Player B Rolled ! Die Value : "+dieB +"\n Player B Climbed Ladder with +"+dieB+"\n Player B's current position : "+bpos+"\n");
						break;
					}
					case 2:
					{
						bpos-=dieB;
						if(bpos<=0) 
						{
							bpos=0;
							bflag=0;
							System.out.println("\nOh ! Player B is Knocked Out . Need Die value 1 to get inside Game\n");
							break;
						}
						System.out.println("\n Player B Rolled ! Die Value : "+dieB +"\n Player B bitten by snake with -"+dieB+"\n Player B's current position : "+bpos+"\n");
						break;
					}
				}
				
			}
			if(bflag==0 && dieB==1) 
			{
				bflag=1;
				bpos=1;
				System.out.println("\nPlayer B is entered into Game!! \n Player A's current position : "+bpos+"\n");
			}
			if(bpos>=100) 
			{
				System.out.println("\n Game Over !\n\n Player B wins with "+dieRolls+ " Die Rolls");
				return;
			}
	
		}

		
	}

}