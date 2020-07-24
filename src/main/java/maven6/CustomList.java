package maven6;

import java.util.*;
class CustomList<E> extends AbstractList<E>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
        return true;
    }
    @SuppressWarnings("unchecked")
    public E get(int i) 
    {
        if (i >= size || i < 0) 
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
    @SuppressWarnings("unchecked")
    public E remove(int i)
    {
        if (i >= size || i < 0) 
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numofelmts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numofelmts ) ;
        size--;
        return (E) item;
    }
    public int size() {
        return size;
    }
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}


