package Daywise_class_notes;
public class Whats_app_user {
    static void main(String[] args) {
        int a = 45;
        int b = 96;
        String op = "sub";
        switch (op) {
            case "add":
                System.out.println(a + b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println("wrong op");
        }
        Whats_app u1 = new Whats_app(12345645215L);
        Whats_app u2 = new Whats_app(123489746L);
        Whats_app u3 = new Whats_app(1324897451L);
//        u1.set_ph(1247516516L);
//        u2.set_ph(1234874985L);
//        u3.set_ph(12349845611L);
        System.out.println(u1.ph);
        System.out.println(u2.ph);
        System.out.println(u3.ph);
    }
}
class Whats_app {
/* Type :-->
    0 arg()
    parameter(int a,int b)
*/
    long ph ;
    Whats_app(long nph){
        ph = nph;
    }
// if forgot to call method global var it not at all initialize
// mul object create with same data
// with help of constructor
    void msg(){
        System.out.println("u can msg with " + ph);
    }
    void call(){
        System.out.println("u can call with " + ph);
    }
    void pay(){
        System.out.println("u can pay with " + ph);
    }
}
/*class and Object const */

