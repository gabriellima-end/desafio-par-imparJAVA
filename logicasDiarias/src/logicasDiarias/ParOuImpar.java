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
		
		
		while(true) {
			System.out.println("digite o PRIMEIRO numero para a soma: ");
			String numSum = inputNum.nextLine();
			
			try {
				
				int numConvertido = Integer.parseInt(numSum);
				
			}catch(Exception e) {
				
				System.out.println("por favor digite valores válidos, de preferência inteiro. \n");
				
				continue;
			}
			
			System.out.println("Digite o SEGUNDO número: ");
			String numSum2 = inputNum.nextLine();
			
			try {
				
				int numConvertido2 = Integer.parseInt(numSum2);
				
			}catch(Exception e) {
				
				System.out.println("por favor digite valores válidos, de preferência inteiros. \n");
				
				continue;
			}
			
			//USANDO WHILE PARA IMPEDIR QUE O USUÁRIO DIGITE OUTROS VALORES
			while(true) {
				
				System.out.println("Deseja adiconar mais números para soma? 'ss' para sim | 'nn' para não ");
				String addMoreNum = inputNum.nextLine();		
				
				if(!addMoreNum.equals("ss") && !addMoreNum.equals("nn")){
				
					
					System.out.println("Digite um valor válido \n");
					
					continue;
				}
				
		
				//CASO USUÁRIO QUEIRA ADICIONAR MAIS NÚMERO PARA SOMA
				if(addMoreNum.equals("ss")) {
					
					//CONVERTE STRING EM INTEGER
					int numConvertido = Integer.parseInt(numSum);
					int numConvertido2 = Integer.parseInt(numSum2);
					
					nums.add(numConvertido);
					nums.add(numConvertido2);
					
					//ADICIONAR MAIS NUMEROS
					System.out.println("Digite o numero e aperte enter, adicione quantos numeros quiser \n "
							+ "quando quiser parar digite 'finalizar' e iremos mostrar o resultado.");
					
					while(true) {
						
						String inputAdd = inputNum.nextLine();
						
						//REALIZANDO A SOMA DA LISTA CASO USUÁRIO QUEIRA FINALIZAR
						if(inputAdd.equals("finalizar")){
							
							int soma = 0;
							
							for(int numero : nums) {
								
								soma += numero;
								
							}
							
							//MOSTRANDO RESULTADO
							System.out.println("numeros adicionados: ");
							System.out.println(nums.toString());
							
							if(soma % 2 == 0) {
								
								System.out.println("soma de todos os números adicionados é PAR: " + soma);
								
							}else {
								
								System.out.println("soma de todos os números adicionados é ÍMPAR: " + soma);
								
							}
							
							break;
					}
					
					//CADA NUMERO DIGITADO É ADICIONADO A LISTA
					try {
						
						int num = Integer.parseInt(inputAdd);
						nums.add(num);
						
					//CASO USUÁRIO DIGITE UM VALOR DIFERENTE DE INTEIRO
					}catch(Exception e){
						
						System.out.println("por favor digite um valor válido \n Se quiser o resultado digite 'finalizar'");
						
					}	
					
					}
				}
				
				//CASO USUÁRIO NÃO QUEIRA ADICIONAR MAIS NÚMEROS
				if(addMoreNum.equals("nn")){
					
					//CONVERTE STRING EM INTEGER
					int numConvertido = Integer.parseInt(numSum);
					int numConvertido2 = Integer.parseInt(numSum2);
					
					int result = numConvertido + numConvertido2;
					
					
					//MOSTRANDO RESULTADO
					if(result % 2 == 0) {
						
						System.out.println("O resultado é par: " + result);
						
					}else {
						
						System.out.println("O resultado é ímpar: " + result);
						
					}
					
				}
				
			inputNum.close();
			
			break;
			}	
			
		break;
		}	
	}
	
}
 
