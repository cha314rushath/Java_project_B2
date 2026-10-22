package Daywise_class_notes;
/*
  Why:-->
 */
public class Opps_User {
    static void main(String[] args) {
        Cal Obj = new Cal();
//        Obj.div();// Error /Exception
        Obj.add();
        Cal obj1 = new Cal();
        obj1.mul();
        obj1.add();
        obj1.sub();
//        Cal obj2 = new Cal();
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(Obj.hashCode()); //add of the object
//        System.out.println(Cal.c);
////        System.out.println(Obj.c); // error TS
    }
}
class Cal{
    int a = 50;
    int b = 30;
    static int c = 85;
    void add(){
        System.out.println(a + b);
    }
    void sub(){
        System.out.println(a - b);
    }
    void mul(){
        System.out.println(a * b);
    }
}