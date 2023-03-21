package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public void demo1() {
        String[] arr;

    }

    public void demo2() {
        Collection<String> coll = new ArrayList<>();
        coll.add("abc");
        coll.add("xyz");
        coll.add("pqr");
        coll.add("lmn");
        coll.add(null);
        System.out.println(coll);

        // Iterating the arr
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String el = it.next();
            System.out.println(el);
        }
        System.out.println("-------------------");
        // traversing
        for (String ele : coll) {
            System.out.println(ele);
        }
        System.out.println("-----------");
        // removing ele
        coll.remove("xyz");
        for (String el : coll) {
            System.out.println(el);
        }
        System.out.println("-----------");
        String xyssts = coll.contains("xyz") ? "it contains xyz" : "not contains xyz";
        System.out.println(xyssts);

        // adding one collection into another collection
        Collection<String> coll2 = new ArrayList<>();
        coll2.add("pqr");
        coll2.add("sgh");
        System.out.println(coll.addAll(coll2));

        

    
    }

}
