package Segunda_Questao;

public class LinkListProduto {
	
	private LinkProduto first; // ref to first item on list
	// -------------------------------------------------------------

	public LinkListProduto() // constructor
	{
		first = null;
	} // no items on list yet
	// -------------------------------------------------------------

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// -------------------------------------------------------------
	public void insertFirst(Produto produt) // insert at start of list
	{ // make new link
		LinkProduto newLink = new LinkProduto(produt);
		newLink.nextProduto = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public Produto deleteFirst() // delete first item
	{ // (assumes list not empty)
		LinkProduto temp = first; // save reference to link
		first = first.nextProduto; // delete it: first-->old next
		return temp.produto; // return deleted link
	}

	// -------------------------------------------------------------
	public void displayList() {
		LinkProduto current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.nextProduto; // move to next link
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public LinkProduto find(int key) {
		LinkProduto current = first;
		while (current.produto.getSerie() != key) {
			if (current.nextProduto == null)
				return null;
			else
				current = current.nextProduto;
		}
		return current;
	}
	
	// -------------------------------------------------------------		
		
	
		public LinkProduto displayListSaida() {
			LinkProduto current = first; // start at beginning of list
			while (current != null) // until end of list,
			{
				current.displayLink(); // print data
				current = current.nextProduto; // move to next link
			}
			System.out.println("");
			return current;
		}
	
	// Deletando da lista
	/*public LinkProduto deleteFind(int key) {
		LinkProduto current = first;
		while (current.produto.getSerie() != key) {
			if (current.nextProduto == null)
				return null;
			else
				// current = current.nextProduto;
				deleteFirst();
		}
		return null;
	}*/

}
