programa
{
	
	funcao inicio()
	{
		inteiro op
		real num1,num2,resultado=0.0
		
		escreva("\nEntre com o primeiro número: ")
		leia(num1)
		escreva("\nEntre com o segundo número: ")
		leia(num2)

		limpa()
		escreva("\n\t\tCalculadora")
		escreva("\n1-Soma")
		escreva("\n2-Diferença")
		escreva("\n3-Multi")
		escreva("\n4-Divisão")
		escreva("\nDigite sua opção: ")
		leia(op)

		escolha(op)
		{
			caso 1:
			resultado = num1 + num2
			pare
			caso 2:
			resultado = num1 - num2
			pare
			caso 3:
			resultado = num1 * num2
			pare
			caso 4:
			se(num2==0)
			{
				escreva("\nNão é possi1vel dividir por zero!")
			}
			senao
			resultado = num1 / num2
			pare
			caso contrario:
			escreva("\nOpção Inválida!")
		}
			escreva("\nResultado: "+resultado)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */