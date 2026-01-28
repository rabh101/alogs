import java.util.Arrays;
import java.lang.Math;

public class B_005_Size_Of_the_Tree
{
    public static  void main(String [] args)
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
        int treeSize = tr.SizeOfTree(root);

        System.out.println("Number of Node in tree are " + treeSize);
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

class Tree {

    int SizeOfTree(Node root) {
        if (root == null) return 0;

        return SizeOfTree(root.leftNode) + SizeOfTree(root.rightNode) + 1;
    }
}