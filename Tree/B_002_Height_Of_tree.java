import java.util.Arrays;
import java.lang.Math;


public class B_002_Height_Of_tree {

    static public void main(String args [])
    {
        Node root =
                new Node(10,
                        new Node(20,
                                new Node(4,new Node(32,null,null), null),
                                new Node(5, null, null)
                        ),
                        new Node(30,
                                new Node(60, null, null),
                                new Node(70, null, null)
                        )
                );

        Tree tr = new Tree();
        int height = tr.height_of_tree(root);
        System.out.println("Height of Tree is " + height);
    }

}

class Node
{
    int key;
    Node leftNode;
    Node rightNode;
    Node(int key, Node left, Node right) {
        this.key = key;
        this.leftNode = left;
        this.rightNode = right;
    }
}

class Tree
{
    //Time Complexity is  o(n) and Space Complexity is O(h)
    int height_of_tree(Node root)
    {
        if(root == null) return 0;

        return Math.max(height_of_tree(root.leftNode), height_of_tree(root.rightNode)) +1;

    }
}



