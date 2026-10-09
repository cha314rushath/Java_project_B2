package Daywise_class_notes;

// Collections:-->  collection of data ,var m/m
/*
    List :-->indexing,order
    set  :--> not allow duplicate
    que  :-->null values
    map  :-->key = value
    name = "abc" ,ln = "a" , email = "abc@gamil.com","pwd"
 */
//Array ? [12,25,26,256,25,56,1214,] fixed m/m
// 30 stu
//int s1 = 154;
//int s2 = 4;
//int s3 = 454;


public class Demo {
    static void main(String[] args) {
 //loop :-->we have 3 types for while do while
        //1 to 10 even num
        for(int i = 1 ; i <= 10 ; i++ ) {
            if(i % 2 == 0){
            System.out.println(i);
        }}
        /* i = 1; 1 <= 10 T so it enter the loop  "hello"
        i++ ; i = 2 ;2<= 10 T so enter the loop
        at i = 11 ; 11 <= 10 F stop
         */
        // print 10 even num starting from 1
        int i = 50;
        int count = 2;
        do{
            if(i % 2 == 0){
                System.out.println(i);
                count --;
            }
            i++;
        }
        while(count > 0);



//100 time :--> 100 lines

        // nexted if :--> when condtion is true need to check next condition we go for
        // nexted if
    /*    int pin = 4567;
        if(pin == 1234){ // 4567 ==1234 F
            System.out.println("ph open");

            int wpin = 1234;
                if(wpin == 4567){ // 4567 ==1234 F
                    System.out.println("what app is open");
                }
                else{
                    System.out.println("try again for what app");
                }


        }
        else{
            System.out.println("try again for ph");
        }


*/



        // if //if else // else if :-- if condition is true then it will excute the if block
        // otherwise it will check for next condition (else if)
        // find the smallest num
     /*   int a = 5;
        int b = 25;
        int c = 12;

        if(a < b && a < c){
            System.out.println("a is samll");
        }
        else if(b < c){
            System.out.println("b is smaller ");
        }
        else {
            System.out.println("c is smaller");
        }
*/
// give me num is +ve or -ve
        /*
        int num = 0;//logic :-->prg
        if(num < 0){ // 0 < 0 F
            System.out.println("-ve");
        }
        else if(num > 0){  // 0 > 0 F
            System.out.println("+ve");
        }
        else{
            System.out.println("give num is 0");
        }*/
        //if :-->if condition true then it excthe if block
        // 2 conditoins
        //if true then excute the if block
        // if it false then ecute the else block
/*
        if(num < 0){
            System.out.println("-ve");
        }
        else{
            System.out.println("+ve");
        }
*/

 /*       if(true){
            //if excute
        }
        if(false){
            //not excute if block
        }

        if(num > 0) // logical/rel any num > 0
        {
            System.out.println("+ve");
        }
        if(num < 0) {
            System.out.println("-ve");
        }
    System.out.println("hello");
    System.out.println("Hai");
    System.out.println("I am from Java");
   */

    }

}
