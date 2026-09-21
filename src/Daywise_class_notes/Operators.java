package Daywise_class_notes;

public class Operators {
    static void main(String[] args) {
        //  +,-,*,/,%
        int a = 35;
        int b = 2;
        System.out.println(a + b); // 35 + 2 = 37
        System.out.println(a - b);// 35 - 2 = 33
        System.out.println(a * b);// 35 * 2 = 70
        System.out.println(a / b);// 35 / 2 = 17 qu
        System.out.println(a % b); // 35 % 2 = 1 rem
       System.out.println(35.0/2); // 17.5
        int y = 12-56/25%5*2+5; // Var   ?
        // 12-2%5*2+5
        // 12-2*2+5
        // 12-4+5
        // 13
        System.out.println(y);//
        // inc ++ , dec --
        /*
            ++ two types
            1.pre
               ex :-- > ++a
            2.post
               ex :--> a++
         */
       a = 20;
       b = 10;

      System.out.println(++a);//21
      System.out.println(b++);// 10
       System.out.println(a);// 20+1 =21
       System.out.println(b); // 10+1 = 11

//        System.out.println(5++);
        // a = 21 + 1 = 22
        // b = 11 + 1 = 12
        y = a ++ + ++b;
        //y = 21 + 12 = 33
        System.out.println(y); // 33
        // a = 22; 22+1=23
        // b = 12;12+1=13
        y = ++a + ++ b;
        //y = 23+13
        System.out.println(y);// 36

        a = 6; // a + 1 = 7
        b = 7;
        y = a ++ + a++;
        //y =  6 +  7
        System.out.println(y);

        a = 5; // 5 + 1 = 6
        b = 9; // 9 + 1 = 10
        y = ++a + ++b;
        //y = 6 + 10
        System.out.println(y); // 16


        a = 5; // 5 + 1 = 6
        b = 9; // 9 +1 = 10
        y = a++ + b++ + a;
        //y = 5 + 9 + 6
        System.out.println(y);


        a = 9;//9+1 = 10 + 1= 11 + 1= 12 + 1 = 13
        y = a ++ + ++ a + ++ a+ ++a + a++;
        // y = 9 +  11 + 12 + 13 + 13
        System.out.println(y); // 54
        System.out.println(a); // 14

        a = 50;// 50 -1 = 49 - 1 = 48 + 1 = 49 -1= 48
        y = a -- + --a + ++a + --a;
        // 50 + 48 +  49 + 48
        System.out.println(y); // 195

        a = 5;
        b = 23;
        System.out.println(a < b); // 5 < 23 //yes true
        System.out.println(a > b); // 5 > 23 //no False
        System.out.println(a <= b); // 5 <= 23 ; yes true
        System.out.println(a >= b); // 5 >= 23 ; false
        System.out.println(a == b); // 5 == 23 ; no false
        System.out.println(a != b); // 5 != 23 ;yes true

        // y = a + b
        // Var :keywords
        a = 50;













































    }
}
