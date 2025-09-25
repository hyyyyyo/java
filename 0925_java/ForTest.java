package sec03.exam01;

public class ForTest {

	public static void main(String[] args) {
		int[] scores = {91, 75, 84, 83, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			// TODO Auto-generated method stub
		}
		
		System.out.println("Sum : " + sum);

	}

}
