import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TesteFun4Study {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Estudante> student = new ArrayList<>();
		ArrayList<Cidade> city = new ArrayList<>();
		ArrayList<String> listaCidades = new ArrayList<>();
		HashMap<String, Integer> matriculasCidades = new HashMap<>();

		// PARTE 1 = CADASTRO DE SENHA E ESTUDANTES

		System.out.print("Quantos estudantes serão cadastrados? "); // o usuário insere o numero de alunos que deseja.
		int s = input.nextInt();

		for (int i = 1; i <= s; i++) {
			
			System.out.println("ESTUDANTE #" + i + ": ");
			System.out.println("\tBEM-VINDO, CALOURO!");
			System.out.println("Sua senha de primeiro acesso é '1234'. ");
			System.out.printf("Entre com a senha para continuar com o cadastro: ");
			Integer senha = input.nextInt();

			while (senha != 1234) {
				System.out.printf("Senha incorreta! Digite novamente: ");
				senha = input.nextInt();
			}
			{
				System.out.println("\t>>>>ACESSO PERMITIDO!<<<<<");
			}
			System.out.print("Por segurança, favor cadastrar nova senha: ");
			input.nextLine();                     //pula linha para o int anterior não 'roubar'
			String novaSenha = input.nextLine(); //nova senha é gravada como 'novaSenha'
			System.out.print("Confirme a sua nova senha: ");  //confirmar senha é gravada como 'senha1'
			String senha1 = input.nextLine();
			System.out.println();

			while (!senha1.equals(novaSenha)) { //se forem diferentes, retorna o loop 
				System.out.println("Senha incorreta! Digite novamente: ");
				senha1 = input.nextLine();
			}

			if (senha1.equals(novaSenha)) { //igual o loop é encerrado
				System.out.println("\t>>>>>NOVA SENHA CRIADA!<<<<<");
			}

			Estudante estudante = new Estudante(); // cria novo objeto para armazenar os dados de x alunos
			student.add(estudante); // armazena os dados do 'student' no objeto estudante

			System.out.println();
			System.out.println("=== PREENCHA SEUS DADOS PESSOAIS ===");
			System.out.print("Código da Matrícula: ");
			int codigo = input.nextInt();
			estudante.setCodigo(codigo);
			System.out.print("Nome do Estudante: ");
			input.nextLine(); // quebra linha pra não pular (anterior é inteiro)
			String nome = input.nextLine();
			estudante.setNome(nome);
			System.out.print("Data de Nascimento: ");
			String nascimento = input.nextLine();
			estudante.setNascimento(nascimento);
			System.out.print("E-mail: ");
			String email = input.nextLine();
			estudante.setEmail(email);
			System.out.print("Cidade da Matrícula: ");
			String cidade = input.nextLine();
			estudante.setCidade(cidade); // grava a cidade digitada pelo usuário para imprimir na tela
			listaCidades.add(cidade); // a mesma cidade digitada pelo usuário ingressa na lista de cidades do array

		}
		// PARTE 2 - CADASTRO DE CIDADES

		System.out.println();
		System.out.print("Quantas cidades serão cadastradas? "); // o usuário insere o numero de cidades a cadastrar
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			Cidade cid = new Cidade(); // cria novo objeto para armazenar os dados da cidade 
			city.add(cid);

			System.out.println("CIDADE #" + i + ": ");
			System.out.println();
			System.out.println("=== DADOS DA CIDADE ===");
			System.out.printf("Código Cidade: ");
			Integer cCodigo = input.nextInt();
			cid.setCCodigo(cCodigo);
			System.out.print("Descrição: ");
			input.nextLine(); // quebra linha pra não pular (anterior é inteiro)
			String descricao = input.nextLine();
			cid.setDescricao(descricao);
			System.out.print("Estado: ");
			String UF = input.nextLine();
			cid.setUF(UF);

		}

		// PARTE 3 - OUTPUT DOS DADOS CADASTRADOS

		for (Estudante e : student) {  //imprime pelo tostring os dados armazenados no obj estudante
			System.out.print(e); 
		}

		for (Cidade c : city) {  //idem ao obj estudante
			System.out.print(c);
		}

		// PARTE 4 - PERCORRER LISTAS

		//A lógica é a seguinte, o for percorre a lista das cidades digitas pelo usuário;

		for (int i = 0; i < listaCidades.size(); ++i) { 
			String local = listaCidades.get(i);

			if (matriculasCidades.containsKey(local)) // o if lista matriculas e pesquisa o conteúdo local
														// cidade'
				matriculasCidades.put(local, matriculasCidades.get(local) + 1); // Armazena os locais somando 1

			else
				matriculasCidades.put(local, 1); // cidade digitada pelo usuario , 'matricula' ;
		}

		StringBuilder cities = new StringBuilder();

		for (Map.Entry<String, Integer> busca : matriculasCidades.entrySet()) { // busca chave e pega valor int
			cities.append("\nCidades e quantidade estudantes matriculados | ").append(busca.getKey()).append(" : ")
					.append(busca.getValue());
		// Concatena as cidades que possuem string identicas e lista adicionando valor +1;
		} 

		System.out.println(cities.toString()); // imprimi direto na tela as cidades com alunos

		input.close();

	}

}
