programa
{
	
	funcao inicio()
	{
		inteiro salario1, salario2, soma, mult, div, sub, dif
		cadeia nome1, nome2

		escreva("\nEntre com seu nome: ")
		leia(nome1)
		escreva("\nEntre com seu primeiro salário: ")
		leia(salario1)
		escreva("\nEntre com seu segundo salário: ")
		leia(salario2)

		soma = salario1 + salario2
		mult = salario1 * salario2
		div = salario1 / salario2
		sub = salario1 - salario2
		dif = salario1 % salario2


		escreva(+nome1+", a soma dos seus salários é de: "+soma+ ", a multiplicação é de: "+mult+", " +
		"a divisão é de: "+div+ " e a subtração é de: "+sub+ "\n")
		
		
		escreva("\nA soma dos seus salários é de: " +soma)
		escreva("\nA multiplicação dos salários é de: " +mult)
		escreva("\nA divisão entre os seus salários é de: " +div)
		escreva("\nA subtração do primeiro com o segundo salário é de: " +sub)
		escreva("\nA diferença do primeiro com o segundo salário é de: " +dif)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */