package com.axis.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;

public class BasicDemo {
    public void demo1() {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'run'");
            }

        };
    }

    // can I assign funtion
    public void demo2() {
        // Runnable runnable = function
        Runnable runnable2 = () -> {
        };// lambda

        Runnable runnable3 = this::someFunction;// method references
    }

    public void someFunction() {

    }

    public void demo3() {
        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("pqr");
        names.add("xyz");
        names.add("lmn");
        names.add("rst");
        names.add("opr");
        names.add("ret");
        names.add("opt");
        names.add("tiu");
        // too mechanical,with external tool
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        // less mechanical but external tool
        for (String nm : names) {
            System.out.println(nm);
        }
        // iterator come along with collection,not developers friendly
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String nm = it.next();
        }
    }

    public void demo4() {
        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("pqr");
        names.add("xyz");
        names.add("lmn");
        names.add("rst");
        names.add("opr");
        names.add("ret");
        names.forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);
            }

        });
    }

    public void demo5() {
        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("pqr");
        names.add("xyz");
        names.add("lmn");
        names.add("rst");
        names.add("opr");
        names.forEach((String t) -> System.out.println(t));
        names.forEach(t -> System.out.println(t));
        names.forEach(this::abc);
        names.forEach(System.out::println);
    }

    public void abc(String t) {
        System.out.println(t);
    }

    public void demo6() {
        Adable ad1 = (a, b) -> {
            System.out.println("A " + a + " B " + b);
            return a + b;

        };
        System.out.println(ad1.add(10, 21));
        Adable ad2 = new Adable() {

            @Override
            public int add(int a, int b) {
                return a + b;
            };

        };
        System.out.println(ad2.add(21, 11));
    }

    public void demo7() {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "abc");
        mp.put(2, "xyz");
        mp.put(4, "ght");
        mp.put(2, "pwq");
        mp.put(1, "Abc");
        mp.put(3, "btrt");
        mp.put(9, "bopl");
        Set<Map.Entry<Integer, String>> entries = mp.entrySet();
        for (Map.Entry<Integer, String> ent : entries) {
            System.out.println("Key " + ent.getKey() + " Val " + ent.getValue());
        }
        mp.forEach(new BiConsumer<Integer, String>() {
            int i = 10;

            @Override
            public void accept(Integer key, String value) {
                int i = 10;
                System.out.println("key " + key + " Value " + value);
            }

        });
        final int i = 11;
        mp.forEach((k, v) -> {
            System.out.println("key" + k + " value " + v);
        });

    }

    public void demo8() {
        Integer[] arr = { 12, 76, 7, 54, 2, 8, 99, 74, 36 };
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(arr));
        System.out.println(numbers);
        boolean sts = numbers.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                return t > 40;
            }

        });
        System.out.println("Is Removed : " + sts);
        System.out.println(numbers);
    }

    public void demo9() {
        Integer[] arr = { 1, 90, 51, 0, 23, 45, 21, 10 };
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(arr));
        System.out.println(numbers);

        boolean sts1 = numbers.removeIf(n -> n > 40);
        System.out.println("Is removed " + sts1);
        System.out.println(numbers);
    }

}
