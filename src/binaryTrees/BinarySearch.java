package binaryTrees;

import util.Node;

public class BinarySearch {

    public static void main(String... args){
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node n5 = new Node(5);
        Node n1 = new Node(1);
        Node n4 = new Node(4);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n3.left = n2;
        n3.right = n5;
        n2.left = n1;
        n5.left = n4;
        n5.right = n6;
        n6.right = n7;

        System.out.println(getH(n3));
    }

    static int getH(Node r){
        int leftCount = 0, rightCount = 0;
        if(r.left != null){
            leftCount = getH(r.left) + 1;
        }
        if(r.right != null){
            rightCount = getH(r.right) + 1;
        }
        return leftCount > rightCount ? leftCount : rightCount;
    }
}