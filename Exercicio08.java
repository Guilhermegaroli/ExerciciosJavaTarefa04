/*8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto*/

package exercicio2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto na viagem");
		float tempogasto=sc.nextFloat();
		System.out.println("Digita a velocidade media na viagem");
		float velocidade=sc.nextFloat();
		float distancia;
		distancia=tempogasto*velocidade; 
		float litrosusados;
		litrosusados=distancia/12;
		
		System.out.println("A valocidade media durante a viagem é: " +velocidade);
		System.out.println("O tempo gasto na viagem é: " +tempogasto);
		System.out.println("A distancia percorrida é: " +distancia);
		System.out.println("Foram usados: " +litrosusados+ " litros de combustivel durante a viagem");
		sc.close();

	}

}
