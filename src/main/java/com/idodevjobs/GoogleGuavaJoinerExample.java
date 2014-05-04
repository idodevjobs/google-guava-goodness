package com.idodevjobs;

import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

public class GoogleGuavaJoinerExample
{
    public static void main( String[] args )
    {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("key1", "val1");
        testMap.put("key2", "val2");

        System.out.println(Joiner.on(',').join(testMap.values()));
    }
}


//System.out.println(StringUtils.join(testMap.values(), "'"));
