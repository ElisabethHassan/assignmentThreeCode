public class Main {
    public static void main(String[] args) {
        SLList list = new SLList();
        list.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        list.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        list.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));

        AList alist = new AList(6);
        alist.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        alist.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        alist.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));


        System.out.println("List");
        System.out.println(alist.toString());
    }
}