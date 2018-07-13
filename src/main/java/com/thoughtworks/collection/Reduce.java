package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Reduce implements SingleLink{

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().reduce(Integer::max).get();
    }

    public double getMinimum() {
        return arrayList.stream().reduce(Integer::min).get();
    }

    public double getAverage() {
//        return arrayList.stream().mapToDouble(num -> num).average().getAsDouble();
        double sum=0;
        for(int element :arrayList){
            sum+=element;
    }
    return sum/arrayList.size();
    }

    public double getOrderedMedian() {
        int index = arrayList.size() / 2;
        if (index % 2 == 0) {
            return arrayList.stream().skip(index - 1).limit(2).mapToInt(num -> num).average().getAsDouble();
        } else {
            return arrayList.stream().skip(index).findFirst().get();
        }
    }


    public int getFirstEven() {
        return arrayList.stream().filter(x->x%2==0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int firstEvent = arrayList.stream().filter(num -> num % 2 == 0).findFirst().get();
        return arrayList.indexOf(firstEvent);
    }

    public boolean isEqual(List<Integer> objectList) {
//        Boolean isEqual = false;
//        if (objectList.size() == arrayList.size()) {
//            isEqual = IntStream.range(0, arrayList.size())
//                    .allMatch(index -> arrayList.get(index) == objectList.get(index));
//        }
//        return isEqual;
        List<Integer> result=new ArrayList();
        for(Integer a:objectList){
            if(arrayList.contains(a)){
                result.add(a);
            }
        }
            if(result.size()==arrayList.size()){
            return true;
        }else{
            return false;
            }
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
            int index = arrayList.size() / 2;
            if (arrayList.size() % 2 == 0) {
                return (Double.valueOf(singleLink.getNode(index) + singleLink.getNode(index + 1)) / 2);
            } else {
                return Double.valueOf(singleLink.getNode(index + 1));
            }
        }


    public int getLastOdd() {
        return arrayList.stream().filter(num -> num % 2 != 0).reduce((first, second) -> second).get();
    }

    public int getIndexOfLastOdd() {
        return arrayList.lastIndexOf(getLastOdd());
    }


    @Override
    public void addTailPointer(Object item) {

    }

    @Override
    public int getNode(int index) {
        return Integer.parseInt(null);
    }
}
