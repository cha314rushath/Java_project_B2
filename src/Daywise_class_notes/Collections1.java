package Daywise_class_notes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class Collections1 {

    static void main(String[] args) {
        //list:--> ArrayList,LinkedList
        int [] a = {10,20,30};

        LinkedList al = new LinkedList();//
        //insert data
        // object_name.add(ele);
        al.add(45);
        al.add("hello");
        al.add('c');
        al.add(45.256);
        al.add("string");
        al.add(a);// a it is array[10,20,30]
        System.out.println(al); //[45, hello, c, 45.256, string, [I@27716f4]

        // add in b/w [45,"new",c,45.256,string,[...]
        // object.add(index_num,ele)
        al.add(1,"new");
        System.out.println(al); //[45, new, hello, c, 45.256, string, [I@27716f4]

        //remove the ele
        al.remove("hello");
        al.remove(a);
        System.out.println(al); //[45, new, c, 45.256, string]

//        al.remove(45); //.IndexOutOfBoundsException (if ur passing int it is consider as a index)
        al.remove(0);
        al.remove(2);
        System.out.println(al); //[new, c, string]

        // i want store only ph_num(long)
        ArrayList<Long> la = new ArrayList<Long>();
        la.add(42544548445137L);
        la.add(2123498451254512L);
        System.out.println(la); //[42544548445137, 2123498451254512]

        // add mul ele
//        Object.addAll(collection)
//          al.addAll(la); //[new, c, string, 42544548445137, 2123498451254512]
//          System.out.println(al);

        al.addAll(2,la); //[new, c, 42544548445137, 2123498451254512, string]
        System.out.println(al); //
//        al.addAll(a);

        // al = [new, c, 42544548445137, 2123498451254512, string,[42544548445137, 2123498451254512]]

        al.add(la); //
        System.out.println(al); // [new, c, 42544548445137, 2123498451254512, string, [42544548445137, 2123498451254512]]


        /*
        add(ele) :--add ele  at the last
        add(index_num,ele) : it add ele index
        addAll(collection) :-->it add mul ele  last
        addAll(index,coll) : it add mul ele index
        remove(index) :-- remove the ele
        remove(ele) :-- remove the ele
        removeAll(col) :--> remove the mul ele
         */
        al.removeAll(la);
        System.out.println(al); //[new, c, string, [42544548445137, 2123498451254512]]

        // to check ele present or not
        System.out.println(al.contains(45)); //false
        al.addFirst(58);
        al.addLast(96);

        System.out.println(al); // [58, new, c, string, [42544548445137, 2123498451254512], 96]

        ArrayList<Integer> ia = new ArrayList<>();
        ia.add(45);
        ia.add(96);
        ia.add(23);
        ia.add(25);
        ia.add(36);
        System.out.println(ia); //[45, 96, 23, 25, 36]

        // i want to sort the array:-->
//        al = [58, new, c, string, [42544548445137, 2123498451254512], 96]
//        Collections.sort(al); // ClassCastException

        Collections.sort(ia);
        System.out.println(ia); //[23, 25, 36, 45, 96]



    }
}
// collections :-->
// data:-->
/*
   int :-->num
   double :--> num +dec
   char :--> any char
   string :-->collections of char
   array :--> collection ele

        int [] a = {10,20,30,40,50};
        // 10 , 2 ,20 ,30 ,40 ,50
        a[1] = 2;
//        System.out.println(a[2]);
        a[9] = 45;// m/m is fixed
        //remove data
//        a[1] = "hello"; it not allow the string
 */

