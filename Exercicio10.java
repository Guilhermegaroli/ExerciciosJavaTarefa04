/*10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.*/


package exercicio2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		int valora=sc.nextInt();
		System.out.println("Digite o valor B");
		int valorb=sc.nextInt();
		int a,b;
		a=valorb;
        b=valora;
        
	     System.out.println("O valor de A é: " +a);
	     System.out.println("O valor de B é: " +b);
	     sc.close();

	}

}
