import util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BSTLevelOrderTraversal {

    public static void main(String... args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n7 = new Node(7);

        n3.left = n2;
        n3.right = n5;

        n2.left = n1;

        n5.left = n4;
        n5.right = n7;

        printLevelOrderTraversal(n3);
    }

    static void printLevelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.remove();
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
            System.out.println(n);
        }
    }
}
