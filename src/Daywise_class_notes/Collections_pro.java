package Daywise_class_notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections_pro {


    static void main(String[] args) {
       List<Integer> num = Arrays.asList(10,23,1,10,2,10,12,10); //
         num.stream()
                .filter(n->n % 2 == 0)//[10,10,2,12,10]
                .distinct()//[10,2,12]
                .map(i->i*i)//[100,4,144]
                .forEach(System.out::println);
        List<Integer> num_list = Arrays.asList(10,25,36,14,23,78,3,3,4,1,2);
//        num_list.map()
        num_list.
                stream()
                .map(n->n*n*n) //n = 10 ; 10 * 10 * 10 = 1000 ; n = 25 ; 25 * 25 * 25
                .forEach(System.out::println);
        System.out.println(" ****************************    ");

        Integer first_ele = num_list
                .stream()
                .filter(n -> n >= 10).findFirst().get();

//                .forEach(System.out::println);

        List<String> st = Arrays.asList("hello","Hai","how","are","you");

               List<String> ls  = st.stream().map(n -> n.toUpperCase()).collect(Collectors.toCollection(ArrayList::new));
               System.out.println(ls);

        // for  {s.o::p}
/*
        Stream<Integer> ns = num.stream();
        Stream<Integer> even_num = ns.filter(n -> n % 2 == 0);
        Stream<Integer> final_output = even_num.distinct();
        final_output.forEach(System.out::println);

  */

        // 10,2,12
//        System.out.println(final_output);
     /*   for(int i : final_output){
            System.out.println(i);
        }
*/





//        ns.
//         map :--> task
//       filter :-->even/odd / num > 5

  /*      for(int  : num){
            if(i i% 2 == 0){
              al.add(i);   //al :only even num
            }
        }
        for(int i : al){
            if(! nal.contains(i)){
               nal.add(i);
            }
        }
        System.out.println(nal);
        // > 5

   */
    }
}










