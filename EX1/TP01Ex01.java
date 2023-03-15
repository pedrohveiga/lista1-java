//Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
//área.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex01 {
    
    public static void main(String[] args){
	
        float b, h, a;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("altura do retangulo: ");
    	h = scan.nextFloat();
    	
    	System.out.print("base do retangulo: ");
    	b = scan.nextFloat();
    	
    	a = b * h;
    	
    	System.out.println("A area calculada e: " + a);
    }
}