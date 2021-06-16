import util.NodeList;

public class LinkedListRemoveDuplicates {

    public static void main(String... args){
        NodeList n1 = new NodeList(1);
        NodeList n2 = new NodeList(2);
        NodeList n3 = new NodeList(2);
        NodeList n4 = new NodeList(3);
        NodeList n5 = new NodeList(3);
        NodeList n6 = new NodeList(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        print(n1);
        removeDuplicates(n1);
        System.out.println();
        print(n1);
    }

    static NodeList removeDuplicates(NodeList head){
        NodeList current = head, temp = null, index = null;
        while(current != null){
            temp = current;
            index = current.next;
            while(index != null){
                if(current.data == index.data){
                    temp.next = index.next;
                }else{
                    temp = index;
                }
                index = index.next;
            }
            current = current.next;
        }
        return head;
    }

    static void print(NodeList n){
        while(n != null){
            System.out.printf("%s ", n);
            n = n.next;
        }
    }
}
