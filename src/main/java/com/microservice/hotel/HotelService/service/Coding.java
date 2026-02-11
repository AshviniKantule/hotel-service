package com.microservice.hotel.HotelService.service;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Coding {


    /**
     * Get the second-largest number from an array. For example, if given:
     * <p>
     * [1, 2, 3, 4, 5], then the method should return 4 since that is the second largest.
     *
     * @param array the array to obtain the second largest from
     * @return the second-largest element from the array, or null if there is no second largest, that is
     * <p>
     * if the input array is null, or has only one element, or all the elements are the same.
     */

    public static Integer secondLargest(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().toList();
        /*Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0;i<list.size();i++){
            if(map.containsKey(array[i])){
                map.put(list.get(i),map.get(i)+1);
            }
            else{
                map.put(list.get(i),1);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            System.out.println("keyValue:"+entry.getKey()+":"+entry.getValue());
        }*/

        if(array.length!=0) {
            List<Integer> list1 = Arrays.stream(array).boxed().toList();
            Optional<Integer> i = list1.stream().distinct().sorted((x, y)->y.compareTo(x)).skip(1).findFirst();
          //  System.out.println("secondLargest::" + i.get());

            return i.orElse(null);
        }
        else{
            return null;
        }

        //return i;
       // throw new UnsupportedOperationException("Implement this, please read javadoc first");

    }
    /**

     * Runs the tests to ensure correctness.

     * If there is an Incorrect in the output, check the implementation and try again.

     */

    public static void main(String[] args) {

        testSecondLargest(null);

        testSecondLargest(null, 1);

        testSecondLargest(1, 1, 2);

        testSecondLargest(null, 1, 1);

        testSecondLargest(null, 2, 2, 2);

        testSecondLargest(-1, 0, -1, -2);

        testSecondLargest(2, 1, 2, 3);

        testSecondLargest(3, 4, 3, 2);

        testSecondLargest(5, 1, 2, 3, 4, 5, 6);

    }

    private static <T> void test(T expected, T actual) {

        if (!Objects.equals(expected, actual)) {

            throw new RuntimeException("Incorrect, expected: " + expected + ", actual: " + actual);

        }

        else {

            System.out.println("Correct, actual: " + actual);

        }

    }



    private static void testSecondLargest(Integer expected, int... array) {

        System.out.print("secondLargest " + Arrays.toString(array) + ": ");

        test(expected, secondLargest(array));

    }


}
