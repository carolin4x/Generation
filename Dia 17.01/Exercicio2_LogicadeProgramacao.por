programa
{
	
	funcao inicio()
	{
		inteiro totalDias, anos, meses, dias
		
		escreva("\nEntre com o total de dias vividos: ")
		leia(totalDias)
		
		anos = totalDias / 365 // 1000/365 = 2 anos
		meses = (totalDias % 365) / 30 // 1000 % 365 = 270/30 = 9 mses
		dias = (totalDias % 365) % 30 //1000 % 365 = 270%30 = 0 dias

		escreva("\nVoce viveu: " +anos "ano(s), " +meses+ " mes(es) e " +dias "dia(s)")

	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */