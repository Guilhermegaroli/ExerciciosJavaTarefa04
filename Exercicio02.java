/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores*/

package exercicio2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero total de eleitores");
		float eleitores=sc.nextFloat();
		System.out.println("Digite o numero total de votos brancos");
		float brancos=sc.nextFloat();
		System.out.println("Digite o numero total de votos nulos");
		float nulos=sc.nextFloat();	
		System.out.println("Digite o numero total de votos validos");
		float validos=sc.nextFloat();
		float percentualvotosbrancos=brancos*100/eleitores;
		float percentualvotosnulos=nulos*100/eleitores;
		float percenltualvotosvalidos=validos*100/eleitores;
		
		System.out.println("Percentual de votos brancos: " +percentualvotosbrancos+ "%");
		System.out.println("Percentual de votos nulos: " +percentualvotosnulos+ "%");
		System.out.println("Percentual de votos validos: " +percenltualvotosvalidos+ "%");

		sc.close();
				
		

	}

}
