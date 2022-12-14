    /**
     * List-based implementation of the stack.
     * @author Mark Allen Weiss
     */
    public class StackLi
    {
        private ListNode topOfStack;
        private int currsize;
    	
        /**
         * Construct the stack.
         */
        public StackLi( )
        {
            topOfStack = null;
        }


        /**
         * Test if the stack is logically empty.
         * @return true if empty, false otherwise.
         */
        public boolean isEmpty( )
        {
            return topOfStack == null;
        }

        /**
         * Make the stack logically empty.
         */
        public void makeEmpty( )
        {
            topOfStack = null;
        }

        
        /**
         * Insert a new item into the stack.
         * @param x the item to insert.
         */
        public void push( Object x )
        {
        	ListNode newnode = new ListNode( x );
        	newnode.next = topOfStack;
        	topOfStack = newnode;
        	currsize++;
        	/*TO DO*/
        }
        
        
        /**
         * Return and remove the most recently inserted item from the stack.
         * @return the most recently inserted item in the stack, or null, if empty.
         */
        public Object pop( )
        {
        	if( isEmpty( ) ) {
        		//prints to error stream
        		System.err.println("Stack empty!");
        		return null;
        	}
        	else {  //code for case when stack is not empty
        		ListNode tempnode = new ListNode( topOfStack.element );
        		topOfStack = topOfStack.next;
        		currsize--;
        		return tempnode.element;
        	}

        	/*TO DO*/  //done - to be checked
        }

       
        
        /**
         * Get the most recently inserted item in the stack.
         * Does not alter the stack.
         * @return the most recently inserted item in the stack, or null, if empty.
         */
        public Object peek( )
        {
        	if( isEmpty( ) ) {
        		//prints to error stream
        		System.err.println("Stack empty!");
        		return null;
        	}
        	else {    //code for the case when stack is not empty
        		return topOfStack.element;
        	}
        	
            /*TO DO*/
        }
 
        
        /**
         * Return the number of elements in the stack.
         * @return the the number of elements in the stack.
         */
        public int size()
        {
        	return currsize;
        }

    
    }
