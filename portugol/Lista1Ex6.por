programa {
	
	inclua biblioteca Matematica
	funcao inicio() {
		//variaveis
		real x1, x2, y1, y2, d

		//entradas
		escreva("Escreva o valor de X1: ")
		leia(x1)
		escreva("Escreva o valor de X2: ")
		leia(x2)
		escreva("Escreva o valor de Y1: ")
		leia(y1)
		escreva("Escreva o valor de Y2: ")
		leia(y2)

		//processamento
		d = Matematica.raiz ((Matematica.potencia((x2-x1), 2) + Matematica.potencia((y2-y1), 2)),2)

		//saida
		escreva("O valor de D é: "+d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */