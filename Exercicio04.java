/*4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/



package exercicio2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite o custo de fábrica do carro");	

	float custofabrica=sc.nextFloat();
	float imposto, distribuidor, custofinal;
	
	imposto=custofabrica*45/100;
	distribuidor=custofabrica*28/100;
	custofinal=custofabrica+imposto+distribuidor;
	
	
	System.out.println("O custo final do carro para o consumidor é: " +custofinal);
	
	sc.close();
	
	}

}
