/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{    
    
    Stack<Integer> mystack = new Stack<>();
    Node currentNode=root.left;
    while(currentNode != null){
        mystack.push(currentNode.data);
        currentNode = currentNode.left;
    }
    while(!mystack.empty()){
        System.out.print(mystack.pop()+" ");
    }       
    
    System.out.print(root.data+ " ");
  
    currentNode=root.right;
    while(currentNode != null){
        System.out.print(currentNode.data+ " ");
        currentNode = currentNode.right;
    }
}
