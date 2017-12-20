package com.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamdaTest {

    public static void main(String[] args){
//        pingfang();
//        OneToMany();
        FilterTest();
    }

   public static void pingfang(){
       List<Integer> nums = Arrays.asList(1, 2, 3, 4);
       List<Integer> squareNums = nums.stream().
               map(n -> n * n).
               collect(Collectors.toList());
       System.out.println("计算的总数为： " + squareNums);
   }

   public static void OneToMany(){
       Stream<List<Integer>> inputStream = Stream.of(
               Arrays.asList(1),
               Arrays.asList(2, 3),
               Arrays.asList(4, 5, 6)
       );
       Stream<Integer> outputStream = inputStream.
               flatMap((childList) -> childList.stream());

       System.out.println("outputStream: "  + outputStream);
   }

   public static void FilterTest(){
       Integer[] sixNums = {1, 2, 3, 4, 5, 6};
       Integer[] evens =
               Stream.of(sixNums).filter(n -> n%2 == 0).toArray(Integer[]::new);
       Stream.of(evens).forEach(System.out::print);


   }
}
