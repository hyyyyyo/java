package game.simple;

public class Dragon {
	int power;
	int reward;
	int winRatio;
	
	Dragon(int power, int reward, int winRatio){
		this.power = power;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val < 50) {
			Damage(player);
		}
		else {
			System.out.println("Player Win!!");
			Reward(player);
		}
	}
	
	void Damage(Player player) {
		player.health -= power;
	}
	void Damage(Player player) {
		player.health += reward;
	}
	
	}

}
