package com.axis.innerclass;

public class IcDemos {
    public void demo1() {
        Outer out = new Outer();
        Outer.NormalInner ni = out.new NormalInner();
        ni.accessOuter();
        Outer.StaticInner si = new Outer.StaticInner();
        si.staticOuter();
        out.display();
    }

    public void demo2() {
        Runnable mapper = new DataMapper();
        Runnable swapper = new DataMapper();
    }

    public void demo3() {
        class DataTopper implements Runnable {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'run'");
            }

            Runnable topper = new DataTopper();
        }
    }

    public void demo4() {
        Runnable run = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'run'");
            }
        };
    }

    public void demo5() {
        Animal tiger = new Tiger();
        tiger.walk();
        Animal animal = new Animal() {

            @Override
            public void walk() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'walk'");
            }

            @Override
            public void eat() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'eat'");
            }

        };
        animal.walk();
    }
}
