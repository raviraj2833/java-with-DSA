public class linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        // create a new node at first
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // link the next of new node to head
        newnode.next = head;

        // head-->> new node
        head = newnode;
    }

    // add last in linked list

    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        // if(head==null){
        // System.out.println("LinkedList is empty..");
        // return;
        // }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // addmiddle
    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // remove first node
    public int removefirst(){
        if(size==0){
            System.out.println("Linked is empty..");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        size--;
        head=head.next;
        return val;
    }
    // remove last

    public int removelast(){
        if(size==0){
            System.out.println("Linked list is empty..");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        // prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    // searching the key using recursive method:
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // find and remove Nth node from end
    public void deleteNodefromEnd(int n){
        // size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        // size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    // to find mid using slow- fast method
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; // +1 
            fast=fast.next.next; // +2
        }
        return slow;
    }
    public boolean palindrome(){
        // base case
        if(head==null || head.next==null){
            return true;
        }
        // step 1-->> find mid
        Node midIdx=findmid(head);
        // step 2-->> reverse 2nd half
        Node prev=null;
        Node curr=midIdx;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        // step 3-- check palindrome or not
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    // reverse the linked list
    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        linked_list li = new linked_list();
        li.addfirst(2);
        li.addfirst(1);
        li.addlast(3);
        li.addlast(4);
        // li.add(2, 3);
        li.print(); // 1->2->3->4->5 --- size = 5
        // System.out.println(li.recSearch(3));
        // System.out.println(li.recSearch(10));
        // System.out.println("size of linked list:" + " " + size);
        // li.removefirst();
        // li.print();
        // System.out.println("Size of linked list:"+" "+ size);
        // li.removefirst();
        // li.print();
        // System.out.println("Size of linked list:"+" "+ size);
        // li.removelast();
        // li.print();
        // System.out.println("Size of linked list:"+" "+ size);
        // li.deleteNodefromEnd(4);
        // System.out.println(li.palindrome());
        li.reverseLL();
        li.print();
        

        
    }
}