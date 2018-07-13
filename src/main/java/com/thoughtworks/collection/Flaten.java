package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result=new ArrayList() ;
       for(int i=0;i<array.length;i++){
           for(int n=0;n<array[i].length;n++){
               result.add(array[i][n]);
           }
       }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result=new ArrayList() ;
        List<Integer> arrayList=new ArrayList() ;
        for(int i=0;i<array.length;i++){
            for(int n=0;n<array[i].length;n++){
                result.add(array[i][n]);
            }
        }
        for(int element:result){
            if(!arrayList.contains(element)){
                arrayList.add(element);
            }
        }
        return arrayList;
    }
}
