programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	real seg, ho, min
	
	escreva("Duração do evento em segundos: ")
	leia(seg)

	min=seg/60
	ho=min/60

	
	escreva("\nDuração do evento em horas é: "+ mat.arredondar(ho,2) +ho+ "horas")
	escreva("\nDuração do evento em minutos é: "+min+"minutos" + mat.arredondar(min,2))
	escreva("\nDuração do evento em segundos é: "+seg+"segundos "+ mat.arredondar(seg,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */