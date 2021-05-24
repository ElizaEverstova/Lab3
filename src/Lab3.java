class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String toString(){
        return "Node{" +
                "value=" + value +
                ", next" + next +
                "}";
    }
}
public class Lab3 {
    public static Node creatHead(int i) {
        Node head = null;
        for (; i >= 0; i--) {
            head = new Node(i, head);
        }
        return head;
    }

    public static Node createTail(int g) {
        Node head = new Node(0, null);
        Node tail = head;
        for (int i=0; i < g; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next; // указатель на созданный элемент запоминается
        }
        return tail;
    }
    public static Node addFirst(Node oldhead, Node newHead){
        newHead.next = oldhead;
        return newHead;
    }
    public static Node addLast(Node oldTail, Node newTail){
        oldTail.next = newTail;
        return newTail;
    }
    public static Node Insert(Node head, Node newNode, int index){
        Node ref = head;
        int k=1;
        while (ref.next!=null &&(k<index)){
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        return head;
    }
    public static Node Remove (Node head, int index){
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<index)){
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        return head;
    }
    public static Node removeFirst (Node head){
        return (head = head.next);
    }
    public static Node removeLast(Node head){
        Node ref = head;
        while (ref.next.next!=null){
            ref = ref.next;
        }
        ref.next = null;
        return head;
    }


    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++){
    }
        Node head = creatHead(4);
        System.out.println(head);
        Node newNode = new Node(-100, null);
        Node ref = Insert(head, newNode, 3);
        System.out.println(ref);
        head = removeFirst(head);
        System.out.println(head);
        head = removeLast(head);
        System.out.println(head);
        head = Remove (head, 2);
        System.out.println(head);
        Node tail = createTail(4);
        System.out.println(tail);
        Node newTail = addLast(tail, new Node(10, null));
        Node newHead = addFirst(head, new Node(-1, null));
        System.out.println(newHead);
        System.out.println(newTail);
    }
}

