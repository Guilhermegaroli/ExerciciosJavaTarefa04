/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.*/

package exercicio2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario atual");
		float salario=sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste");
		float reajuste=sc.nextFloat();
		
		float novosalario=salario*reajuste/100+salario;
		
		System.out.println("O Valor o novo salario é: "+novosalario);
sc.close();

	}

}
