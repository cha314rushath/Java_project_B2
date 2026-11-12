package Daywise_class_notes;
import java.util.Scanner;
class What_appv1{
    void msg(){
        System.out.println("u can send text msg");
    }
}
class What_appv2 extends What_appv1{
    void msg(){
        System.out.println("text msg also img");
    }
}
class What_appv3 extends What_appv2{
    void msg(){
        System.out.println("text msg also img also voice msg");
    }
}

public class Exp_hand {
    static void main(String[] args) {
       What_appv1 v1 = new What_appv1();
       v1.msg();

       What_appv2 v2 = new What_appv2();
       v2.msg();
    }

//    static void cal(){
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("pls enter a int");
//            int a = sc.nextInt();
//            System.out.println("pls enter the b int");
//            int b = sc.nextInt();
//            System.out.println("a + b = " + (a + b)); // "a + b" + ; a + b = 15 + 5; a + b = 155
//            System.out.println("a - b = " + (a - b));
//            System.out.println("a / b = " + (a / b)); // ArithmeticException:
//            System.out.println("a % b = " + (a % b));
//            System.out.println("a * b = " + (a * b));
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            cal();
//        }
//        finally {
//            System.out.println("done");
//        }
//    }
//    static void main(String[] args) throws Age_Exception,Exception {
//        int age = 2;
//        if(age > 18){
//            System.out.println("u can vote");
//        }
//        else{
//            throw new Age_Exception();
////            throw new InputMismatchException();
//        }
//    }
}
class Age_Exception extends  Exception{
        Age_Exception(){
            System.out.println("age missmatching");
        }
}