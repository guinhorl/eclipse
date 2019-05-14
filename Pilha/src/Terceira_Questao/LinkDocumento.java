package Terceira_Questao;

public final class LinkDocumento {

	public Documento documento; // documento item
	public LinkDocumento nextDocumento; // next link in list
	// -------------------------------------------------------------

	public LinkDocumento(Documento doc) // constructor
	{
		documento = doc;
	}

	// -------------------------------------------------------------
	public void displayLink() // display ourself
	{
		System.out.println("Tipo: " + documento.getTipoDocumento() + "\nRemetente: " + documento.getRemetente() + "\nResponsável: " + documento.getResponsavel());

	}
}
