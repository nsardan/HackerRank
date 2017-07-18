package com.datastructure;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by neha on 05/07/17.
 */
public class HashMapDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        HashMap<Integer, String> demo = new HashMap<Integer, String>();
        demo.put(1, "Neha");
        demo.put(2, "Himanshu");
        demo.put(1, "Makhija");

        Set<Integer> keys = demo.keySet();



        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Neha");
        ts.add("Sardana");


        List<String> listOfItems = new ArrayList<String>();
        listOfItems.add("Neha");
        listOfItems.add("Sardana");
        listOfItems.add("Himanshu");
        listOfItems.add("makhija");


        Iterator<String> iter = listOfItems.iterator();

        while(iter.hasNext()){
            //System.out.println(iter.next());
            iter.next();
            iter.remove();
        }
        System.out.println(listOfItems.size());


       // Class stack = Stack.getClass();
       // Method aMethod = stack.getMethod("pop", Stack.class);

        //System.out.println(aMethod.getName());

        Byte b  = new Byte("123");

        System.out.println(b.toString());



    }
}
