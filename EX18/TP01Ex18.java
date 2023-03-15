//Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
//valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
//que deverá ser devolvido.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex18 {
    
    public static void main(String[] args){
	float valortotal, troco;
        float v, w, x, y, z;
	Scanner scan = new Scanner(System.in);
    	System.out.print("Primeiro produto: ");
    	v = scan.nextFloat();
	System.out.print("Segundo produto: ");
    	w = scan.nextFloat();
	System.out.print("Terceiro produto: ");
    	x = scan.nextFloat();
	System.out.print("Quarto produto: ");
    	y = scan.nextFloat();
	System.out.print("Quinto produto: ");
    	z = scan.nextFloat();
	System.out.print("Valor total: ");
    	valortotal = scan.nextFloat();
	troco = valortotal - (v+w+x+y+z);
    	System.out.print("Troco: " + troco);
    }
}