/*1)Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

package exercicio2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite quantos anos vc tem");

		int ano=sc.nextInt();
		
		System.out.println("Digite quantos meses passaram do seu aniversario");
		
		int mes=sc.nextInt();
		
		System.out.println("digite quantos dias passaram do seu mesversario");
		
		int dia=sc.nextInt();
		int diasvividos=(ano*365)+(mes*30)+dia;
				
		System.out.println("Dias vividos: " +diasvividos);
		sc.close();
	}

}
