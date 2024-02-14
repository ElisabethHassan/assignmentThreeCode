public class Main {
    public static void main(String[] args) {
        //TESTS

        //Testing SLL
        SLList list = new SLList();
        list.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        list.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        list.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));
//        System.out.println(list.toString());

        //Testing SLL Generic
        SLListGeneric listGeneric = new SLListGeneric();
        String word = "hello";
        String word2 = "hi";
        listGeneric.listAdd(word);
        listGeneric.listAdd(word2);
//        System.out.println(listGeneric.toString());
//        listGeneric.listRemove(0);
//        System.out.println(listGeneric.toString());


        //Testing DLL
        DLList dlList = new DLList();
        dlList.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        dlList.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        dlList.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));
        System.out.println(dlList.toString());
        dlList.listRemove(0);
        dlList.listRemove(0);
        dlList.listRemove(0);
        System.out.println(dlList.toString());

        DLListGeneric dlListGeneric = new DLListGeneric();
        dlListGeneric.listAdd(word);
        dlListGeneric.listAdd(word2);
//        System.out.println(dlListGeneric.toString());
        dlListGeneric.listRemove(1);
//        System.out.println(dlListGeneric.toString());


        System.out.println("------------");
        AListGeneric aListGeneric = new AListGeneric();
        aListGeneric.listAdd(word);
        aListGeneric.listAdd(word2);
        System.out.println(aListGeneric.toString());
        aListGeneric.listRemove(0);
        System.out.println("removed list :");
        System.out.println(aListGeneric.toString());


        //Testing AL
        AList alist = new AList();
        alist.listAdd(new Book("Harry Potter", "JK Rowling", 12.30));
        alist.listAdd(new Book("Never Let Me Go", "Ishua Kaje", 45.25));
        alist.listAdd(new Book("Brooklyn", "Honey Bee", 17.90));
//        System.out.println(alist.toString());
//        alist.listRemove(1);
//        System.out.println(alist.toString());

    }
}