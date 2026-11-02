package Daywise_class_notes;

import java.util.*;


public class Set_collections {
    static void main(String[] args) { //2hr(7 to 9)
        /* ArrayList(Get ele)  Linked List(remove/add)
         set ;-->not allow the duplicate
           1. Hashset  :-- it is not stored in oreder
           2.LinkedHaset :-- it stored in order
         Queue:--> it now allow the null values
             ArrayDeque :-- it allows any type
             PriorityQueue;--> it allow only one type(sorted)
         */
//        Map:--> {name=rani}
//        HashMap map = new HashMap(); //{ }
        //data put
        LinkedHashMap map = new LinkedHashMap();
        map.put("name","rani");
        map.put(45,23578984);
        map.put("msg" ,"hello");
        map.put("msg1","hello");
        map.put("msg","hai");
        System.out.println(map); //{msg=hai, msg1=hello, name=rani, 45=23578984}
        //remove
        map.remove(45);
        System.out.println(map);//{msg=hai, msg1=hello, name=rani}

        //get keys
        System.out.println(map.keySet()); //[msg, msg1, name]  set

        //get valeus
        System.out.println(map.values()); //[hai, hello, rani]  set

        //getting key adn values
        System.out.println(map.entrySet());//[msg=hai, msg1=hello, name=rani] set

        //getting values
        System.out.println(map.get("msg")); //hai

        HashMap<String,Integer> s = new HashMap<>();
//        LinkedHashMap
      /*  ArrayDeque pq = new ArrayDeque();
        pq.add(45);
        pq.add(25);
        pq.add(69);
        pq.add(5);
        pq.add(45.23);
        pq.add("hello");
        pq.add(256.236);
//        pq.add(null); //java.lang.NullPointerException
        System.out.println(pq); //main" java.lang.ClassCastException
        // [25, 45, 69]  // [5, 25, 69, 45]

        ArrayList al = new ArrayList();
        al.add(25);
        al.add(36);
//        al.add(5.23);
        pq.addAll(al);//.ClassCastException
//        pq.add(pq);
        System.out.println(pq); //[5, 25, 36, 45, 25, 69]
//pq = [5, 25, 36, 45, 25, 69] //   al = [25,36]
//        pq.remove(52);

        pq.retainAll(al);
        System.out.println(pq); //[25, 36, 25]


        /*
        //set :-->
//        HashSet hs = new HashSet();
        //adding the data
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(45);
        hs.add("hello");
        hs.add(45.25);
        hs.add(45);
        hs.add('c');
        hs.add(true);
        hs.add("true");
        hs.add(null);
        System.out.println(hs); //[c, 45.25, true, hello, 45, true]

        HashSet<Integer> ihs = new HashSet<>();
        ihs.add(10);
        ihs.add(20);
        ihs.add(30);
        ihs.add(45);

        //hs.add(1,52);
        hs.addAll(ihs);
        System.out.println(hs); //[c, 20, 45.25, true, 10, hello, 45, 30, true]
                                //[c, 20, 45.25, true, 10, hello, 45, 30, true]

        //removing
        hs.remove(50);
        hs.remove(45);
        System.out.println(hs); //[c, 20, 45.25, true, 10, hello, 30, true]

        //remove mul
        hs.removeAll(ihs);
        System.out.println(hs); //[c, 45.25, true, hello, true]

        Object chs =  hs.clone();
        System.out.println(chs);//[true, c, hello, 45.25, true]

//        Collections.sort(ihs);












*/


    }
}
