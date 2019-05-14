package Terceira_Questao;

public class LinkStackDocumento {

	private LinkListDocumento theList;
	 //--------------------------------------------------------------
	    public LinkStackDocumento()             // constructor
	       {
	       theList = new LinkListDocumento();
	       }
	 //--------------------------------------------------------------
	    public void push(Documento d)     // put item on top of stack
	       {
	       theList.insertFirst(d);
	       }
	 //--------------------------------------------------------------
	    public Documento pop()            // take item from top of stack
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
