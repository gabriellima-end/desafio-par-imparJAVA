package logicasDiarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
		
		System.out.println("Deseja adiconar mais números para soma? 'ss' para sim | 'nn' para não ");
		
		String addMoreNum = inputNum.nextLine();
		
		
		//CASO USUÁRIO QUEIRA ADICIONAR MAIS NÚMERO PARA SOMA
		if(addMoreNum.equals("ss")) {
			
			
			nums.add(numSum);
			nums.add(numSum2);
			
			//ADICIONAR MAIS NUMEROS
			
			while(true) {
				
				String inputAdd = inputNum.nextLine	();
				if(inputAdd.equals("finalizar")){
					
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
