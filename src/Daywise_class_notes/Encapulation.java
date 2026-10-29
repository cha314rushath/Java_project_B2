package Daywise_class_notes;
/*
   1.hidding the data :-- with help of private
   2.giving limited acces to user  with getter and setter methods
   1.binding the data and method single unit
  class ( data(var)  method)
 */
class Bank{
    private   long bal = 14677; // get
    private int upipin = 1245; // set

     void get_bal(){
            System.out.println(bal);
        }
    void set_upi(int upipin){
        this.upipin = upipin;
    }
//    void txamount(int a,int pin){
//        if(upipin == pin && a < bal){
////            s.o.p("tx")
//        }
//    }
}
public class Encapulation {
    static void main(String[] args) {
        Bank b = new Bank();
        b.get_bal();
        b.set_upi(4578);
    }}
//string's methods