programa
{
	
	funcao inicio()
	{
		real alt

		escreva("Qual sua altura em centimetros? ")
		leia(alt)

		se(alt <=145.0) { 
			escreva("\nVocê não pode ir neste brinquedo!")
		}
		senao se(alt >=146.0 e alt <=160)  { 
			escreva("\nVocê pode ir somente nesses brinquedos: a, b e c.")
		}
		senao { 
			escreva("\nPode se divertir!")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */