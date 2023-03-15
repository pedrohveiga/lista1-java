//Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
//valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
//Pedro Veiga

import java.util.Scanner;

public class TP01Ex09 {

	public static void main(String[] args) {
		double c,r,T;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira a corrente: ");
		c = scan.nextDouble();
		System.out.print("Insira a resistencia: ");
		r = scan.nextDouble();
		T = r*c;
		System.out.println("Tensao: " + T);
	}

}
