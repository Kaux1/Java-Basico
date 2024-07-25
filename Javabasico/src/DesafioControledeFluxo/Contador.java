package DesafioControledeFluxo;

import java.util.*;

public class Contador{
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O parametro 1 deve ser menor que o parametro 2!");
			exception.printStackTrace();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
			
		}
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i < contagem;i++){
			System.out.println((i+1));

		}
	}
}
