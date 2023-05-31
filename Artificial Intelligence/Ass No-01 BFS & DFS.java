import java.util.*;

class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }

    public static void DFS_Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        DFS_Preorder(root.left);
        DFS_Preorder(root.right);
    }
     public static void DFS_Inorder(Node root) {
        if (root == null) {
            return;
        }
        DFS_Inorder(root.left);
        System.out.print(root.data + " ");
        DFS_Inorder(root.right);
    }
     public static void DFS_Postorder(Node root) {
        if (root == null) {
            return;
        }
        DFS_Postorder(root.left);
        DFS_Postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void BFS_levelOrder(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data for the root node: ");
        int rootData = scanner.nextInt();
        Node root = new Node(rootData);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print("Enter the left child data of " + current.data + " : ");
            int leftData = scanner.nextInt();
            if (leftData != -1) {
                current.left = new Node(leftData);
                queue.add(current.left);
            }

            System.out.print("Enter the right child data of " + current.data + " : ");
            int rightData = scanner.nextInt();
            if (rightData != -1) {
                current.right = new Node(rightData);
                queue.add(current.right);
            }
        }
        
        
        System.out.print("DFS_Preorder: ");
        DFS_Preorder(root);
        System.out.println();
        
        
        System.out.print("DFS_Inorder: ");
        DFS_Inorder(root);
        System.out.println();

        System.out.print("DFS_Postorder: ");
        DFS_Postorder(root);
        System.out.println();

        System.out.print("BFS_levelOrder: ");
        BFS_levelOrder(root);
    }
}


// Output:

// Enter the data for the root node: 1
// Enter the left child data of 1 : 2
// Enter the right child data of 1 : 3
// Enter the left child data of 2 : 4
// Enter the right child data of 2 : 5
// Enter the left child data of 3 : -1
// Enter the right child data of 3 : -1
// Enter the left child data of 4 : -1
// Enter the right child data of 4 : -1
// Enter the left child data of 5 : -1
// Enter the right child data of 5 : -1
// DFS_Preorder: 1 2 4 5 3 
// DFS_Inorder: 4 2 5 1 3 
// DFS_Postorder: 4 5 2 3 1 
// BFS_levelOrder: 1 2 3 4 5
