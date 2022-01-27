programa
{
	
	funcao inicio()  //ENQUANTO: INFINITO ATE EU COLOCAR UMA CONDIÇÃO
	{ // Variaveis OK
	inteiro resposta, verdade=0 //ver =0, false=1
	real num1, num2
	cadeia enter

	enquanto(verdade == 0){
		// Menu OK
	escreva("\n\tESCOLHA UMA OPERAÇÃO ABAIXO: \n\t1-Soma\n\t2-Subtração"+
	"\n\t3-Multiplicação\n\t4-Divisão\n\t5-Sair\n\tResposta: ")
	leia(resposta)
		// Tratamento resposta OK [se enter != de x, limpa	
		// Funções do Menu (estrutura) OK
		escolha(resposta) { 
		// Entrar com numeros OK
			caso 1: 
				escreva("\nEntre com 1º valor: ")
				leia(num1)
				escreva("\nEntre com 2º valor: ")
				leia(num2)
				real soma = num1+num2
				escreva("\nA soma é: "+soma)
				escreva("\nAperte ENTER para continuar: ")
				leia(enter)
				se(enter != "x") { 
					limpa()}
			pare
			caso 2: 
				escreva("\nEntre com 1º valor: ")
				leia(num1)
				escreva("\nEntre com 2º valor:")
				leia(num2)
				real sub = num1-num2
				escreva("\nA subtração é: "+sub)
				escreva("\nAperte ENTER para continuar: ")
				leia(enter)
				se(enter != "x") {
					limpa()}
			pare
			caso 3:
				escreva("\nEntre com o 1º valor: ")
				leia(num1)
				escreva("\nEntre com o 2º valor: ")
				leia(num2)
				real mult = num1*num2
				escreva("\nA multiplicação é: "+mult)
				escreva("\nAperte ENTER para continuar: ")
				leia(enter)
				se(enter != "x") { 
					limpa() }
			pare
			caso 4: 
				escreva("\nEntre com o 1º valor: ")
				leia(num1)
				escreva("\nEntre com o 2º valor: ")
				leia(num2)
				real div = num1/num2
				escreva("\nA multiplicação é: "+div)
				escreva("\nAperte ENTER para continuar: ")
				leia(enter)
				se(enter != "x") { 
					limpa() }
			pare
			caso 5:
				cadeia choice // escolher
				escreva("Você tem certeza disso: (S/N) ")
				leia(choice)
				se(choice == "s") { 
					verdade = 1 // falso
					limpa()
				}senao { 
					limpa()
				}
				
			pare
			caso contrario:
				escreva("Opção inválida!")
				escreva("\nAperte ENTER para continuar: ")
				leia(enter)
				se(enter != "x") { limpa() }
				
			}
		}
		//finalizar programa (looping: enquanto verdade == 0) OK
		escreva("Obrigada por utilizar os programas Xeron LTDA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 83; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */