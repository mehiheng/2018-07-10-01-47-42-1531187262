package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> arraylist=new ArrayList();
        if(left>=right){
            for(int i=right;i<=left;i++){
                arraylist.add(i);
                }
            Collections.reverse(arraylist);
            }
        else {
            for(int i=left;i<=right;i++)
                arraylist.add(i);
        }
        return arraylist;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> arraylist=new ArrayList();
        if(left>=right) {
            for(int i=right;i<=left;i++){
                if(i%2==0){
                    arraylist.add(i);
                }
                Collections.reverse(arraylist);
            }
        }
        else {
            for(int i=left;i<=right;i++)
                if(i%2==0){
                    arraylist.add(i);
                }
        }
        return arraylist;
    }


    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result=new ArrayList<Integer>();
            for(int a:array){
                if(a%2==0){
                    result.add(a);
                }
            }
            return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result =new ArrayList();
        for(int first:firstArray){
            for(int second:secondArray){
                if(first==second){
                    result.add(first);
                }
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result =new ArrayList();
        for(int first:firstArray){
            if(!result.contains(first)){
                result.add(first);
            }}
                for(int second:secondArray){{
                    if(!result.contains(second)){
                        result.add(second);
                    }
            }
        }
        return result;
    }
}
