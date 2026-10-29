package Daywise_class_notes;
class WV1{
    WV1(int a,int b){
        this(12,25,12);
        System.out.println(a + b );
    }
    WV1(int a,int b,int c){
        this();
        System.out.println("a is " + a + "b is "+ b + "c is " + c);
    }
    WV1(){
        System.out.println("msg");
    }
}
//public class Const_overloading_overriding {
//    static void main(String[] args) {
//        WV1 v1 = new WV1(12,25);
////        WV1 v2 = new WV1(1245,25,26);
////        System.out.println(v1.ph);
//    }
//}
//this():-->rec calling not allow
// first st :-->this()

class Const1{
    Const1(){
        System.out.println("const 1");
    }
}
class Const2 extends Const1{
    int a,b; //
    Const2(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("const 2");
    }
}
class Const3 extends  Const2{
    Const3(int a,int b){
        super(12,2516);
        System.out.println(super.a + super.b);//a = 12,b = 2516
    }
}
public class Const_overloading_overriding {
    static void main(String[] args) {
        Const3 c = new Const3(12,25);

    }
}





















