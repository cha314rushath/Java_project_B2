package Daywise_class_notes;

public class Fibonacciseries {
    static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 10;
        while(count > 0){
            System.out.println(a);
            int temp = a + b ;
            a = b;
            b = temp;
            count --;
        }
        /*
        for (int i = 0 ; i < 10 ; i++){
            if(a > 10){
                break;
            }
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }*/
    }
}
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
// 0 to 10 fib
// 10 fib num
// 0 to 10  for / while
/*
• (0 + 1 = 1) ; 0  +  1 = 1
• (1 + 1 = 2)
• (1 + 2 = 3)
• (2 + 3 = 5)
• (3 + 5 = 8)
0
1
2
3
4
5
6
 */

