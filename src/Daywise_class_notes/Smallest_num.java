package Daywise_class_notes;

public class Smallest_num {
    static void main(String[] args) {

        int a = 89;
        int b = 85;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        a = 10;
        b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
//        a:b = b:a; //
//        a,b = b,a;
//a  = 10  , b = 20 , c = 30   , d = 40
        // l = [10,20,30,40,50,60,70]
        // l = [70,60,50,40,30,20,10]
        //l = [70,20,30,40,50,60,10]

        /*
        int a = 9;
        int b = 3;
        int c = 45;


        if(a < b && a < c){
            System.out.println("a is smaller");
        }
        else if(b < c){
            System.out.println("b is smaller");
        }
        else{
            System.out.println("c is smaller");

        }

 */
    }
}
