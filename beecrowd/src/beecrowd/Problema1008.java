package beecrowd;

public class Problema1008 {
public static void main(String[] args) {
	
	
//Escreva um programa que leia o n�mero de um funcion�rio, 
//seu n�mero de horas trabalhadas, 
//o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
//A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

//Entrada
//O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais,
//representando o n�mero, quantidade de horas trabalhadas e o valor que o 
//funcion�rio recebe por hora trabalhada, respectivamente.

//Sa�da
//Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, 
//com um espa�o em branco antes e depois da igualdade. No caso do sal�rio, 
//tamb�m deve haver um espa�o em branco ap�s o $.	
	
	//ENTRADA 1 
	
	int funcionario1 = 25;
	int horasTrab1 = 100;
	double valorHora1 = 5.50;
	
	double calculoSal1 = (horasTrab1 * valorHora1);
	
	System.out.printf("NUMBER = %s \nSALARY = U$ %.2f%n", funcionario1, calculoSal1);
	
	//ENTRADA 2 
	
	int funcionario2 = 1;
	int horasTrab2 = 200;
	double valorHora2 = 20.50;
		
	double calculoSal2 = (horasTrab2 * valorHora2);
		
	System.out.printf("\nNUMBER = %s \nSALARY = U$ %.2f%n", funcionario2, calculoSal2);
	
	//ENTRADA 3 
	
	int funcionario3 = 6;
	int horasTrab3 = 145;
	double valorHora3 = 15.55;
		
	double calculoSal3 = (horasTrab3 * valorHora3);
		
	System.out.printf("\nNUMBER = %s \nSALARY = U$ %.2f%n", funcionario3, calculoSal3);
}
}
