 package myPackage;  

 class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class Assignment5Q2 {
    Node root;

    public boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        
        if (value == current.value) {
            return true;
        }
        
        
        return value < current.value
            ? searchRecursive(current.left, value)
            : searchRecursive(current.right, value);
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    public static void main(String[] args) {
        Assignment5Q2 bst = new Assignment5Q2();
        bst.root = new Node(5);
        bst.root.left = new Node(3);
        bst.root.right = new Node(7);
        System.out.println(bst.search(3)); 
        System.out.println(bst.search(8)); 
    }
}
