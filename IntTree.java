//Peter Hovenier
//8/12/2022
//CS 145 Darrell Criss
//Binary Search Tree

public class IntTree {
   private IntTreeNode overallRoot;
   //constructs a tree with given number of nodes
   public IntTree(int max) {
      if (max < 0) {
         throw new IllegalArgumentException("max: " + max);
      }
      overallRoot = buildTree(1, max);
   }
   //returns a tree with n as its root unless n is greater than max
   private IntTreeNode buildTree(int n, int max) {
      if (n > max) {
         return null;
      } else {
         return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
      }
   }
   //prints preorder
   public void printPreorder() {
      System.out.print("preorder:");
      printPreorder(overallRoot);
      System.out.println();
   }
   //prints in preorder
   private void printPreorder(IntTreeNode root) {
      if (root != null) {
         System.out.print(" " + root.data);
         printPreorder(root.left);
         printPreorder(root.right);
      }
   }
   //prints using inorder
   public void printInorder() {
      System.out.print("inorder:");
      printInorder(overallRoot);
      System.out.println();
   }
   // prints inorder
   private void printInorder(IntTreeNode root) {
      if (root != null) {
         printInorder(root.left);
         System.out.print(" " + root.data);
         printInorder(root.right);
      }
   }
   //prints using postorder traversal
   public void printPostorder() {
      System.out.print("postorder:");
      printPostorder(overallRoot);
      System.out.println();
   }
   //prints in postorder with given root
   private void printPostorder(IntTreeNode root) {
      if (root != null) {
         printPostorder(root.left);
         printPostorder(root.right);
         System.out.print(" " + root.data);
      }
   }
   //print the tree contents
   public void printSideways() {
      printSideways(overallRoot, 0);
   }
   //print in reversed preorder the tree with given root
   private void printSideways(IntTreeNode root, int level) {
      if (root != null) {
         printSideways(root.right, level + 1);
         for (int i = 0; i < level; i++) {
            System.out.print("   ");
         }
         System.out.println(root.data);
         printSideways(root.left, level + 1);
      }
   }
}
    