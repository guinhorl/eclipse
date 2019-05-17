package Segunda_Questao;

public class ProdutoApp {
	/**
	 * 
	 * @author Wagner Ramos Lima
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variaveis
		String modelo;
		int serie, op, cont = 0, numSerie = 0, cont_pilha1 = 0, cont_pilha2 = 0, cont_pilha3 = 0;
		double valor = 0, valorTotal = 0, valorVendido = 0;
		//FIM variaveis
		
		//Objetos
		Produto aux;
		LinkProduto lista;
		LinkStackProduto pilha1 = new LinkStackProduto(); // make stack
		LinkStackProduto pilha2 = new LinkStackProduto(); // make stack
		LinkStackProduto pilha3 = new LinkStackProduto(); // make stack
		LinkListProduto lista1 = new LinkListProduto();
		LinkListProduto listaDeSaida = new LinkListProduto();
		Produto caixaSaida;		
		//FIM Objetos

		System.out.println("============================");
		System.out.println("          CADASTRO APP          ");
		System.out.println("       MAXIMO DE 3 POR PILHA!       ");
		System.out.println("============================");
		System.out.println("");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Excluir Produto");
		System.out.println("3 - Buscar Produto");
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
				System.out.print("Informe o nº de série: ");
				serie = Read.readInt();
				System.out.println("Informe o modelo: ");
				modelo = Read.readString();
				System.out.println("Informe o valor: ");
				valor = Read.readDouble();
				
				aux = new Produto(serie, modelo, valor);
				if (cont <= 2) {
					pilha1.push(aux);
					lista1.insertFirst(aux);
					valorTotal += valor;
					cont_pilha1++;
					cont++;
					break;
				}
				if (cont >= 3 && cont <= 6) {
					pilha2.push(aux);
					lista1.insertFirst(aux);
					valorTotal += valor;
					cont_pilha2++;
					cont++;
				} else if (cont >= 7 && cont <= 10) {
					pilha3.push(aux);
					lista1.insertFirst(aux);
					valorTotal += valor;
					cont_pilha3++;
					cont++;
				}
				
				else
					System.out.println(" == !! A CAPACIDADE DO PÁTIO ESTÁ ESGOTADA !! ==");
				break;
			}
			case 2:// Remoção
			{
				if (!pilha3.isEmpty()) {										
					caixaSaida = pilha3.pop();
					listaDeSaida.insertFirst(caixaSaida);
					valorVendido += caixaSaida.getValor();
					cont--;
					cont_pilha3--;
					
				} 
				if(!pilha2.isEmpty()){
					caixaSaida = pilha2.pop();
					listaDeSaida.insertFirst(caixaSaida);
					valorVendido += caixaSaida.getValor();
					cont--;
					cont_pilha2--;
				} else if(!pilha1.isEmpty()){
					caixaSaida = pilha1.pop();
					listaDeSaida.insertFirst(caixaSaida);
					valorVendido += caixaSaida.getValor();
					cont--;
					cont_pilha1--; 
				}
				else
					System.out.println("NÃO CONTEM PRODUTO NO ESTOQUE!!");
				break;
			}
			case 3: // Busca
			{
				System.out.println("Informe o número de série do produto: ");
				numSerie = Read.readInt();
				lista = lista1.find(numSerie);
				if (lista == null) {
					System.out.println("Produto não encontrado!");
				} else
					lista.displayLink();
				break;
			}
			case 4: // Informa RELATÓRIO FINAL
			{
				
				System.out.println("============================");				
				System.out.println("       RELATORIO!       ");
				System.out.println("============================");
				System.out.println("");
				System.out.println("Quantidade de produto total: " + cont);
				System.out.println("");
				System.out.println("Quantidade de caixa na PILHA - 1: " + cont_pilha1);
				System.out.println("");
				System.out.println("Quantidade de caixa na PILHA - 2: " + cont_pilha2);
				System.out.println("");
				System.out.println("Quantidade de caixa na PILHA - 3: " + cont_pilha3);
				System.out.println("");
				System.out.println("Valor total em estoque R$: " + (valorTotal - valorVendido));
				System.out.println("");
				System.out.println("Valor total vendido R$: " + valorVendido);
				System.out.println("");
				System.out.println("Caixas Entregues " + listaDeSaida.displayListSaida());
				break;
			}
			default: {
				System.out.println("Opção Inválida!");
			}
			}
			System.out.println("============================");
			System.out.println("          CADASTRO APP          ");
			System.out.println("       MAXIMO DE 3 POR PILHA!       ");
			System.out.println("============================");
			System.out.println("");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Excluir Produto");
			System.out.println("3 - Buscar Produto");
			System.out.println("4 - Informar Quantidade");
			System.out.println("5 - Sair");
			System.out.print("Digite a opção: ");
			op = Read.readInt();
		}
		System.out.print("*** FIM ***");

	}

}
