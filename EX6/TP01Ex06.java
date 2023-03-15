//Calcular e exibir a média aritmética de quatro valores quaisquer que serão
//digitados.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex06 {
    
    public static void main(String[] args){
        float w, x, y, z, media;
	int n;
    	Scanner scan = new Scanner(System.in);
	n = 4;
    	System.out.print("Primeiro valor: ");
    	w = scan.nextFloat();
	System.out.print("Segundo valor: ");
    	x = scan.nextFloat();
	System.out.print("Terceiro valor: ");
    	y = scan.nextFloat();
	System.out.print("Quarto valor: ");
    	z = scan.nextFloat();
    	media = (w + x + y + z)/n;
    	
    	System.out.println("Media: " + media);
    }
}