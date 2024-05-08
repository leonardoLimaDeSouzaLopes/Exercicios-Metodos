import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Matematica matemas = new Matematica();

		rotina: while (true) {

			System.out.println("O que deseja fazer\n1 - Verifica se 3 Valores Forma um Triangulo\n2 - Fatorial\n3 - Pares Entre 0 e 100\n4 - Calcular Formula de Bhaskara\n5 - Sair");

			int resposta = ler.nextInt();

			System.out.println("");
			
			switch (resposta) {
			
			case 1:
				System.out.println("Insira os lados do Triangulo");
				System.out.println(matemas.formaTriangulo(ler.nextDouble(), ler.nextDouble(), ler.nextDouble())
						? "Esses Valores Formam um Triangulo"
						: "Esses Valores Nao Formam um Triangulo");
				break;
				
			case 2:
				System.out.println("Insira um Numero para o Fatorial");
				int numero = ler.nextInt();
				System.out.println(numero + "! = " + matemas.fatorial(numero));
				break;
				
			case 3:
				System.out.println("Numeros Pares de 0 a 100");
				matemas.paresEntreZeroECem();
				break;
				
			case 4:
				System.out.println("Insira o A, B e o C para Calcular as Duas Raizes Usando a Formula de Bhaskara");
				matemas.bhaskara(ler.nextDouble(), ler.nextDouble(), ler.nextDouble());
				break;
				
			case 5:
				System.out.println("Obrigado Por Usar Nossos Servicos");
				break rotina;
				
			default:
				System.out.println("Entrada Invalida");
			}
			
			ler.nextLine();
			ler.nextLine();
		}

		ler.close();

	}

}
