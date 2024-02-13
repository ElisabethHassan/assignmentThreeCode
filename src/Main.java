public class Main {
    public static void main(String[] args) {
        SLList list = new SLList();
        list.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        list.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        list.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));

        SLListGeneric listGeneric = new SLListGeneric();
        String word = "hello";
        String word2 = "hi";
        listGeneric.listAdd(word);
        listGeneric.listAdd(word2);
//        System.out.println(listGeneric.toString());
        listGeneric.listRemove(0);
//        System.out.println(listGeneric.toString());


        DLList dlList = new DLList();
        dlList.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        dlList.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        dlList.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));
        System.out.println(dlList.toString());
        dlList.listRemove(0);
        dlList.listRemove(0);
        dlList.listRemove(0);
        System.out.println(dlList.toString());


        //todo: fix grow function and how much it's supposed to grow
        AList alist = new AList(1);
        alist.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        alist.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        alist.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));


//        System.out.println("List");
//        System.out.println(list.toString());
//        System.out.println(alist.toString());

//        alist.listRemove(1);
//        list.listRemove(1);

//        System.out.println("List");
//        System.out.println(alist.toString());
//        System.out.println(list.toString());

    }
}