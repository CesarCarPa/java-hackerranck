package binaryTrees;

import util.Node;

public class Count {

    public static void main(String... args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
//        n5.right = n6;
//        n5.left = n7;

//        System.out.println(height(n3));
        System.out.println(getLeafCount(n1));
    }

    static int getHeight(Node r){
        int leftCount = 0, rightCount = 0;
        if(r.left != null){
            leftCount = getHeight(r.left) + 1;
        }
        if(r.right != null){
            rightCount = getHeight(r.right) + 1;
        }
        return leftCount > rightCount ? leftCount : rightCount;
    }

    static int getLeafCount(Node r) {
        if(r == null) {
            return 0;
        }else if(r.left == null && r.right == null) {
            return 1;
        }else{
            return getLeafCount(r.left) + getLeafCount(r.right);
        }
    }
}