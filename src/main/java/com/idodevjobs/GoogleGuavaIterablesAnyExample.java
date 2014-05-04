package com.idodevjobs;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class GoogleGuavaIterablesAnyExample {
	private String input;

	public static void main(String[] args) {
		List<GoogleGuavaIterablesAnyExample> testList = Lists.newArrayList(
																new GoogleGuavaIterablesAnyExample("input1"),
																new GoogleGuavaIterablesAnyExample("input2"),
																new GoogleGuavaIterablesAnyExample("input1"),
																new GoogleGuavaIterablesAnyExample("input2"),
																new GoogleGuavaIterablesAnyExample("input3"));
		System.out.println("isPresentUsingGuava : " + isPresentUsingGuava("input1", testList));
		System.out.println("isPresentUsingForLoop : " + isPresentUsingForLoop("input4", testList));

	}

	public static boolean isPresentUsingGuava (final String input, List<GoogleGuavaIterablesAnyExample> testList) {
		return Iterables.any(testList, new Predicate<GoogleGuavaIterablesAnyExample>() {
			public boolean apply(GoogleGuavaIterablesAnyExample googleGuavaIterablesExample) {
				return googleGuavaIterablesExample.getInput().equals(input);
			}
		});
	}
	
	public static boolean isPresentUsingForLoop (final String input, List<GoogleGuavaIterablesAnyExample> testList) {
		for (GoogleGuavaIterablesAnyExample googleGuavaIterablesAnyExample : testList) {
			if (googleGuavaIterablesAnyExample.getInput().equals(input)) {
				return true;
			}
		}
		return false;
	}

    public GoogleGuavaIterablesAnyExample(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

	public String toString() {
		return "GoogleGuavaIterablesExample{" + "input='" + input + '\'' + '}';
	}
}