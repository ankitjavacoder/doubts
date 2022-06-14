package com.nendrasys.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OptionalExample1 {
    public static Optional<String> checkValue (){
        String myVal = "Hello Boy";
        Optional<String> test = Optional.ofNullable(myVal);
        return test;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList();
        al1.add(1);
        al1.add(3);
        al1.add(6);
        al1.add(2);
        al1.add(9);
//        System.out.println(al1);
//        Optional<ArrayList<Integer>> data = Optional.of(al1);
////        Predicate<ArrayList<Integer>> wPred = (i -> data.i);
//        Optional<ArrayList<Integer>> welCome = data.filter(i -> i.stream().filter(in->in>1));
        Optional<List> helloOptonal = Optional.of(al1);
//        Predicate<List> welcomePredicate = s -> s >10;
        Optional<List> welcomeOptional = helloOptonal.filter(s -> s>10);
        System.out.println("welcomeOptional : " + welcomeOptional);
    }
}
