programa
{
	
	funcao inicio()
	{
		//DIGITA UM NUMERO INTEIRO POSITIVO
		//É PAR OU IMPAR
		//SE FOR DIGITA UM NUMERO NEGATIVO TEM QUE DIZER, IMPOSSIVEL REALIZAR, NUMERO NEGATIVO
		//SE FOR DIGITADO O ZERO, DEVER INFORMAR: ZERO É NEUTRO
		//NUMERO POSITVO INFORMAR SE O MESMO É PAR OU IMPAR

		inteiro num

		escreva("Digite um número inteiro positivo: ")
		leia(num)

		se (num % 2 == 1){
			escreva("O número ",num, " é ÍMPAR.")
		} senao se (num == 0) {
			escreva("O número 0 é NEUTRO.")
		} senao se (num < 0) {
			escreva("Impossível realizar")
		}
		senao {
			escreva("O número ",num, " é PAR.")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */