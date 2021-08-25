/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

*/
programa {
	inclua biblioteca Matematica 
	funcao inicio(){
		const inteiro HABITANTES=20
		inteiro numFilhos=0
		real salario=0.0, totalSalario=0.0, mediaSalario=0.0, maiorSalario=0.0
		real percSalario, mediaFilhos=0.0, totalFilhos=0.0
		real pessoasAte100=0.0

		para (inteiro x=1; x<=HABITANTES; x++){
			escreva("Digite o salário do participante ",x,": \n")
			leia(salario)
			escreva("Digite o número de filhos do participante ",x,": \n")
			leia(numFilhos)

			totalSalario = totalSalario + salario			
			totalFilhos = totalFilhos + numFilhos

			se (salario > maiorSalario){
				maiorSalario=salario
			}			
			
			se (salario<=100){
				pessoasAte100 = pessoasAte100 + 1
			}
		}
		mediaSalario = totalSalario / HABITANTES
		mediaFilhos=totalFilhos/HABITANTES
		percSalario = (pessoasAte100 / HABITANTES)*100.00
		
		escreva("\nTotal de salários: R$ ",totalSalario)
		escreva("\nA média de salário da população: R$ ",Matematica.arredondar(mediaSalario,2))
		escreva("\nO maior salário da população: R$ ",maiorSalario)
		escreva("\nO percentual até R$100,00 é: ",Matematica.arredondar(percSalario,2))
		escreva("\nTotal de filhos da população: ",Matematica.arredondar(totalFilhos,2))		
		escreva("\nA média de filhos da população: ",Matematica.arredondar(mediaFilhos,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */