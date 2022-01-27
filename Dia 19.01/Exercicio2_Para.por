


programa


{
	
	funcao inicio()
	{
		inteiro num = 1, somaImpar=0, ateNum = 500
		
		para(num = 1; num <= ateNum; num++) { 
			se(num%2 !=0) { // saber se é impar
				se(num%3 == 0) { // saber se é multiplo de 3
					somaImpar = somaImpar + num
					escreva(num + "\n")
				}
			}
		}
		escreva("A somatória dos numeros impares e multiplos de 3 entre e 500 é de : "+somaImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */