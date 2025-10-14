package sec04.exam;

public class car {
	int gas;
	int minGas; // 한바퀴 돌 때 필요한 Gas
	String teamName;
	String color;
	static int numberOfCars;
	
	car(int gas, String TeamName, String color){
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
	}
	
	boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("Need Fuel");
			return false;
		}
		
		System.out.println("Can run one more");
		return true;
		
	}
	void AddGas(int gas) {
		System.out.println("Full Tank");
		this.gas += gas;
	}
	void RunOneRound()
	{
		System.out.println("One round done");
		this.gas -= minGas;
	}
	
	void ShowNumberOfCars()
	{
		System.out.println
	}
}
