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

		double delta = b * b - 4 * a * c;

		if (delta < 0) {

			System.out.println("Essa equacao nao possui raizes reais");

		} else if (delta == 0) {

			double x = (-b + Math.sqrt(delta)) / (2 * a);

			System.out.println("X = " + x);

		} else {

			double x1 = (-b + Math.sqrt(delta)) / (2 * a);

			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			if (b > 0) {

				System.out.println(a + " X²" + b + " + X " + c);

			} else {

				if (c > 0) {
					System.out.println(a + "X²" + b + " X +" + c);
				} else {
					if (b > 0 || c > 0) {
						System.out.println(a + "X²" + b + " + X +" + c);
					}
				}
			}

			System.out.println(a + "X²" + b + "X" + c);
			System.out.println("X1 = " + x1 + " e X2 = " + x2);

		}

	}

}
