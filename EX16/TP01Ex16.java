//Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
//seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
//Lembre-se que uma função trigonométrica trabalha em radianos.
//Pedro Veiga
import java.util.Scanner;
import java.lang.Math;

public class TP01Ex16 {
    
    public static void main(String[] args){
        double sen, cos, tan;
	double ang, rad, sec;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o angulo: ");
        ang = scan.nextInt();
	rad = Math.toRadians(ang);
        sen = Math.sin(rad);
        cos = Math.cos(rad);
        tan = Math.tan(rad);
        sec = 1 / sen;

	System.out.println("Secante: " + sec);
        System.out.println("Seno: " + sen);
        System.out.println("Cosseno: " + cos);
        System.out.println("Tangente: " + tan);
    }
}