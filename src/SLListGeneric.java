class SLGNode<T> {
    T data;
    SLGNode next;

    public SLGNode(T data){
        this.data = data;
    }
}

public class SLListGeneric<T> {
    private SLGNode head;

    public SLListGeneric() {
        this.head = null;
    }

    public void listAdd(T p){
        SLGNode node = new SLGNode(p);
        if(head == null){
            head = node;
        } else {
            SLGNode current = head;
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

        SLGNode current = head;
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
        SLGNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }



}
