/*Você pegara o nome do Aluno e ira recolher 5 notas, dado isso, 
 * calcule a média de nota do aluno e se a média for acima de 5 ele está aprovado, 
 * caso seja de 5 para baixo este aluno estará de recuperação. também identifique se o alun(x) 
 * prefere ser seus pronomes "a", "o" e "e"
 * mostre a maior nota!!!
quanto porcento das notas foram acima ou igual a 5
*/
programa
{
	
	funcao inicio()
	{
	    cadeia nome
	    caracter pronome
         real nota, media, somaNotas = 0
         escreva("Digite seu nome: ")
         leia(nome)
         escreva("Como prefere ser chamade (A/O/U)?: ")
         leia(pronome)
         
         para(inteiro x=1; x<=5; x++){
         		escreva("Digite uma nota: ")
         		leia(nota)
         
			somaNotas = somaNotas + nota
		}
		media = (somaNotas / 5)
		se (media < 5.00){
			escreva("oi "+nome+" sua média é: " + media+" vc será recuparad"+pronome+" em notas!!")	
		}
		senao se (media >= 5.00){
			escreva("oi "+nome+" sua média é: " + media+" vc será aprovad"+pronome+"!!!")	
		}
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1029; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */