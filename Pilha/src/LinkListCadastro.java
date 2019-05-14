
public class LinkListCadastro {

	private LinkCadastro first; // ref to first item on list
	// -------------------------------------------------------------

	public LinkListCadastro() // constructor
	{
		first = null;
	} // no items on list yet
	// -------------------------------------------------------------

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// -------------------------------------------------------------
	public void insertFirst(Cadastro cadast) // insert at start of list
	{ // make new link
		LinkCadastro newLink = new LinkCadastro(cadast);
		newLink.nextCadastro = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public long deleteFirst() // delete first item
	{ // (assumes list not empty)
		LinkCadastro temp = first; // save reference to link
		first = first.nextCadastro; // delete it: first-->old next
		return temp.cadastro.getCod(); // return deleted link
	}

	// -------------------------------------------------------------
	public void displayList() {
		LinkCadastro current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.nextCadastro; // move to next link
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public LinkCadastro find(int key) {
		LinkCadastro current = first;
		while (current.cadastro.getCod() != key) {
			if (current.nextCadastro == null)
				return null;
			else
				current = current.nextCadastro;
		}
		return current;
	}

	// -------------------------------------------------------------
	// Deletando da lista
	public LinkCadastro deleteFind(int key) {
		LinkCadastro current = first;
		while (current.cadastro.getCod() != key) {
			if (current.nextCadastro == null)
				return null;
			else
				// current = current.nextCadastro;
				deleteFirst();
		}
		return null;
	}
}
