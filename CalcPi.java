// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int countPi = Integer.parseInt(args[0]);
		double sumPi = 0.0 ;
		for (int i = 0; i < countPi; i++) {
			if(i % 2 == 0){
				sumPi += (1.0 / (2 * i + 1));
			}else {
				sumPi -= (1.0 / (2 * i + 1));
			}
			
		}
				sumPi *= 4;
				System.out.println("pi according to Java: " + Math.PI);

		        System.out.printf("pi, approximated:     %.15f\n", sumPi);

	}
}
