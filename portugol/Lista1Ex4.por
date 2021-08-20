programa{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
  		D=R+S/2, onde R=(A+B),2)  S=(B+C),2)
		*/
		//variaveis
		inteiro a, b, c
		real R, S, D
		

		//processamento
		escreva("Qual o valor de a? ")
		leia(a)
		escreva("Qual o valor de b? ")
		leia(b)
		escreva("Qual o valor de c? ")
		leia(c)

		R = Matematica.potencia(a+b, 2)
		S = Matematica.potencia(b+c, 2)
		D = (R+S)/2

		//saida
		escreva("O valor da expressão é: "+D)
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */