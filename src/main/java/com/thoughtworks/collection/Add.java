package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0;
        if(leftBorder>=rightBorder){
           for(int i=rightBorder;i<=leftBorder;i++){
               if(i%2==0){
                   sum+=i;
               }
           }
        }
        else {
            for(int i=leftBorder;i<=rightBorder;i++)
                if(i%2==0){
                    sum+=i;
                }
            }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum=0;
        if(leftBorder>=rightBorder){
            for(int i=rightBorder;i<=leftBorder;i++){
                if(i%2!=0){
                    sum+=i;
                }
            }
        }
        else {
            for(int i=leftBorder;i<=rightBorder;i++)
                if(i%2!=0){
                    sum+=i;
                }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for (int i:arrayList) {
            i=i*3+2;
            sum+=i;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        ArrayList arrayList2=new ArrayList();
        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            int a =(int) li.next();
            if(a%2!=0){
                a=a*3+2;
                arrayList2.add(a);
            }else{
            arrayList2.add(a);
            }
        }
        return arrayList2;

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        ArrayList arrayList2=new ArrayList();
        int sum=0;
        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            int a =(int) li.next();
            if(a%2!=0){
               sum+=(a*3+5);
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
       return arrayList.get((arrayList.size()-1)/2);
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        ArrayList arrayList2=new ArrayList();
        int sum=0;
        int average=0;
        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            int a =(int) li.next();
            if(a%2!=0){
                arrayList2.add(a);
            }
        }
        ListIterator li2 = arrayList2.listIterator();
        while(li2.hasNext()){
            int b =(int) li2.next();
               sum+=b;
        }
        average=sum/arrayList2.size();
        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        ArrayList arrayList2=new ArrayList();
        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            int a =(int) li.next();
            if(a%2==0){
                arrayList2.add(a);
            }
        }
        ListIterator li2 = arrayList2.listIterator();
        while(li2.hasNext()){
            int b =(int) li2.next();
            if(b==specialElment){
                return true;
            }
        }
            return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        ArrayList arrayList2=new ArrayList();
        ArrayList arrayList3=new ArrayList();
        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            int a =(int) li.next();
            if(a%2==0){
                arrayList2.add(a);
            }
        }
        ListIterator li2 = arrayList2.listIterator();
        while(li2.hasNext()){
            int b =(int) li2.next();
            if(arrayList3.contains(b)){
               continue;
            }else{
                arrayList3.add(b);
            }
        }
        return arrayList3;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        ArrayList arrayList2=new ArrayList();
        ArrayList arrayList3=new ArrayList();
        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            int a =(int) li.next();
            if(a%2!=0){
                arrayList2.add(a);
            }
        }
        ListIterator li2 = arrayList.listIterator();
        while(li2.hasNext()){
            int b =(int) li2.next();
            if(b%2==0){
                arrayList3.add(b);
            }
        }
        Collections.sort(arrayList2);
        Collections.sort(arrayList3);
        Collections.reverse(arrayList2);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        Object[] array=arrayList.toArray();
        ArrayList<Integer> arraylist2=new ArrayList();
        for(int i=0;i<array.length-1;i++){
           arraylist2.add(((Integer) array[i]+(Integer) array[i+1])*3);
           System.out.print(((Integer) array[i]+(Integer) array[i+1])*3);
        }
        return arraylist2;
    }
}
