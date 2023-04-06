package com.axis.main;

import com.axis.firstassignment.FizzBuzz;
import com.axis.firstassignment.ReverseString;
import com.axis.firstassignment.StringPallindrome;
import com.axis.mockassignment.FindDerivativeofCos;
import com.axis.mockassignment.GetSet;
import com.axis.mockassignment.RemoveDuplicatesFromArr;
import com.axis.mockassignment.SquaringNumByLambda;

public class Main {
    public static void fiz() {
        FizzBuzz fz = new FizzBuzz();
        fz.fizzEle();
    }

    public static void pallindrome() {
        StringPallindrome sp = new StringPallindrome();
        System.out.println(sp.checkForPallindrome());
    }

    public static void revstring() {
        ReverseString rs = new ReverseString();
        rs.ReverseString();
    }

    public static void getterSetter() {
        GetSet gs = new GetSet();
        gs.setOwnerName("abc");
        gs.setCurrentBalance(10);
        gs.setAccountNumber("100");

        System.out.println((int) gs.getCurrentBalance());
        System.out.println(gs.getAccountNumber());
        System.out.println(gs.getOwnerName());
    }

    public static void sqrNum() {
        SquaringNumByLambda snl = new SquaringNumByLambda();
        snl.squareofNum();

    }

    public static void removedup() {
        RemoveDuplicatesFromArr rdup = new RemoveDuplicatesFromArr();
        rdup.removeduplicates();
    }

    public static void findderivatives() {
        FindDerivativeofCos fd = new FindDerivativeofCos();
        fd.findderivatives();
    }

    public static void main(String[] args) {
        // pallindrome();
        // revstring();
        // getterSetter();
        // sqrNum();
        // removedup();
        findderivatives();
    }
}
