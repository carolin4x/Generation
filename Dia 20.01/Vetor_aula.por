programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, media[4], somaMedia=0.0, mediaGeral

		para(inteiro x=0; x<4; x++){ 
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)

			media[x] = (n1+n2+n3) / 3
			escreva("\nMedia Aritmética: "+media[x])
			somaMedia += media[x]
		}
		mediaGeral = somaMedia / 4
		escreva("\nMédia Geral: "+mediaGeral)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */