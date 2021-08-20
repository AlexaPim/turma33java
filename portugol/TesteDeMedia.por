programa
{
	
	funcao inicio()
	{
		//algoritmo -> nome realista calculoMedia
		real n1, n2, media
		
		/*formula
		leia(n1, n2)
		media=n1+n2/2
		*/

		escreva("Digite a primeira nota: ")
		leia (n1)
		escreva("Digite a segunda nota: ")
		leia (n2)

		media=n1+n2/2		

		escreva("Soma:" , +media)
		
		se (media >= 7)  {
			escreva("\nAprovado")
		}
		
		senao {	
			escreva("\nReprovado")
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */