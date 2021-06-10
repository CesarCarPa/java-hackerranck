import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        System.out.printf("Factorial de %d es %d", n, factorial(n));

        Node head = insert(null, 9);
        insert(head, 1);
        insert(head, 3);
        Node newHead = insert(head, 5);

        System.out.printf("New head value is %d\n", newHead.data);
//        Node node2 = new Node(1);
//        Node node3 = new Node(3);
//        Node node4 = new Node(5);

//        head.next = node2;
//        node2.next = node3;


        Node start = head;
        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }

    }

    public static Node insert(Node head, int data){
        if(head == null){
            return new Node(data);
        }else if(head.next == null){
            head.next = new Node(data);
        }else{
            insert(head.next, data);
        }
        return head;
    }

    public static int factorial(int n){
        return n == 1 ? n : factorial(n-1)*n;
    }
}

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
