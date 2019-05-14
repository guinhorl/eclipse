package Terceira_Questao;

public class LinkListDocumento {

	private LinkDocumento first; // ref to first item on list
	// -------------------------------------------------------------

	public LinkListDocumento() // constructor
	{
		first = null;
	} // no items on list yet
	// -------------------------------------------------------------

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// -------------------------------------------------------------
	public void insertFirst(Documento doc) // insert at start of list
	{ // make new link
		LinkDocumento newLink = new LinkDocumento(doc);
		newLink.nextDocumento = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public Documento deleteFirst() // delete first item
	{ // (assumes list not empty)
		LinkDocumento temp = first; // save reference to link
		first = first.nextDocumento; // delete it: first-->old next
		return temp.documento; // return deleted link
	}

	// -------------------------------------------------------------
	public void displayList() {
		LinkDocumento current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.nextDocumento; // move to next link
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	

}
