package Practice;

public class Calculate {

	public float calculateInterest(float pr, float rate, float time) {
		return pr*rate*time/100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c1 = new Calculate();
		System.out.println(c1.calculateInterest(4000, 4, 3));
		
	}

}
