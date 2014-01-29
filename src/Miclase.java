import java.util.Scanner;


public class Miclase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner mi_scanner = new Scanner (System.in);
		int mi_variable = mi_scanner.nextInt();
		//System.out.print(mi_variable);
		if (mi_variable==10)
      {
		System.out.print("ES un 10");
	}
		else {
			System.out.print("no es el numero 10");
		}
	}
}