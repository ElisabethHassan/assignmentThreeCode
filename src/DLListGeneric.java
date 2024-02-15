class DLGNode<T>{
    DLGNode next;
    DLGNode prev;
    T data;
    public DLGNode(T data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLListGeneric<T> {
    private DLGNode head;
    public DLListGeneric(){
        head = null;
    }

    public void listAdd(T p){
        DLGNode newNode = new DLGNode(p);

        if(head == null){
            head = newNode;
        } else {
            DLGNode current = head;
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

                //H
        //null  > 1 > null
        // 2 > 3 > 5 > 6 > 1
        if(pos == 0){
            head = head.next; //move the first node to the value behind it
            if(head != null){
                head.prev = null; //"delete" the beginning node
            }
            return;
        }

        DLGNode current = head;
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
        DLGNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }



}
