//Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
//digitado.
////Pedro Veiga
import java.util.Scanner;

public class TP01Ex02 {

	public static void main(String[] args) {
		float a, l;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o lado do quadrado: ");
		l = scan.nextFloat();
		a = l * l;
		System.out.println("area: " + a);
	}

}
