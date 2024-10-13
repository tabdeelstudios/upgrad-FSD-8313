class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;
    // Create
    void insert(int item){
        root = insertRec(root, item);
    }
    Node insertRec(Node root, int item){
        if(root == null){
            root = new Node(item);
            return root;
        }
        if(item < root.key){
            root.left = insertRec(root.left, item);
        } else if(item > root.key){
            root.right = insertRec(root.right, item);
        } else if(item==root.key){
            System.out.println("Item already exists!");
        }
        return root;
    }

    // Read
    boolean search(int key){
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key){
        if(root==null) return false;
        if(root.key == key) return true;

        if(key<root.key){
            return searchRec(root.left, key);
        } else {
           return searchRec(root.right, key);
        }
    }

    // return key<root.key ? searchRec(root.left, key) : searchRec(root.right, key);

    // Update
    void update(int oldKey, int newKey){
        delete(oldKey);
        insert(newKey);
    }

    // Delete
    void delete(int key){
        root = deleteRec(root, key);
    }
    
    Node deleteRec(Node root, int key){
        if(root==null) return root;
        if(key<root.key){
            root.left = deleteRec(root.left, key);
        } else if(key>root.key){
            root.right = deleteRec(root.right, key);
        } else {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root){
        int minValue = root.key;
        while(root.left!=null){
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Inorder Traversal
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root){
       if(root!=null){
        // LrR
        inorderRec(root.left);
        System.out.print(root.key + ", ");
        inorderRec(root.right);
       }
    }

    // PreOrder Traversal
    void preorder() {
        preorder(root);
    }

    void preorder(Node root){
       if(root!=null){
        // rLR
        System.out.print(root.key + ", ");
        preorder(root.left);
        preorder(root.right);
       }
    }

    // PostOrder Traversal
    void postorder() {
        postorder(root);
    }

    void postorder(Node root){
       if(root!=null){
        // LRr
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + ", ");
       }
    }
}


public class TreeDemo {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();

        // Create
        myTree.insert(1001);
        myTree.insert(1002);
        myTree.insert(1000);
        myTree.insert(1003);

        // Traversal
        System.out.println("Inorder Traversal - ");
        myTree.inorder();
        System.out.println();
        System.out.println("Preorder Traversal - ");
        myTree.preorder();
        System.out.println();
        System.out.println("Postorder Traversal - ");
        myTree.postorder();
        System.out.println();

        // Read
        System.out.println("Read: Employee 1002 exists? "+myTree.search(1002));
        System.out.println("Read: Employee 1005 exists? "+myTree.search(1005));

        // Update
        myTree.update(1002, 2002);
        System.out.println("Updated: Employee 1002 changed to 2002");
        
        // Delete
        myTree.delete(1001);
        System.out.println("Deleted: Employee 1001");

        System.out.println("Inorder Traversal - ");
        myTree.inorder();
        System.out.println();
        System.out.println();
        System.out.println("Preorder Traversal - ");
        myTree.preorder();
        System.out.println();
        System.out.println();
        System.out.println("Postorder Traversal - ");
        myTree.postorder();
        System.out.println();
        System.out.println();
    }
}