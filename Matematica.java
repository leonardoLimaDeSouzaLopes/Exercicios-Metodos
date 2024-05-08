public class Matematica {

	public boolean formaTriangulo(double a, double b, double c) {

		if (a > b + c || b > a + c || c > a + b) {

			return false;
		}

		return true;
	}

	public int fatorial(int numero) {

		int fatorial = 1;

		while (numero > 0) {

			fatorial *= numero;

			numero--;
		}

		return fatorial;
	}

	public void paresEntreZeroECem() {

		int i;

		for (i = 0; i < 100; i += 2) {

			System.out.print(i + " ");

		}
		
		System.out.println(i);
	}

	public void bhaskara(double a, double b, double c) {
		
		int aInt = (int) a;
		int bInt = (int) b;
		int cInt = (int) c;

		System.out.print("\n" + aInt + "X² ");
		if (b > 0) {
			System.out.print("+ " + bInt + "X ");
		} else if (b < 0) {
			System.out.print("- " + Math.abs(bInt) + "X ");
		}
		if (c > 0) {
			System.out.println("+ " + cInt);
		} else if (c < 0) {
			System.out.println("- " + Math.abs(cInt));
		}

		
		double delta = b * b - 4 * a * c;

		System.out.println("\nDelta = " + bInt + "²" + " - 4 * " + aInt + " * " + cInt);

		System.out.println("\nDelta = " + delta);
		

		if (delta < 0) {

			System.out.println("\nEssa Equacao Nao Possui Raizes Reais");

		} else if (delta == 0) {

			double x = (-b + Math.sqrt(delta)) / (2 * a);
			
			int deltaInt = (int) delta;
			
			if (b > 0) {
				System.out.println("\nX1 = ( -" + bInt + " + √" + deltaInt + " ) / ( 2 * " + aInt + " )");
			} else {
				System.out.println("\nX1 = ( " + bInt + " + √" + deltaInt + " ) / ( 2 * " + aInt + " )");
			}

			System.out.println("X = " + x);

		} else {

			double x1 = (-b + Math.sqrt(delta)) / (2 * a);

			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			int deltaInt = (int) delta;

			if (b > 0) {
				System.out.println("\nX1 = ( -" + bInt + " + √" + deltaInt + " ) / ( 2 * " + aInt + " )");
				System.out.println("\nX2 = ( -" + bInt + " - √" + deltaInt + " ) / ( 2 * " + aInt + " )");
			} else {
				System.out.println("\nX1 = ( " + bInt + " + √" + deltaInt + " ) / ( 2 * " + aInt + " )");
				System.out.println("\nX2 = ( " + bInt + " - √" + deltaInt + " ) / ( 2 * " + aInt + " )");
			}

			System.out.println("\nX1 = " + x1 + " e X2 = " + x2);

		}

	}

}
