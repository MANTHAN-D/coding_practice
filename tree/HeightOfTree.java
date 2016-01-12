   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       int treeHeight=1;
       int ht=1;
       if(root.left != null){
           ht += height(root.left);
           if(ht > treeHeight){
               treeHeight = ht;
           }
       }
       ht=1;
       if(root.right != null){
           ht += height(root.right);
           if(ht > treeHeight){
               treeHeight = ht;
           }
       }
       return treeHeight;
         
    }
