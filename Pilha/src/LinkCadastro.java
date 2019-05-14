
public class LinkCadastro {

	public Cadastro cadastro; // cadastro item
	public LinkCadastro nextCadastro; // next link in list
	// -------------------------------------------------------------

	public LinkCadastro(Cadastro cadast) // constructor
	{
		cadastro = cadast;
	}

	// -------------------------------------------------------------
	public void displayLink() // display ourself
	{
		System.out.println("Código: " + cadastro.getCod() + "\nMarca: " + cadastro.getMarca() + "\nData de Entrada: " + cadastro.getDataEntrada());

	}

}
