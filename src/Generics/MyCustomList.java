package Generics;

import java.util.ArrayList;

public class MyCustomList<T extends Object> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }
    public T get(int i) {
        return list.get(i);
    }
    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }
}
