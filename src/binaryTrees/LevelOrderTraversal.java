package binaryTrees;

import util.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String... args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n3.left = n2;
        n3.right = n5;

        n2.left = n1;

        n5.left = n4;
        n5.right = n7;

        n4.left = n8;
        n4.right = n9;

        printLevelOrderTraversal(n3);

        System.out.println();
        System.out.println(printLevelsOrderTraversal(n3));
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

    static List<List<Node>> printLevelsOrderTraversal(Node root){
        List<List<Node>> result = new ArrayList();
        Queue<Node> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            List<Node> level = new ArrayList<>();
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i++) {
                Node n = q.remove();
                level.add(n);
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            }
            result.add(level);
        }
        return result;
    }
}
