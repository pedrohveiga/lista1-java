//Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
//r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão
//digitados.
//Pedro Veiga
import java.util.Scanner;


public class TP01Ex14 {
    
    public static void main(String[] args){
	double resto, vesfera, vcubo;
        double r, ar;
    	Scanner scan = new Scanner(System.in);      
    	System.out.print("Raio: ");
    	r = scan.nextFloat();
	System.out.print("Aresta: ");
    	ar = scan.nextFloat();
	vesfera= (4 * Math.PI * Math.pow(r,3))/3;
	vcubo = Math.pow(ar,3);
    	resto = vcubo - vesfera;
    	System.out.println("O resto livre e: " + resto);
    }
}