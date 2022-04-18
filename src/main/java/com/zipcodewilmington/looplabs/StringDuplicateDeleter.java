package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(number -> getOccurrence(number) < maxNumberOfDuplications).toArray(String[]::new);
    }

    private Long getOccurrence(String number) {
        return Arrays.stream(array)
                .filter(newNumber -> newNumber.equals(number)).count();
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(T -> getOccurrence(T) != exactNumberOfDuplications).toArray(String[]::new);
    }
}
