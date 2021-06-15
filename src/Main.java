import util.NodeList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        System.out.printf("Factorial de %d es %d", n, factorial(n));

        NodeList head = insert(null, 9);
        insert(head, 1);
        insert(head, 3);
        NodeList newHead = insert(head, 5);

        System.out.printf("New head value is %d\n", newHead.data);
//        Node node2 = new Node(1);
//        Node node3 = new Node(3);
//        Node node4 = new Node(5);

//        head.next = node2;
//        node2.next = node3;


        NodeList start = head;
        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }

    }

    public static NodeList insert(NodeList head, int data){
        if(head == null){
            return new NodeList(data);
        }else if(head.next == null){
            head.next = new NodeList(data);
        }else{
            insert(head.next, data);
        }
        return head;
    }

    public static int factorial(int n){
        return n == 1 ? n : factorial(n-1)*n;
    }
}
