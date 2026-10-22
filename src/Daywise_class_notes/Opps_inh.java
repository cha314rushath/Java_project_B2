package Daywise_class_notes;
interface P1{
    int a = 45;
}
interface P2{
    int a = 56;
    int b = 25;
}
class C implements P1,P2{
    void add(){
        System.out.println(P1.a + b); //Why
    }
}
public class Opps_inh {
    static void main(String[] args) {
        C c = new C();
        c.add(); // 45 + 25 = 70
//        System.out.println(c.a);
        // a is ambiguous
        wv1 v1 = new wv1();
        v1.msg(); // only msg

        Wv2 v2 = new Wv2();
        v2.call();
        v2.msg();

        Wv3 v3 = new Wv3();
        v3.msg();
        v3.send_doct();
        v3.v_c();


        B Bclass = new B();
        System.out.println(Bclass.b); //OBject
        System.out.println(Bclass.a);

        Addition a = new Addition(); //Obj for add it has pro ClassA and ClassB
        a.add();
        System.out.println(a.a); //a :-->Object_name ,a :-- var
        System.out.println(a.b);

        A a1 = new A();
        System.out.println(a1.a);
//        System.out.println(a1.b); //not
    }
}

class A{
    int a = 89;
}
class B extends A{
    int b = 96;
}
class Addition extends B{
    void add(){
        System.out.println(a + b);
    }
}


class wv1 {
    void msg(){
        System.out.println("msg");
    }
}
class Wv2 extends wv1 {
    void send_doct(){
        System.out.println("u can send doc");
    }
    void call(){
        System.out.println("u can call");
    }
}
class Wv3 extends Wv2{
    void v_c(){
        System.out.println("u can video call");
    }
}
/*
class P1{}
class P2{}
class C extends P1 extends P2{
}
*/




/*
using interface becouse  class can be inher 2 interface
 */



















