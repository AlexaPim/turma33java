/*5- A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias 
 * que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas 
 * atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas 
 * atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos 
 * diferentes grupos de empresas.
 */
programa {
	
	funcao inicio(){
		real iP

		//indice aceitável varia de 0,05 até 0,25, e não especifica do 0,26 até 0,29.
		
		escreva("Digite o índice de poluição atual: ")
		leia(iP)

		se(iP<=0.25){
			escreva("Índice aceitável.")
		}
		senao se(iP >= 0.3 e iP < 0.4){
			escreva("O índice de poluição atingiu: ",iP)
			escreva("\nNotifique a empresa do grupo 1 e suspenda as atividades.")
		} 
		senao se(iP >= 0.4 e iP < 0.5){
			escreva("O índice de poluição atingiu: ",iP)
			escreva("\nNotifique as empresas do grupo 1 e do grupo 2 e suspenda as atividades.")
		} 
		senao se(iP == 0.5 ou iP > 0.5){
			escreva("O índice de poluição atingiu o limite de 0,5.")
			escreva("\nNotifique todas as empresas e suspenda as atividades.")
		}
		senao{
			escreva("Índice de poluição não definido, é aceitável e todas as empresas podem continuar suas atividades.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */