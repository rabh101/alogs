import java.util.Arrays;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class B_004_Tree_Level_Traversal
{
    public static void main(String args[])
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
        System.out.println("Same Level Traversal");
        tr.sameLevelTraversal(root);

        System.out.println("Same Level Traversal in reverse order");
        tr.sameLevelTraversalInReverseOrder(root);

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

    void sameLevelTraversal(Node root)
    {
        if (root == null) return;
        else
        {
            Queue<Node> qu = new LinkedList<Node>();
            qu.add(root);

            while(qu.isEmpty() == false)
            {
                  Node topNode = (Node)qu.poll();
                  System.out.println(topNode.key);

                  if( topNode.leftNode != null) qu.add(topNode.leftNode);
                  if (topNode.rightNode != null) qu.add(topNode.rightNode);
            }
        }
    }

    //Time Complexity is o(n) Space Complexity is O(n)
    void sameLevelTraversalInReverseOrder(Node root)
    {
        if (root == null) return;
        else {
            Queue<Node> qu = new LinkedList<Node>();
            Stack<Integer> st = new Stack<>();
            qu.add(root);

            while (qu.isEmpty() == false) {
                Node topNode = (Node) qu.poll();
                st.push(topNode.key);

                if (topNode.rightNode != null) qu.add(topNode.rightNode);
                if (topNode.leftNode != null) qu.add(topNode.leftNode);
            }

            while (st.isEmpty() == false)
            {
                System.out.println(st.pop());
            }
        }
    }


}