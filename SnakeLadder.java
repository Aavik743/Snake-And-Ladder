package SnakeLadder;

public class SnakeLadder
{
	//position variable
	int apos = 0;
	public static void main(String[] args) 
	{
		System.out.println("Snake and Laddar Simulation Game");
		int dieA = (int) Math.floor(Math.random()*10)%6 + 1;
		System.out.println("Player A Rolled ! Die Value: "+dieA);
	}
}