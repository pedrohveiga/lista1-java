//Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
//digitado.
//Pedro Veiga

import java.util.Scanner;

public class TP01Ex03 {

	public static void main(String[] args) {
		float a, d;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira a diagonal do quadrado: ");
		d = scan.nextFloat();
		a = (d * d)/ 2;
		System.out.println("Area: " + a);
	}

}
