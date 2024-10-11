package lists;

class EfficientIntLinkedList implements IntList {
    IntNode head, tail;
    int len;

    public EfficientIntLinkedList() {
        head = null;
        tail = null;
        len = 0;
    }

    public boolean contains(int value) {
        IntNode current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void append(int value) {
        IntNode newNode = new IntNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        len++;
    }

    public int length() {
        return len;
    }

    public static void main(String[] args) {
        EfficientIntLinkedList list = new EfficientIntLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list.contains(2));
        System.out.println(list.contains(4));
        System.out.println(list.length());
    }
}

