package Test_3;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class MyArraylist<E> {
    private Object[] objects={};
    private int size;//size既记录元素的个数，也记录下一个位置
    private int DEFAULT_CAPCITY=10;
    public boolean add(E e){
        if (size== objects.length){
            grow();
        }
        objects[size++]=e;
        return true;
    }

    private void grow(){
        if (size==0){
            objects=new Object[DEFAULT_CAPCITY];
        }
        else {
            objects= Arrays.copyOf(objects,objects.length>>1+objects.length);
        }
    }

    public E get(int index){
        checkindex(index);
        return  (E)objects[index];
    }

    public void checkindex(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException(index+" is out of the max length"+size);
        }
    }

    public E remove(int index){
        checkindex(index);
        E e=(E) objects[index];
        int moveflag=size-index-1;
        if (moveflag!=0){
            System.arraycopy(objects,index+1,objects,index,moveflag);
        }
        objects[--size]=null;
        return e;
    }

    public int size(){
        return  size;
    }

    public void foreach(MyConsumer<E> action){
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accepy((E) objects[i]);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner=new StringJoiner(",","[","]");
        for (int i = 0; i < size; i++) {
            E e=(E) objects[i];
            joiner.add(e.toString());
        }
        return joiner.toString();
    }
}
