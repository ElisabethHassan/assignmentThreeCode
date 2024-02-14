import java.util.Arrays;

public class AListGeneric<T> {

    private T[] listArray;
    private int size;
    private int maxSize;

    public AListGeneric(int mSize){
        maxSize = mSize;
        size = 0;
        listArray = (T[]) new Object[maxSize];

    }

    public AListGeneric(){
        maxSize = 0;
        size = 0;
        listArray = (T[]) new Object[maxSize];

    }
    public T[] grow(T[] arr){
        maxSize += 1;
        int newSize = maxSize * 2;
        T listArr[] = (T[]) new Object[newSize];
        for(int i = 0; i < arr.length; i++){
            listArr[i] = arr[i];
        }
        maxSize = newSize;
        return listArr;
    }
    
    public void listAdd(T p){
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
        if(pos == size-1){
            size --;
        } else if (pos < size-1 ){
            for(int i = pos; i < size-1; i++){
                listArray[i] = listArray[i+1]; //shift down elements
            }
            size--;
        } else System.out.println("Not a valid position");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(listArray[i].toString());
            if (i < listArray.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
