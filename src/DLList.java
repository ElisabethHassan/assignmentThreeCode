class DLNode{
    DLNode next;
    DLNode prev;
    Book data;
    public DLNode(Book data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLList {
    private DLNode head;
    public DLList(){
        head = null;
    }

    public void listAdd(Book p){
        DLNode newNode = new DLNode(p);

        if(head == null){
            head = newNode;
        } else {
            DLNode current = head;
            while(current.next != null){ //shifts values down
                current = current.next;
            }
            current.next = newNode; //last available node is assigned the new data
            newNode.prev = current; //points the last node to the current node (new data)
        }
    }

    public void listRemove(int pos){
        if(head == null){ //nothing to remove
            return;
        }

        if(pos == 0){
            head = head.next; //move the first node to the value behind it
            if(head != null){
                head.prev = null; //"delete" the beginning node
            }
            return;
        }

        DLNode current = head;
        for(int i = 0; current != null && i < pos; i++){
            current = current.next;
        }
        if(current == null) return; //position out of bounds
        if(current.prev != null){
            current.prev.next = current.next; //update pointers to remove the current node
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }


}
