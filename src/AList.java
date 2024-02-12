import java.util.Arrays;

public class AList {

    private Book listArray[];
    private int size;
    private int maxSize;

    public AList(int mSize){
        maxSize = mSize;
        size = 0;
        listArray = new Book[maxSize];

    }

    public Book[] grow(Book[] arr){
        Book listArr[] = new Book[maxSize * 2];
        for(int i = 0; i < arr.length; i++){
            listArr[i] = arr[i];
        }
        return listArr;
    }
    public void listAdd(Book p){
        if(size < maxSize){
            listArray[size] = p;
            size++;
        } else if (size == maxSize){
            listArray = grow(listArray);
            listArray[size] = p;
            size++;
        }

    }

    public void listRemove(int pos){
        if(pos == size){
            size --;
        } else if (pos < size-1 ){
            for(int i = pos; i < size-1; i++){
                listArray[i] = listArray[i+1]; //shift down elements
                size--;
            }
        } else System.out.println("Not a valid position");
    }

    @Override
    public String toString() {
        return "AList{" +
                "listArray=" + Arrays.toString(listArray) +
                ", size=" + size +
                ", maxSize=" + maxSize +
                '}';
    }
}
