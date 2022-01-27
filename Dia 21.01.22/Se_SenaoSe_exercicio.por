programa
{
	
	funcao inicio()
	{
		real brinde

		escreva("Quantos brindes você retirou em nosso site? ")
		leia(brinde)

		se(brinde >=5 e brinde <=9) { 
			escreva("Você ainda tem alguns brindes para retirar hoje.")
		}
		
		senao se(brinde>=10) { 
			escreva("Você atingiu o limite diário.")
		}
		
		senao { 
			escreva("\nRetire brindes!")
		}	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */