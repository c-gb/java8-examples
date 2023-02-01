package com.slb.java8;

import java.util.Optional;

public class OptionalExampleSLB {
    public static void main(String[] args) {
        String str = null;
        Optional<String> string = Optional.ofNullable(str);

        if (string.isPresent()) {
            System.out.println("Value is : " + string.get());
        } else {
            System.out.println("Value is not present");
        }
        str= "Simplified Learning Blog";
        string = Optional.ofNullable(str);

        if (string.isPresent()) {
            System.out.println("Value is : " + string.get());
        } else {
            System.out.println("Value is not present");
        }
    }
}

