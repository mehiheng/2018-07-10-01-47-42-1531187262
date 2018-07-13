package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(x->x*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList();
        for(int i=0;i<array.size();i++){
            int a=array.get(i);
            result.add(Character.valueOf((char)(a+96)).toString());
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList();
        for(int i=0;i<array.size();i++){
            int a=array.get(i);
            if(a>52){
                result.add("b"+Character.valueOf((char)(a+96-52)).toString());
            }else if(a>26){
                result.add("a"+Character.valueOf((char)(a+96-26)).toString());
            }else{
                result.add(Character.valueOf((char)(a+96)).toString());
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
