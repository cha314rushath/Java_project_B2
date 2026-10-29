package Daywise_class_notes;
/*
p:-> void add(int ...a) ;
c:-> void add(int ...a){
     int sum = 0;
     for( int i : a){
       sum += i;
     }
     s.o.p(sum);
}
 */
abstract class Cal1{
  abstract  void add(int ...a);
  abstract   void sub(int ...a);
  abstract   void mul(int ...a);
  abstract   void div(int ...a);
  abstract   void mod(int ...a);
  abstract void power_num(int num,int p); //abstract class it allow the normal methods so we can't achive 100% abstract using abstract class
  abstract void exp(int num);
}
//100% interface ;--> all methods abstract
abstract class std_cal extends Cal1{
    void add(int ...a){ // [1,2,3,4]
        int sum = 0;// 0
        for(int i : a){ // i = 1 ;  i = 2 i = 3 i = 4
            sum += i; //sum = sum + i ; 0 + 1 = 1 ; sum = 1 ;sum+i = 1 + 2 = 3 ; sum = 3; sum = sum + i ; 3 + 3 = 6  ; sum + i; 6 + 4 = 10
        }
        System.out.println(sum); // 10
    }
    void sub(int ...a){ //[4,2,3]
        int s = a[0]; // s = 4
        for(int i = 1 ; i < a.length ; i++){ // i = 1 ; i = 2
            s -= a[i]; // s = s - a[i] ; s = 4 - 2 ; s = 2 ;  s = 2 - 3 ;  -1
        }
        System.out.println(s); //s = -1
    }
    void mul(int ...a){
        int m = 1;
        for(int i : a){
            m *= i;
        }
        System.out.println(m);
    }
    void div(int ...a){
        int s = a[0];
        for(int i = 1 ; i < a.length ; i++){
            s /= a[i];
        }
        System.out.println(s);
    }
    void mod(int ...a){
        int s = a[0];
        for(int i = 1 ; i < a.length ; i++){
            s %= a[i];
        }
        System.out.println(s);
    }
}
class snt_cal extends std_cal{
    void power_num(int num,int p){}; //abstract class it allow the normal methods so we can't achive 100% abstract using abstract class
    void exp(int num){};
}
public class Abstractions_ {

    static void main(String[] args) {
//        std_cal o = new std_cal();
        //std_cal is abstract; cannot be instantiated
        //object for normal class :-->why becouse we have all imp methods
        snt_cal o = new snt_cal();
        o.add(45,25,36,56); //162
        o.sub(45,2,3,4); // 36
        o.mul(12,2,36); //864
        o.div(42,2,36); // 0
    }
}
//method_name(){}
//
//D1 :-- add,mul
//D2 : -- sub,div
//D3 :--> mod
// 1000+ :-->
/*
abstract methods :--> it only defination
abstract void method_name(arg);
class:--> normal con:-->class :-->it allows only normal methods
abstract class :--> it allows the normal methods and also it allow the abstract methods
//how i can make class as abstract
abstract class_name{
}
 */
/* add,sub,mul,div,mod
exp,log,.....
P:--add,sub,mul,div,mod,exp,log...
stdC :-->add,sub,mul,div,mod :-->
 */

