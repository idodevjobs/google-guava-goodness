package com.idodevjobs;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

public class GoogleGuavaListToMap {

    private String input;

    public GoogleGuavaListToMap(String input) {
        this.input = input;
    }

    public static void main(String[] args) {

        List yourList = Lists.newArrayList(new GoogleGuavaListToMap("input1"), new GoogleGuavaListToMap("input2"));

        Map newMap = Maps.uniqueIndex(yourList, new Function<GoogleGuavaListToMap, String>() {
            @Override
            public String apply(GoogleGuavaListToMap googleGuavaListToMap) {
                return googleGuavaListToMap.getInput(); // or something else
            }
        });

        System.out.println(newMap);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "GoogleGuavaExample{" +
                "input='" + input + '\'' +
                '}';
    }
}