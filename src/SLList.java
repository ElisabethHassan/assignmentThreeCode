import org.w3c.dom.Node;

class SLNode {
    Book data;
    SLNode next;

    public SLNode(Book data){
        this.data = data;
    }
}


public class SLList {
    private SLNode head;

    public SLList() {
        this.head = null;
    }

    public void listAdd(Book p){
        SLNode node = new SLNode(p);
        if(head == null){
            head = node;
        } else {
            SLNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void listRemove(int pos){
        if(head == null){
            return;
        }

        if(pos == 0){
            head = head.next;
            return;
        }

        SLNode current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        current.next = current.next.next;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        SLNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }

}
