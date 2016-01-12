/* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       Queue<Node> myqueue = new LinkedList<Node>();
       Node currentVisit=null;
       
       myqueue.offer(root);
       
       while(myqueue.peek() != null){
           
           currentVisit = myqueue.remove();
           
           System.out.print(currentVisit.data+" ");
           
           if(currentVisit.left != null)
            myqueue.offer(currentVisit.left);
           
           if(currentVisit.right != null)
            myqueue.offer(currentVisit.right);
       }           
    }
