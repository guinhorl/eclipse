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
		System.out.println("Código: " + cod);
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

/*01) Desenvolver um programa em Java com implementação encadeada de pilha,
para gerenciar a área de armazenamento de um depósito de bebidas.
O depósito tem estrutura de armazenamento vertical permitindo um empilhamento máximo
de 50 engradados e até 5 pilhas distintas. O sistema deverá implementar as operações de:
inserção, remoção, consulta e deverá ter uma opção que indique quantos engradados
existem em cada pilha e quantos ainda podem ser inseridos (empilhados).
Tanto a entrada quanto a saída de engradados no deposito poderão ser maiores do que um.
Devem ser armazenados: a marca da bebida, o fornecedor e a data de entrada no depósito.*/

