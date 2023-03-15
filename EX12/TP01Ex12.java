//Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
//base que serão digitados.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex12 {
    
    public static void main(String[] args){
        double a, r, v;
    	Scanner scan = new Scanner(System.in);
	System.out.print("Raio da circunferencia da base do cone: ");
    	r = scan.nextFloat();
    	System.out.print("Altura do cone: ");
    	a = scan.nextFloat();
    	v = (Math.PI * (r*r) * a)/3;    	
    	System.out.println("Volume: " + v);
    }
}