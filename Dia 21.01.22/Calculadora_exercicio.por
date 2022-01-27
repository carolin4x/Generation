programa
{
	
	funcao inicio()
	{
		inteiro resposta
		real n1,n2
		
		escreva("CALCULADORA DE MILHÕES!")
		escreva("\nNumero 1: ")
		leia(n1)
		escreva("Numero 2: ")
		leia(n2)
		escreva("-----------------------------------------")
		escreva("\n\t1-Soma"+"\n\t2-Subtração"+"\n\t3-Multiplicação"
		+"\n\t4-Dividir"+"\n\tEscolha uma opção: ")
		leia(resposta)

		se(resposta == 1) { 
			real soma = n1+n2
			escreva("Soma  dos numeros é: "+soma)
		}
		senao se(resposta == 2) { 
			real sub = n1-n2
			escreva("Subtração dos números é: "+sub)
		}
		senao se(resposta == 3) { 
			real mult = n1*n2
			escreva("Multiplicação dos números é: "+mult)
		}
		senao se(resposta == 4) { 
			real div = n1/n2
			escreva("Divisão dos números é: "+div)
		}
		senao { 
			escreva("\nOpção inválida!")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */