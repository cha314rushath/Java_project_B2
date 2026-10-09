package Daywise_class_notes;

public class Methods_prog {
    /* WAM to print hello i am java msg
    */

    /*wap to retrun the fact of the num
    *
    * */
    static int fact_num(int num){
        int fact = 1;
        for(int i = num ; i > 1 ; i--){
            fact *= i; //fact = fact * i
        }
        return fact;
    }
//    power of the num
//
//    num = 5 ; p = 4

    static int power_of_num(int num, int power){
        int p = 1;
        for(int i = power ; i >= 1 ; i --){
            p *= num ; // p = p * num ; 1 * 5
        }
        System.out.println(power +" power  of the"+ num + " = " + p);
        return p;
    }

    static int demo_power_of_num(int num, int power){
        int p = 1;
        for(int i = power ; i >= 1 ; i --){
           return p *= num ; // p = p * num ; 1 * 5
        }
        System.out.println(power +" power  of the"+ num + " = " + p);
        return p;
    }
    static void main(String[] args) {
        int power_num_is = demo_power_of_num(45,2);
        System.out.println(power_num_is);

//        System.out.println(p);

    }
    void msg1(){
        System.out.println("hello i am java");
    }
    static void msg(){
        System.out.println("hello i am java");

    }


}

