package SnakeLadder;

public class SnakeLadder {
    public static void main(String[] args) {
        int apos = 0;
        int aflag = 0;
        int apos_temp;

        System.out.println("Snake and Laddar Simulation Game\n\n");
        while (true) 
        {
			
           int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
           if (aflag == 1) 
           {
              int lsvalueA = (int) Math.floor(Math.random() * 10) % 2 + 1;
                
                switch (lsvalueA) 
                {
                    case 1: 
                    {
                        apos_temp = apos;
                        apos += dieA;
                       
                        System.out.println("\n Player A Rolled ! Die Value : " + dieA + "\n Player A Climbed Laddar with +" + dieA);
                        break;
                    }
                    case 2: 
                    {
                        apos -= dieA;
                        if (apos <= 0) 
                        {
                            apos = 0;
                            aflag = 0;
                            System.out.println("\nOh ! Player A is Knocked Out . Need Die value 1 to get inside Game\n");
                            break;
                        }
                        System.out.println("\n Player A Rolled ! Die Value : " + dieA + "\n Player A bitten by snake with -" + dieA );
                        break;
                    }
                }

            }
            if (aflag == 0 && dieA == 1) 
            {
                aflag = 1;
                apos = 1;
                System.out.println("\nPlayer A is entered into Game");
            }
            if (apos >= 100) 
            {
                System.out.println("\n Game Over !\n\n Player A wins");
                return;
            }
        }
    }
}