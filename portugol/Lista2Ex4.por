/*4- Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
 *  se este número é par ou ímpar, e se é positivo ou negativo.
 */
 programa {
	
	funcao inicio() {
		inteiro num
		
		escreva("Digite um número inteiro: ")
		leia(num)

		se (num == 0){
			escreva("O número ",num, " é neutro")
		} senao se (num < 0 e num % 2 == 0) {
			escreva("O número ",num, " é par e negativo")
		} senao se (num % 2 == 0){
			escreva("O número ",num, " é par e positivo")
		} senao se (num % 2 == 1){
			escreva("O número ",num, " é ímpar e positivo")
		} 
		senao {
			escreva("O número ",num, " é ímpar e negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */