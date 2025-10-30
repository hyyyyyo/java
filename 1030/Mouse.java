package game.simple;

public class Mouse {
	int food;
	int reward;
	int winRatio;
	
	Dragon(int food, int reward, int winRatio){
		this.food = food;
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
			System.out.println("Mouse Win!!");
			Reward(player);
		}
	}
	
	void Damage(Player player) {
		player.health -= power;
	}
	void Damage(Player player) {
		player.health += reward;
}
