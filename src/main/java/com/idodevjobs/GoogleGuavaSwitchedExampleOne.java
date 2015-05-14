package com.idodevjobs;

import ch.lambdaj.function.closure.Switcher;

public class GoogleGuavaSwitchedExampleOne {
    public static void main(String args[]) {
        Switcher generic = new Switcher()
                .addCase(1, "Integer")
                .addCase(1.1, "Double")
                .addCase(1.1f, "Float")
                .addCase("S", "String")
                .setDefault("Others");
        System.out.println("Switch type " + generic.exec(1.1f));
        System.out.println("Switch type " + generic.exec("S"));
        System.out.println("Switch type " + generic.exec(1));
        System.out.println("Switch type " + generic.exec(1.1));
        System.out.println("Switch type " + generic.exec("SS"));
    }
}