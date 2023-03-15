//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
//dólares. Calcular e exibir o valor correspondente em Reais (R$).
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex15 {

	public static void main(String[] args) {
		double d, r, dr;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o valor em dolares que deseja consultar: ");
		d = scan.nextDouble();
		System.out.print("Insira o valor do dolar: ");
		dr = scan.nextDouble();
		r = d * dr;
		System.out.println("O valor em reais e de " + r);
	}

}
