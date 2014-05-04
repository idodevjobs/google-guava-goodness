package com.idodevjobs;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class GoogleGuavaIterablesExample {
	private String input;

	public static void main(String[] args) {

		List<GoogleGuavaIterablesExample> testList = Lists.newArrayList(
				new GoogleGuavaIterablesExample("input1"),
				new GoogleGuavaIterablesExample("input2"));
		System.out.println(getInstanceFromList("input1", testList));

	}

	public static GoogleGuavaIterablesExample getInstanceFromList(
			final String input, List<GoogleGuavaIterablesExample> testList) {
		return Iterables.find(testList,
				new Predicate<GoogleGuavaIterablesExample>() {
					public boolean apply(
							GoogleGuavaIterablesExample googleGuavaIterablesExample) {
						return googleGuavaIterablesExample.getInput().equals(
								input);
					}
				});
	}

    public GoogleGuavaIterablesExample(String input) {
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