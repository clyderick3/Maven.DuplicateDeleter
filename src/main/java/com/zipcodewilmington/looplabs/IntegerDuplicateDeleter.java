package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
//        return Arrays.stream(array)
//                .filter(number -> getOccurence(number) < maxNumberOfDuplications).toArray(Integer[]::new);
    }

    private Long getOccurence(Integer number) {
//        return Arrays.stream(array)
//                .filter(newNumber -> newNumber.equals(number)).count();
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        return Arrays.stream(array)
//                .filter(T -> getOccurence(T) != exactNumberOfDuplications).toArray(Integer[]::new);
    }
}
