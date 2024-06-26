public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input){
        Node newNode = new Node(input, null);

        if (!isEmpty()){
            Node currentNode = head;

            do {
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }while (currentNode != null);
        }else{
            System.out.print("Linked list kosong");
        }
    }
    

    public int getData(int index){
        Node currentNode = head;

        for (int i = 00; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public int indexOf(int key){
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if (!isEmpty()){
            head = head.next;
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        }else if(head.next == null){
            head = null;
        }else{
            Node currentNode = head;

            while (currentNode.next != null){
                if (currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void remove(int key){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        }else if(head.data == key){
            removeFirst();
        }else{
            Node currentNode = head;

            while (currentNode.next != null){
                if (currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void insertBefore(int key, int input) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node newNode = new Node(input, null);
        Node previousNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == key) {
                if (previousNode == null) {
                    newNode.next = head;
                    head = newNode;
                } else {
                    newNode.next = currentNode;
                    previousNode.next = newNode;
                }
                return; 
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        System.out.println("Key tidak ditemukan dalam linked list");
    }
    

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0) {
            addFirst(input); // Jika indeks 0, tambahkan di awal
        } else {
            Node newNode = new Node(input, null);
            Node previousNode = null;
            Node currentNode = head;
            int currentIndex = 0;
    
            while (currentNode != null && currentIndex < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            if (currentNode == null && currentIndex < index) {
                System.out.println("Indeks melebihi panjang linked list");
            } else {
                previousNode.next = newNode;
                newNode.next = currentNode;
            }
        }
    }
    
    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (index < 0) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0) {
        } else {
            Node previousNode = null;
            Node currentNode = head;
            int currentIndex = 0;
    
            while (currentNode != null && currentIndex < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            if (currentNode == null) {
                System.out.println("Indeks melebihi panjang linked list");
            } else {
                previousNode.next = currentNode.next;
            }
        }
    }
    

}
