package Segunda_Questao;

public class LinkStackProduto {
	
	private LinkListProduto theList;
	 //--------------------------------------------------------------
	    public LinkStackProduto()             // constructor
	       {
	       theList = new LinkListProduto();
	       }
	 //--------------------------------------------------------------
	    public void push(Produto p)     // put item on top of stack
	       {
	       theList.insertFirst(p);
	       }
	 //--------------------------------------------------------------
	    public Produto pop()            // take item from top of stack
	       {
	       return theList.deleteFirst();
	       }
	 //--------------------------------------------------------------
	    public boolean isEmpty()       // true if stack is empty
	       {
	       return ( theList.isEmpty() );
	       }
	 //--------------------------------------------------------------
	    public void displayStack()
	       {
	       System.out.print("Stack (top-->bottom): ");
		theList.displayList();
	}	    	    	   

}
