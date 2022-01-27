/*prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário; se salario diigtado > salario maior salvo = 
d) percentual de pessoas com salário até R$100,00. / considerar pessoas com salario <=100
*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real habitante, salario=0.0, numFilho, salarioTotal=0.0, mediaFilho, numFilhoTotal=0.0, mediaSalario=0.0, maiorSalario=0.0, percentual, pessoas100=0.0
		real numHab=2.0
		
		para(habitante=1.0; habitante <=numHab; habitante++){ 
			
			escreva("Qual seu salário? ")
			leia(salario)
			escreva("Quanto filhos você tem? ")
			leia(numFilho)

			salarioTotal = salarioTotal+salario
			numFilhoTotal = numFilhoTotal + numFilho

			se(salario > maiorSalario) { 
				maiorSalario = salario
			}

			se(salario <= 100) { 
				pessoas100++ // pessoas100 + 1, vou saber quantas pessoas tem salario <=100
			}
		}
		
		mediaSalario = salarioTotal / numHab + mat.arredondar (mediaSalario,2) //media de todos salarios dividido por 20 habitantes
		mediaFilho = numFilhoTotal / numHab //media de filhos por habitante
		percentual = pessoas100 / numHab*100 // pessoas ganhando até $100, dividido por 20 habitantes vezes 100 para ser %

		escreva("A média de salário é de R$" +mediaSalario)
		escreva("\nA média de filhos/habitante é de: "+mediaFilho)
		escreva("\nO maior salário dentre os habitantes é de R$ "+maiorSalario)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */