/*7-
 Receber valores de base e altura de um triângulo e verificar se são valores válidos 
 (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/
programa
{
	
	funcao inicio()
	{
		real altura, base, areaT

		escreva("Digite o valor da altura do triangulo retangulo em (cm) ")
		leia(altura)
		escreva("Digite o valor da base do triangulo retangulo em (cm) ")
		leia(base)

		se (base <=0){
			escreva("Impossível realizar esta operação, valor da base está incorreto!")
		} senao se (altura<=0){
			escreva("Impossível realizar esta operação, valor da altura está incorreto!")
		}
		senao {
		areaT=((altura*base)/2)		
		escreva("O valor da área do triângulo retângulo é de: ",areaT, "cm.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 692; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */