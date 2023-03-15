//Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
//valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
//(em s) que serão digitados.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex13 {

	public static void main(String[] args) {
		final double ms = 3.6;
		double kmh, ac, kminicial, t;
		Scanner scan = new Scanner(System.in);
		System.out.print("Quilometragem inicial: ");
		kminicial = scan.nextDouble();
		System.out.print("Quanto tempo? (hora): ");
		t = scan.nextDouble();	
		System.out.print("Aceleracao: ");
		ac = scan.nextDouble();
		kmh = kminicial + ((ac * t) * ms);
		System.out.println("Velocidade final: " + kmh);
	}

}
