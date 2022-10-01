package beecrowd;

public class Problema1009 {

	public static void main(String[] args) {
		
//Faça um programa que leia o nome de um vendedor,
//o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
//informar o total a receber no final do mês, com duas casas decimais.

//Entrada
//O arquivo de entrada contém um texto (primeiro nome do vendedor) 
//e 2 valores de dupla precisão (double) com duas casas decimais, 
//representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, 
//respectivamente.

//Saída
//Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.	
		
		//ENTRADA 1
		
		String n1 = "JOAO";
		double salfixo1 = 500.00;
		double vendasEfetuadas1 = 1230.30;
		double comissao1 = (vendasEfetuadas1 * 0.15);
		double totalsal1 = (salfixo1 + comissao1);
		
		System.out.printf("NOME: %s \nTOTAL = R$ %.2f%n", n1, totalsal1);
		
		//ENTRADA 2
		
		String n2 = "PEDRO";
		double salfixo2 = 700.00;
		double vendasEfetuadas2 = 0.00;
		double comissao2 = (vendasEfetuadas2 * 0.15);
		double totalsal2 = (salfixo2 + comissao2);
				
		System.out.printf("\nNOME: %s \nTOTAL = R$ %.2f%n", n2, totalsal2);
		
		
		//ENTRADA 3
		
		String n3 = "MANGOJATA";
		double salfixo3 = 1700.00;
		double vendasEfetuadas3 = 1230.50;
		double comissao3 = (vendasEfetuadas3 * 0.15);
		double totalsal3 = (salfixo3 + comissao3);
						
		System.out.printf("\nNOME: %s \nTOTAL = R$ %.2f%n", n3, totalsal3);
		
	}
	
}
