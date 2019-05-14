public class Cadastro {
	 
	public String getDataEntrada() {
		return dataEntrada;
	}


	private int cod;
	private String marca;
	private String fornecedor;
	private String dataEntrada;
	
	
	public Cadastro(int cod, String marca, String fornecedor, String dataEntrada) {	
		this.cod = cod;
		this.marca = marca;
		this.fornecedor = fornecedor;
		this.dataEntrada = dataEntrada;
	}
	
	public void displayCadastro()
	{
		System.out.println("C�digo: " + cod);
		System.out.println("Marca: " + marca);
		System.out.println("Fornecedor: " + fornecedor);
		System.out.println("Data de Entrada: " + dataEntrada);
		System.out.println("");
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	

	public String getDataEntrada(String dataEntrada) {
		return dataEntrada;
	}
	
	
	
	
	

}

/*01) Desenvolver um programa em Java com implementa��o encadeada de pilha,
para gerenciar a �rea de armazenamento de um dep�sito de bebidas.
O dep�sito tem estrutura de armazenamento vertical permitindo um empilhamento m�ximo
de 50 engradados e at� 5 pilhas distintas. O sistema dever� implementar as opera��es de:
inser��o, remo��o, consulta e dever� ter uma op��o que indique quantos engradados
existem em cada pilha e quantos ainda podem ser inseridos (empilhados).
Tanto a entrada quanto a sa�da de engradados no deposito poder�o ser maiores do que um.
Devem ser armazenados: a marca da bebida, o fornecedor e a data de entrada no dep�sito.*/

