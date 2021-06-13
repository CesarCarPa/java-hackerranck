public class BinarySearchTree {

    public static void main(String... args){
        NodeB n3 = new NodeB(3);
        NodeB n2 = new NodeB(2);
        NodeB n5 = new NodeB(5);
        NodeB n1 = new NodeB(1);
        NodeB n4 = new NodeB(4);
        NodeB n6 = new NodeB(6);
        NodeB n7 = new NodeB(7);

        n3.left = n2;
        n3.right = n5;
        n2.left = n1;
        n5.left = n4;
        n5.right = n6;
        n6.right = n7;

        System.out.println(getH(n3));
    }

    static int getH(NodeB r){
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

class NodeB{
    NodeB left, right;
    int data;
    NodeB(int data){
        this.data = data;
        left=right=null;
    }

    @Override
    public String toString() {
        return data + "";
    }
}