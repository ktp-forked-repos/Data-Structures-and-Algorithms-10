package linkedLists;

public class SinglyLinkedList extends LinkedList
{
	
	public SinglyLinkedList() 
    { 
    	super();
    }
	
    public SinglyLinkedList(Node node) 
    { 
    	super(node);
    }
    
    /**
      * Appends node to end of linked list
      * @param node the node to be added.
     */
    public void add(Node node)
    {
    	
    	Node x = head;
    	if(x.getNext() == null)
    	{
    		x.setNext(node);
    		length++;
    	}
    	else
    	{
    		while(x.getNext() != null)
        	{
        		x = x.getNext();
        		if(x.getNext() == null)
        		{
        			x.setNext(node);
        			length++;
        			break;
        		}
        	}
    	}
    }
    
    public void insert(Node node, int index)
    {
    	
    	if(index > length)
    	{
    		System.out.println("Index must be less than length");
    		return;
    	}

    	if(index == 0)
    	{
    		head = node;
    	}
    	else
    	{
    		if(index == length)
	    	{
	    		add(node);
	    	}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    	    	{
    	    		x = x.getNext();
    	    	}
    	    	Node temp = x;
    	    	node.setNext(temp.getNext());
    	    	temp.setNext(node);
    		}
    	}
    	
    	length++;
    }
    
    public void delete(int index)
    {
    	if(index == (length-1))
    	{
    		Node x = head;
    		for(int i = 0; i < length-1; i++)
    		{
    			x = x.getNext();
    		}
    		x.setNext(null);
    	}
    	else
    	{
    		if(index == 0)
    		{
    			Node temp = head;
    			head = head.getNext();
    			temp.setNext(null);
    		}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    			{
    				x = x.getNext();
    			}
    			Node temp = x;
    			x.setNext(temp.getNext().getNext());
    	    	temp.getNext().setNext(null);
    		}
    	}
    	length--;
    }

}
