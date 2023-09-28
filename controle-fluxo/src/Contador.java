import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            int numeroDoIntervalo = 1;
            for(int intervalo = parametroUm; intervalo <= parametroDois; intervalo++){
                System.out.println("Imprimindo o numero " + numeroDoIntervalo++  +" = " + intervalo );
            }
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
             System.out.println("O primeiro numero digitado deve ser menor que o segundo, repita a operação!!");//erro com instrução
		}

		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
            
        }
		
	}
}