//A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex11 {

	public static void main(String[] args) {
		double a,r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o raio: ");
		r = scan.nextDouble();
		a = Math.PI * (r*r);
		System.out.println("Area: " + a);
	}

}