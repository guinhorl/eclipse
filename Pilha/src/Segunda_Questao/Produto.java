package Segunda_Questao;

public class Produto {
	
	private int serie;
	private String modelo;
	private double valor;
	
	public Produto(int serie, String modelo, double valor) {
		this.serie = serie;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public int getSerie() {
		return serie;
	}

	public String getModelo() {
		return modelo;
	}
	
	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Produto [serie=" + serie + ", modelo=" + modelo + ", valor=" + valor + "]";
	}
	
	public void displayProduto()
	{
		System.out.println("===============================");
		System.out.println("          DESCRIÇÃO         ");
		System.out.println("===============================");
		System.out.println("Código: " + serie);
		System.out.println("Marca: " + modelo);
		System.out.println("Fornecedor: " + valor);
		System.out.println("===============================");
		System.out.println("");
	}
	
	
}
