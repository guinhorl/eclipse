package Segunda_Questao;

public class LinkProduto {
	
	public Produto produto; // produto item
	public LinkProduto nextProduto; // next link in list
	// -------------------------------------------------------------

	public LinkProduto(Produto produto) // constructor
	{
		this.produto = produto;
	}

	// -------------------------------------------------------------
	public void displayLink() // display ourself
	{
		System.out.println("   ====== Caixas Entregues =====   ");
		System.out.println("N�mero de S�rie: " + produto.getSerie() + "\nModelo: " + produto.getModelo() + "\nValor: " + produto.getValor());
		System.out.println("   ====== **************** =====   ");

	}

}
