import java.util.Scanner;

public class calculos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o valor da sua hora? ");
		float hora = scanner.nextFloat();
		
		System.out.print("Quantas horas trabalhou no total? ");
		float Htrabalhada = scanner.nextFloat();
		
		System.out.print("Qual o valor gasto na Farmacia? ");
		float farmacia = scanner.nextFloat();
		
		System.out.print("Qual o valor do adiantamento recebido? ");
		float vale = scanner.nextFloat();
		
		float result1 = hora * Htrabalhada;//220;
		float result2 = (float) (result1 - (result1 * 0.08));
		float result3 = result2 - farmacia;
		float result4 = result3 - 8;
		float salario = result4 - vale;
		
		System.out.println("O salario total é de: " + salario);
	}

}
