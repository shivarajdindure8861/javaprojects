package com.axis.anotation;

public class App {
    public static void demo1() {
        Tiger tg = new Tiger();
        tg.run();

        tg.runFast();
        String sts = CheckerImpl.checkFeilds(tg);
        System.out.println(sts);

        Class<Tiger> cls = Tiger.class;
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());

    }

    public static void demo2() {
        Account ac = new Account();
        GetSetProcessor.GenerateAccessors(ac);
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println("🔥 Annotations 🔥");
        demo2();

    }
}
