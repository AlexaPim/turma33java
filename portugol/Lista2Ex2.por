/*2- Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas
exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal 
variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total
e o salário excedente.
*/
programa {
	
	funcao inicio(){
		inteiro c
		real n, ex, salario

		escreva("Digite o código do funcionário: ")
		leia(c)
		escreva("Digite a quantidade de horas que ele trabalhou: ")
		leia(n)
		se (n>50){
			ex = n - 50
			salario = 500 + ex * 20
		}
		senao {
			salario = n * 10
		}
		escreva("O funcionário ",c," terá o salário de ",salario," reais." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 802; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */