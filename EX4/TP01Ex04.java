//A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex04 {
    
    public static void main(String[] args){
        float b, h, a;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Insira a altura do triangulo: ");
    	h = scan.nextFloat();
    	System.out.print("Insira a base do triangulo: ");
    	b = scan.nextFloat();
    	a = (b*h)/2;
    	System.out.println("Area: "+ a);
    }
}