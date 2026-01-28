import java.util.Arrays;
import java.lang.Math;

class B_003_Tree_Node_At_Distance_K
{
    public static void main(String [] args)
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
        System.out.println("Print Node at Distance 2");
         tr.printNodeAtDistanceImp1(root,2,0);

        System.out.println("Print Node at Distance 2");
        tr.printNodeAtDistanceImp2(root,2);

        System.out.println("Print Node at Distance 3");
        tr.printNodeAtDistanceImp1(root,3,0);

        System.out.println("Print Node at Distance 3");
        tr.printNodeAtDistanceImp2(root,3);
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

    void printNodeAtDistanceImp1(Node root, int dist, int currentH)
    {
        if(root == null) return;

        if( dist == currentH) {
            System.out.println(root.key);
            return;
        }
        printNodeAtDistanceImp1(root.leftNode, dist, currentH +1);
        printNodeAtDistanceImp1(root.rightNode, dist, currentH +1);

    }

    //Time Complexiy O(n) Space COmplexity O(k)
    void printNodeAtDistanceImp2(Node root, int dist)
    {
        if(root == null) return;

        if( dist == 0) {
            System.out.println(root.key);
            return;
        }
        printNodeAtDistanceImp2(root.leftNode, dist-1);
        printNodeAtDistanceImp2(root.rightNode, dist-1);

    }
}


