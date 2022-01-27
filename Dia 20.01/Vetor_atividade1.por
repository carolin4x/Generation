/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/

programa
{
	
	funcao inicio()
	{
		real vetor [5], maiorPonto=0.0

		para(inteiro per=0; per < 5; per++) { //pergunta os 5 valores e ve qual o maior
			escreva("\nEntre com valor: ")
			leia(vetor[per])
			

			se(maiorPonto < vetor[per]) 
			{ 
				maiorPonto = vetor[per]
			}
		
			
		}
		para(inteiro per=0; per < 5; per++) { // me mostra os 5 valores digitados
			escreva(vetor[per]+" ")
		}
		
		escreva("\n O maior valor inserido foi de:" +maiorPonto)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */