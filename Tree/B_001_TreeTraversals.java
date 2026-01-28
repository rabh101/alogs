import java.util.Arrays;



public class B_001_TreeTraversals {

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
        System.out.println("In Order Traversal------------");
        tr.InOrderTraversal(root);


        System.out.println("Pre Order Traversal------------");
        tr.PreOrderTraversal(root);


        System.out.println("Post Order Traversal------------");
        tr.PostOrderTraversal(root);

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
    //Time Complexity O(n)
    // Space complexity is O(h) due to recursion,
    // which is O(log n) for a balanced tree and O(n) in the worst case.
    public  void PreOrderTraversal( Node root)
    {
        if( root == null) return;

        System.out.println(root.key);
        PreOrderTraversal(root.leftNode);
        PreOrderTraversal(root.rightNode);
    }

    //Time Complexity O(n)
    // Space complexity is O(h) due to recursion,
    // which is O(log n) for a balanced tree and O(n) in the worst case.
    public  void InOrderTraversal( Node root)
    {
        if( root == null) return;

        InOrderTraversal(root.leftNode);
        System.out.println(root.key);
        InOrderTraversal(root.rightNode);

    }

    //Time Complexity O(n)
    // Space complexity is O(h) due to recursion,
    // which is O(log n) for a balanced tree and O(n) in the worst case.
    public  void PostOrderTraversal( Node root)
    {
        if( root == null) return;

        PostOrderTraversal(root.leftNode);
        PostOrderTraversal(root.rightNode);
        System.out.println(root.key);

    }
}



