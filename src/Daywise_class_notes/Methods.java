package Daywise_class_notes;

public class Methods {
    static int add(int a,int b){
        int sum = a + b;
        return sum;
    }

    static void main(String[] args) {
        int sum = add(45,25);
        System.out.println(sum);
        System.out.println(add(45,26));
//        sub(45-36)
        sub(45,12);
        sub(12,360);
        sub(456,12);
    }

    static void sub(int a,int b){
        int s = a - b;
        System.out.println(s);
    }

}















//we should call the method to excutre
// how we can call using the method name
// name :--> while calling we should pass give imputs
// to  the method

    //method

// 5 days //3 days // oop :-- 4 // exp :-- 1

/*
   add :--> (45,25) (45,96),(4,36)(49,56)

        int a = 45;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);

        a = 45;
        b = 96;
        sum = a + b;
        System.out.println(sum);

        a = 45;
        b = 96;
        sum = a + b;
        System.out.println(sum);

        a = 45;
        b = 96;
        sum = a + b;
        System.out.println(sum);
 100 set of data :--> 400 lines code
 */