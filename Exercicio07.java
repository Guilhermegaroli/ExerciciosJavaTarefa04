/*7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura*/


package exercicio2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Digite o valor de raio");
	 float raio=sc.nextFloat();
	    System.out.println("Difite o valor da altura");
	 float altura=sc.nextFloat();
	 double volume;
	 volume=Math.PI*(raio*raio)*altura;
	 
	 System.out.println("O volume de lata de óleo é: " +volume);
	 
	 sc.close();
	 
	}

}
