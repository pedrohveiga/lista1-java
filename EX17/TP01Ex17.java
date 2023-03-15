//Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
//cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex17 {

	public static void main(String[] args) {
		double x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira X: ");
		x = scan.nextDouble();
		System.out.print("Insira Y: ");
		y = scan.nextDouble();
		System.out.println("Resultado: " + Math.pow(x, y));
	}

}