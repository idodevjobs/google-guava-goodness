package com.idodevjobs;

import com.google.common.base.Optional;

import java.util.List;

public class GoogleGuavaOptionalExample {
    public static void main(String[] args) {

        // GOOD

        Optional<List<String>> fromNull = Optional.fromNullable(getList());
        if (fromNull.isPresent()) {
            // do something
            System.out.println("not null");
        } else {
            System.out.println("null");
        }

        // BAD

        if (getList() != null) {
            // do something
        }
    }

    private static List<String> getList() {
        return null;
    }
}