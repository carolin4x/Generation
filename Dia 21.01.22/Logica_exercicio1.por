programa
{
	
	funcao inicio() 
	{
		inteiro n1, n2, soma, sub, mult, div, media
		
		escreva("Entre com valor: ")
		leia(n1)
		escreva("Entre com outro valor: ")
		leia(n2)

		soma = n1+n2
		sub = n1-n2
		div= n1/n2
		mult = n1*n2
		media = n1+n2 / 2

		limpa()
		escreva("Soma: "+soma+ "\nSubtração: "+sub+ "\nDivisão: "+div+ "\nMultiplicação: "+mult+ "\nDivisão: "+div)
		escreva("\nA média é de: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */