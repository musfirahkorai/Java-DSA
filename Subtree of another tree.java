public boolean isIdentical(TreeNode root,TreeNode subRoot){
       if(subRoot == null && root == null){
           return true;
       }
       if(root == null || subRoot == null){
           return false;
       }
       if(root.val == subRoot.val){
           return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
       }
       return false;
   }
  
   public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(subRoot == null){
           return true;
       }
       if(root == null){
           return false;
       }
       if(isIdentical(root, subRoot)){
           return true;
       }
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
   }
