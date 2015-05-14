package com.idodevjobs;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class GoogleGuavaIterablesFindExample {
	private String input;

	public static void main(String[] args) {

		List<GoogleGuavaIterablesFindExample> testList = Lists.newArrayList(
				new GoogleGuavaIterablesFindExample("input1"),
				new GoogleGuavaIterablesFindExample("input2"));
		System.out.println(getInstanceFromList("input1", testList));

	}

	public static GoogleGuavaIterablesFindExample getInstanceFromList(
			final String input, List<GoogleGuavaIterablesFindExample> testList) {
		return Iterables.find(testList,
				new Predicate<GoogleGuavaIterablesFindExample>() {
					public boolean apply(
							GoogleGuavaIterablesFindExample googleGuavaIterablesFindExample) {
						return googleGuavaIterablesFindExample.getInput().equals(
								input);
					}
				});
	}

    public GoogleGuavaIterablesFindExample(String input) {
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