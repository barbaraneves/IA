import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);

		Environment environment = new Environment(false, false, false);
		SimpleReflexAgent simpleReflexAgent = new SimpleReflexAgent();

		Perception perception = new Perception(false, false);

		System.out.println("Definindo o cenário: ");
		System.out.println("Onde o aspirador está?\nA- Sala A\nB- Sala B");
		String location = scanner.nextLine();

		if(location.equals("A") || location.equals("a")){
			environment.setAgentLocation(true);
		}else{
			environment.setAgentLocation(false);
		}

		System.out.println("A sala A esta suja?\nS- Sim\nN- Não");
		String dirtyA = scanner.nextLine();

		if(dirtyA.equals("S") || dirtyA.equals("s")){
			environment.setDirtyA(false);
		}else{
			environment.setDirtyA(true);
		}

		System.out.println("A sala B esta suja?\nS- Sim\nN- Não");
		String dirtyB = scanner.nextLine();

		if(dirtyB.equals("S") || dirtyB.equals("s")){
			environment.setDirtyB(false);
		}else{
			environment.setDirtyB(true);
		}


		System.out.println("Escolha o número de interações que deseja que o aspirador faça: ");

		int i = scanner.nextInt();
		scanner.nextLine();
		int j = i;

		System.out.println("O cenário ficou da seguinte forma: ");
		System.out.println(environment.showEnvironment(environment) + "\nEnter para continuar...");

		while (i > 0){

			perception.getPerception(environment);
			Action action = simpleReflexAgent.aspiradorDePoReativoSimples(perception);
			environment.updateEnvironment(action, perception, environment);

			scanner.nextLine();
			int iteracao = (j - i) + 1;
			System.out.println("Interação: " + iteracao + ". Enter para continuar...");
			System.out.println(environment.showEnvironment(environment));

			i--;
		}
		System.out.println("O aspirador parou com o seguinte Cenário!");

	}
}
