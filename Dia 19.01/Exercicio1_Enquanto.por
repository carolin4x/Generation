/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
*/

programa
{
	inclua biblioteca Matematica --> mat// simulação 1 3 5 -4
	
	funcao inicio()
	{
		real num, totalSoma = 0.0, media, totalVal = 0.0

		escreva("Escreva um valor positivo: ")
		leia(num)

		enquanto(num >= 0) { 
			totalSoma += num //1 + 3 + 5 = 9
			totalVal++ //1 +1 +1 = 3
			escreva("\nEscreva outro valor positivo: ")
			leia(num)
		}
		
		media = totalSoma / totalVal

		escreva("\nTotal da somatória é: "+totalSoma +"\nA média é de: " +media 
		+ "\nVocê digitou " + totalVal + " valores positivos.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */