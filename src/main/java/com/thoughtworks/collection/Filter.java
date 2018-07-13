package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
            this.array=array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList();
        for (int element : array) {
            if (element % 2 == 0) {
                result.add(element);
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList();
        for (int element : array) {
            if (element % 3 == 0) {
                result.add(element);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList();
        for(int f:firstList){
            if(secondList.contains(f)){
                result.add(f);
            }
        }
        return result;
    }


    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList();
        for (int a : array) {
            if(!result.contains(a)){
                result.add(a);
            }
        }
        return result;
    }
}