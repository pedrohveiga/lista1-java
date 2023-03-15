//Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
//exibir sua temperatura equivalente em Fahrenheit.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex10 {
    
    public static void main(String[] args){
        double cel, fah;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Insira os graus em celsius: ");
    	cel = scan.nextFloat();
    	fah = 1.8 * (cel + 32);	
    	System.out.println("A conversao em fahrenheit e: " + fah);
    }
}