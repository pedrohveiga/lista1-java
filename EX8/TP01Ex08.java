//Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
//dois metros e que um quilômetro possui mil metros, fazer um programa para
//converter milhas marítimas em quilômetros.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex08 {
    
    public static void main(String[] args){
	float milha = 1852;
	float km = 1000;
      	float milhastotais, kmtotais;
    	Scanner scan = new Scanner(System.in); 
    	System.out.print("Insira o valor em milhas: ");
    	milhastotais = scan.nextFloat();
    	kmtotais = (milhastotais * milha) / km;
    	System.out.println("A conversao em quilometros e igual a: " + kmtotais);
    }
}