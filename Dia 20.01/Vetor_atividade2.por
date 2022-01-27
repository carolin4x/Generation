/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

programa
{
	
	funcao inicio()
	{
		real vetor[5], somaLan=0.0, mediaLan, maiorPont=0.0, ocorr=0.0

		para(inteiro rolou=0; rolou<5; rolou ++)
		{ 
			escreva("Qual foi o valor do dado? ")
			leia(vetor[rolou])

			somaLan+= vetor[rolou]

			se(vetor[rolou]>= maiorPont) 
			{ 
				se(vetor[rolou] == maiorPont) 
				{ 
					ocorr++
				}
				senao {
					ocorr = 0.0
					ocorr ++
				}
				maiorPont = vetor[rolou]
			}
		}
		mediaLan = somaLan / 5
		escreva("\nMédia dos lançamentos foi de: "+mediaLan)
		escreva("\nA ocorrencia em que " + maiorPont + " apareceu foi de " +ocorr + " vez(es).")




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 892; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */