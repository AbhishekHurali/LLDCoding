package LambdasAndStreams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,5,2,3,7,6,10,1,8,8,10);

     //   numList.stream().forEach((element)-> System.out.println(element));

//        numList
//                .stream()
//                .limit(4)
//                .distinct()
//                .forEach((element)-> System.out.println(element));

//        List<Integer> list1 = numList.stream()
//                .filter((element)-> {return element%2==0;})
//                .collect(Collectors.toList());

       // System.out.println(list1);

//        List<Integer> list2 = numList.stream()
//                .map((element)-> { return element*element; })
//                .collect(Collectors.toList());

        //System.out.println("New List : "+ list2);

//        List<Integer> list3 = numList.stream()
//                .filter((element)-> {
//                    System.out.println("Filtering "+element);
//                    return element%2==0;
//                })
//                .map((element)-> {
//                    System.out.println("mapping :"+ element);
//                    return element * element;
//                })
//                .collect(Collectors.toList());

       // System.out.println("new List :"+ list3);

//        Optional<Integer> i = numList.stream()
//                .filter((element)-> {
//                    System.out.println("Filtering "+element);
//                    return element%2==0;
//                })
//                .map((element)-> {
//                    System.out.println("mapping :"+ element);
//                    return element * element;
//                })
//                .findFirst();
//
//        if(!i.isEmpty())
//        {
//            System.out.println(i);
//        }

//        Integer newSum = numList.stream()
//                .reduce(10,(curr_sum,element)-> { return curr_sum + element;});
//
//        System.out.println("New Sum : "+ newSum);

        Integer fact = numList.stream()
                .reduce(0,(curr_sum,element)-> { return curr_sum * element;});

        System.out.println("New product : "+ fact);

    }
}
