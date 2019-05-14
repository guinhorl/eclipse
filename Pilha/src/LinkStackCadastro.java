
public class LinkStackCadastro {
	
	
	   private LinkListCadastro theList;
		 //--------------------------------------------------------------
		    public LinkStackCadastro()             // constructor
		       {
		       theList = new LinkListCadastro();
		       }
		 //--------------------------------------------------------------
		    public void push(Cadastro c)     // put item on top of stack
		       {
		       theList.insertFirst(c);
		       }
		 //--------------------------------------------------------------
		    public long pop()            // take item from top of stack
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
