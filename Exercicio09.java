/*9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).*/



package exercicio2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Digite o valor da prestação ");
		float valorPrestacao=sc.nextFloat();
	    System.out.println("Digite o valor da taxa de juros"); 
		float taxaJuros=sc.nextFloat();
		System.out.println("Digite o tempo em atraso");
        float tempoAtraso=sc.nextFloat();
        float prestacao=valorPrestacao+(valorPrestacao*taxaJuros/100)*tempoAtraso;
        
        System.out.println("O valor da prestação com juros é: "+prestacao);
        
        sc.close();
        
		
	}

}
