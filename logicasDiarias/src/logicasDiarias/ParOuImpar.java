package logicasDiarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;


//DESCUBRA SE O RESULTADO DA SOMA DOS VALORES INTEIROS DE UMA LISTA É IMPAR OU PAR
//SE O RESULTADO DA SOMA FOR PAR, IMPRIMA PAR, SE FOR IMPAR, IMPRIMA IMPAR
//OBS: USE SCANNER PARA ENTRADA DO USUÁRIO

public class ParOuImpar {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		Scanner inputNum = new Scanner(System.in);
		
		
		System.out.println("digite o primeiro numero para a soma: ");
		int numSum = inputNum.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numSum2 = inputNum.nextInt();
		
		inputNum.nextLine(); //consumindo nova linha
		
		//DEV -- DESENVOLVER O LANÇAMENTO DE ERRO CASO USUÁRIO NÃO DIGITE NEM SS E NEM NN
		
		while(true) {
			System.out.println("Deseja adiconar mais números para soma? 'ss' para sim | 'nn' para não ");
			String addMoreNum = inputNum.nextLine();		
			
			if(!addMoreNum.equals("ss") && !addMoreNum.equals("nn")){
			
				
				System.out.println("Digite um valor válido");
				
				continue;
			}
			
	
			//CASO USUÁRIO QUEIRA ADICIONAR MAIS NÚMERO PARA SOMA
			if(addMoreNum.equals("ss")) {
				
				nums.add(numSum);
				nums.add(numSum2);
				
				//ADICIONAR MAIS NUMEROS
				System.out.println("Digite o numero e aperte enter, adicione quantos numeros quiser \n "
						+ "quando quiser parar digite 'finalizar' e iremos mostrar o resultado.");
				while(true) {
					
					String inputAdd = inputNum.nextLine();
					if(inputAdd.equals("finalizar")){
						
						int soma = 0;
						
						for(int numero : nums) {
							
							soma += numero;
							
						}
						
						System.out.println("numeros adicionados: ");
						System.out.println(nums.toString());
						
						if(soma % 2 == 0) {
							
							System.out.println("soma de todos os números adicionados é PAR: " + soma);
							
						}else {
							
							System.out.println("soma de todos os números adicionados é ÍMPAR: " + soma);
							
						}
						
						break;
				}
				
				try {
					
					int num = Integer.parseInt(inputAdd);
					nums.add(num);
					
				}catch(Exception e){
					
					System.out.println("por favor digite um número válido");
					
				}	
				
				}
			}
			
			if(addMoreNum.equals("nn")){
				
				int result = numSum + numSum2;
				
				if(result % 2 == 0) {
					
					System.out.println("O resultado é par: " + result);
					
				}else {
					
					System.out.println("O resultado é ímpar: " + result);
					
				}
				
			}
			
		inputNum.close();
		}	
	}
	
}
