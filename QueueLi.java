    /**
     * List-based implementation of the queue.
     * @author Mark Allen Weiss
     */

public class QueueLi {
	
    private ListNode front;
    private ListNode back;
    private int currsize=0;
	
    /**
     * Construct the queue.
     */
    public QueueLi( ) {
        front = back = null;
    }
    
    /**
     * Test if the queue is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
        return front == null;
    }
    
    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     */
    public void enqueue( Object x ) {
    	
        if( isEmpty( ) )    // Make queue of one element
            back = front = new ListNode( x );
        else {  //code for the case when queue is not empty
        	ListNode newnode = new ListNode( x );
        	back.next = newnode;
        	back = newnode;
        	currsize++;
        }
        
       /*TO DO*/ // done - to be checked
      
    }
    
    /**
     * Return and remove the least recently inserted item
     * from the queue.
     * @return the least recently inserted item in the queue.
     */
    public Object dequeue( ) {
        if( isEmpty( ) ) {
        	//prints to error stream
        	System.err.println("Queue empty!");
        	return null;
        }
        else {   //code for the case when queue is not empty
        	ListNode tempnode = new ListNode( front.element );
        	front = front.next;
        	currsize--;
        	return tempnode.element;
        }
        /*TO DO*/ //done - to be checked
    }

    /**
     * Return the least recently inserted item
     * of the queue.
     * @return the least recently inserted item in the queue.
     */
    public Object peek()
    {
    	if( isEmpty( ) ) {
    		//prints to error stream
        	System.err.println("Queue empty!");
        	return null;
    	}
    	else {  //code for the case when queue is not empty
    		return front.element;
    	}
    		
        /*TO DO*/  // done - to be checked
    }
    
    /**
     * Return the number of elements in the queue.
     * @return the the number of elements in the queue.
     */
    public int size()
    {
    	return currsize;
    }
    
    
}
