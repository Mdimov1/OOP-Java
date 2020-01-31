package edu.exerciseOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class CustomList <T extends Comparable<T>> implements Iterate{
    private List<T> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }

    public List<T> getCustomList() {
        return customList;
    }

    private T getElement(int index){
        return customList.get(index);
    }

    public void add(T element){
        customList.add(element);
    }

    public void remove(T element){
        customList.remove(element);
    }

    public boolean contains(T element){
        return customList.contains(element);
    }

    public void swap(int indexOne, int indexTwo) {

        T element = customList.get(indexOne);

        customList.set(indexOne, customList.get(indexTwo));
        customList.set(indexTwo, element);
    }

    public int countGreaterThan(T element){
        int counter = 0;

        for (int i = 0; i < customList.size(); i++) {
            int cmp = element.compareTo(getElement(i));

            if(cmp < 0){
                counter++;
            }
        }
        return counter;
    }

    public T getMax(){
        return Collections.max(customList);
    }

    public T getMin(){
        return Collections.min(customList);
    }

    public void print(){
        for (T t: customList) {
            out.println(t);
        }
    }

    public void sort() {
        Collections.sort(customList);
    }

    @Override
    public void iterateList() {
        for (Iterator iterator = customList.iterator(); iterator.hasNext();) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }
    }
}
