package Daywise_class_notes;

//public class poly_ {
//    void add(int a,int b){System.out.println(a+b);}
//    void add(double a,double b){System.out.println(a+b);}
//    void add(int a,int b,int c){System.out.println(a+b+c);}
//    void add(long a,long b){System.out.println(a+b);}
//
//    static void main(String[] args) {
//        poly_ p = new poly_();
//     /*  p.add(12,25);
//        p.add(4525.56,256.25);
//        p.add(1,25,36);
//      */
//        p.add(112345146,12); //it 2 arg then it 2 var add , 2 var dec then it 2 var dec add,3 var act as 3 var add
//        p.add(13464,12L);
//        /*
//        System.out.println("25" + "24"); // 2524
//         System.out.println(25 + 24);//49
//         */
////        p.main(12,25);
////        main(12,25);
//    }
//
//     static void main(int a,int b){System.out.println(a + b);}
//}
// compl :--> static:-->method overloading
/*
   mul method dec with same name's but diff num of arg that we can call it as comp poly
   void add(int a,int b){s.o.p(a+b);}
   void add(long a,long b){s.o.p(a+b);}
   void add(int a,intb,int c){s.o.p(a+b+c);}
 */
class V3{
    int a = 99;
}
class V1 extends V3{
    int a = 89;
    void msg(){
        System.out.println(super.a);//99
        System.out.println("send text msg");
    }
}
class V2 extends V1{
    int a = 59;
    void msg(){
        System.out.println("send the doct and text msg");
        System.out.println(a); // 59
        System.out.println(super.a);//89
        // a :--> p (super.a) :-->diff p and c var
    }
}

public class User_{

    static void main(String[] args) {
        V1 v1 = new V1();
        v1.msg(); //text
        V2 v2 = new V2();
        v2.msg(); //doc+text

    }
}





























