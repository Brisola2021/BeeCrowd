package beecrowd;

public class Problema1005 {
public static void main(String[] args) {
	
//Leia 2 valores de ponto flutuante de dupla precisão A e B, 
//que correspondem a 2 notas de um aluno. 
//A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 
//e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
//Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

//Entrada
//O arquivo de entrada contém 2 valores com uma casa decimal cada um.

//Saída
//Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, 
//com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
//Utilize variáveis de dupla precisão (double) e como todos os problemas, 
//não esqueça de imprimir o fim de linha após o resultado, caso contrário, 
//você receberá "Presentation Error".
	
double notaA1 = 5.0;
double pesoNotaA1 = (notaA1 * 0.3181818);

double notaA2 = 7.1;
double pesoNotaA2 = (notaA2 * 0.6818181);

double mediaA1 = (pesoNotaA1  + pesoNotaA2); 
System.out.printf(" MEDIA = %.5f \n", mediaA1);



double notaB1 = 0.0;
double pesoNotaB1 = (notaB1 * 0.3181818);

double notaB2 = 7.1;
double pesoNotaB2 = (notaB2 * 0.6818181);

double mediaB2 = (pesoNotaB1  + pesoNotaB2); 
System.out.printf(" MEDIA = %.5f \n", mediaB2);


double notaC1 = 10.0;
double pesoNotaC1 = (notaC1 * 0.3181818);

double notaC2 = 10.0;
double pesoNotaC2 = (notaC2 * 0.6818181);

double mediaC2 = (pesoNotaC1  + pesoNotaC2); 
System.out.printf(" MEDIA = %.5f \n", mediaC2);


}
}
