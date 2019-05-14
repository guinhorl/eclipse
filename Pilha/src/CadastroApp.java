import java.text.SimpleDateFormat;

public class CadastroApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String marca, fornecedor, dataEntrada;
		int op, cont = 0, cod = 0, cont_pilha1 = 0, cont_pilha2 = 0;
		Cadastro aux;
		LinkCadastro lista;
		LinkStackCadastro pilha1 = new LinkStackCadastro(); // make stack
		LinkStackCadastro pilha2 = new LinkStackCadastro(); // make stack
		LinkListCadastro lista1 = new LinkListCadastro();
		//data
		String data = "dd/MM/yyyy";		
		String data1;
		java.util.Date agora = new java.util.Date();;
		SimpleDateFormat formata = new SimpleDateFormat(data);
		data1 = formata.format(agora);
		//fim data

		System.out.println("============================");
		System.out.println("          CADASTRO APP          ");
		System.out.println("       MAXIMO DE 5 CADASTRO!       ");
		System.out.println("============================");
		System.out.println("");
		System.out.println("1 - Cadastrar Engradado");
		System.out.println("2 - Excluir Engradado");
		System.out.println("3 - Buscar Engradado");
		System.out.println("4 - Informar Quantidade");
		System.out.println("5 - Sair");
		System.out.print("Digite a opção: ");
		op = Read.readInt();
		while (op != 5) {
			switch (op) {
			case 1: // Inserção
			{

				System.out.println("");
				System.out.println("INCLUSÃO");
				System.out.println(" ");
				System.out.print("Informe o código: ");
				cod = Read.readInt();
				System.out.println("Informe a marca: ");
				marca = Read.readString();
				System.out.println("Informe o fornecedor: ");
				fornecedor = Read.readString();
				System.out.println("Informe data de entrada: ");
				dataEntrada = data1;
				aux = new Cadastro(cod, marca, fornecedor, dataEntrada);
				if (cont <= 5) {
					pilha1.push(aux);
					lista1.insertFirst(aux);
					cont_pilha1++;
					cont++;
					break;
				} else if (cont >= 6 && cont <= 10) {
					pilha2.push(aux);
					lista1.insertFirst(aux);
					cont_pilha2++;
					cont++;
				} else
					System.out.println("Pilhas 1 e 2 estão cheias!");
				break;
			}
			case 2:// Remoção
			{
				if (!pilha2.isEmpty()) {
					pilha2.pop();
					cont--;
					cont_pilha2--;
				} else if(!pilha1.isEmpty()){
					pilha1.pop();
					cont--;
					cont_pilha1--;
				} else
					System.out.println("NÃO CONTEM ENGRADADO NO ESTOQUE!!");
				break;
			}
			case 3: // Busca
			{
				System.out.println("Informe o código a ser consultado: ");
				cod = Read.readInt();
				lista = lista1.find(cod);
				if (lista == null) {
					System.out.println("Código não encontrado!");
				} else
					lista.displayLink();
				break;
			}
			case 4: // Informa quanto resta
			{
				
				System.out.println("============================");				
				System.out.println("       LISTA EM ESTOQUE!       ");
				System.out.println("============================");
				System.out.println("");
				System.out.println("Quantidade de Engradado total: " + cont);
				System.out.println("");
				System.out.println("Quantidade de Engradado PILHA - 1: " + cont_pilha1);
				System.out.println("Na PILHA - 1 ainda pode ser inseridos: " + (5 - cont_pilha1));
				System.out.println("");
				System.out.println("Quantidade de Engradado PILHA - 2: " + cont_pilha2);
				System.out.println("Na PILHA - 2 ainda pode ser inseridos: " + (5 - cont_pilha2));
				break;
			}
			default: {
				System.out.println("Opção Inválida!");
			}
			}
			System.out.println("============================");
			System.out.println("          CADASTRO APP          ");
			System.out.println("       MAXIMO DE 5 CADASTRO!       ");
			System.out.println("============================");
			System.out.println("");
			System.out.println("1 - Cadastrar Engradado");
			System.out.println("2 - Excluir Engradado");
			System.out.println("3 - Buscar Engradado");
			System.out.println("4 - Informar Quantidade");
			System.out.println("5 - Sair");
			System.out.print("Digite a opção: ");
			op = Read.readInt();
		}
		System.out.println("*** FIM ***");
		System.out.print("*** *** ***");

		// pilha1.push(cad1); // push items

		// pilha1.displayStack(); // display stack

		// theStackCadastro.push(60); // push items
		// theStackCadastro.push(80);

		// theStackCadastro.displayStack(); // display stack

		// theStackCadastro.pop(); // pop items
		// theStackCadastro.pop();

		// theStackCadastro.displayStack(); // display stack

	}

}
