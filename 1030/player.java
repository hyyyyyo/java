package game.simple;

public class player {
	int health;
	
	Player(int health){
		this.health;
	}
	
	boolean IsAlive()
	{
		if (health>0)
			return true;
		else
			return false;
	}

}
