/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/

programa
{
	
	funcao inicio()
	{
		real n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		para(inteiro linha = 0; linha <4; linha++){ 
			para(inteiro coluna = 0; coluna <6; coluna++){ 
			escreva("Informe um valor: ")
			leia(n1[linha][coluna])
			limpa()
			}
			
		}
		para(inteiro linha = 0; linha <4; linha++){ 
			para(inteiro coluna = 0; coluna <6; coluna++){ 
			escreva("Informe um valor: ")
			leia(n1[linha][coluna])
			limpa()
			
			}
		}

		para(inteiro linha = 0; linha <4; linha++) { 
			para(inteiro coluna = 0; coluna <6; coluna++) { 
				m1[linha][coluna] = n1 [linha][coluna] + n2[linha][coluna]
			}
		}

		para(inteiro linha = 0; linha <4; linha++) { 
			para(inteiro coluna = 0; coluna <6; coluna++) { 
				m2[linha][coluna] = n1 [linha][coluna] - n2[linha][coluna]
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1079; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 7, 2}-{n2, 13, 17, 2}-{m1, 13, 27, 2}-{m2, 13, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */