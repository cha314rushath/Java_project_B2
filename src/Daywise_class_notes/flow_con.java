package Daywise_class_notes;
import java.util.Scanner;
public class flow_con {
    static void main(String[] args) {
        // fact of the  num 5 4 3 7
            int fact = 1 ;
           int temp = 1;
            int num = 7;
            for(int i = num ; i >= 2 ; i--){// 7 * 6 * 5 * 4 * 3 * 2
                temp = temp * i;
            }
            System.out.println(temp);

            //power num :-->

        // i want to print 1 to 10 num's
        // i want to print 100 times hello  msg
//        for(int i = 1; i <= 10 ; i++){
//            System.out.println("hello");
//        }
//        // i want to print 1 to 10 num
//        for(int i = 1; i <= 10 ; i++){
//            System.out.println(i);
//        }
        // i want even num 1 to 10  ; 2 4 6 8 10
        // i want odd num 1 to 10 ; 1 3 5 7 9
//        for(int i = 1 ; i <= 10 ; i++){
//            // 1  to 10  : 2 4 6 8 10
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        // odd num
//        for(int i = 1 ; i <= 10 ; i++){
//            // 1  to 10  : 2 4 6 8 10
//            if(i % 2 == 1){
//                System.out.println(i);
//            }
//        }
//
//        for(int i = 2 ; i <= 10 ; i += 2){  // 1 to 10
//            System.out.println(i);
//        }
//
//        for(int i = 1 ; i <= 10 ; i += 2){
//            System.out.println(i);
//        }


        // print 1 to 10 2table=
//        for(int i = 0 ; i <= 10 ; i += 2 ){
//            System.out.println();
//        }
//        for(int i = 1 ; i <= 10 ; i ++){
//            System.out.println( "2 * " + i +" = "+ i * 2); // 1 * 2  = 2
//            // 2 * 2  = 4
//            // 3 * 2 = 6
//            // 4 * 2 = 8
//            // 5 * 2  =10
//            // 6 * 2 = 12
//            // 7 * 2  = 14
//            // 8 * 2 = 16
//            // 9 * 2 =18
//            // 10 * 2 = 20
//        }

//        for(int i = 0 ; i < 10 ; i++){
//            System.out.println("hello");
//        }
//        for(int i = 0 ; i <= 9 ; i++){
//            System.out.println("hello");
//        }
//        for(int i = 10 ; i > 0 ; i--){
//            System.out.println("hello");
//        }
        /*
        how to exc
        s1  ; i = 1 ; 1 <= 10 T then it enter the loop       hello
        s2 ; i++ ; i = 2 ; 2<= 10 T then it enter the loop   hello
        s3 ;i ++ ; i = 3; 3 <= 10 T then it enter the loop   hello
        s4 ; i++ ; i = 4; 4 <= 10 T enter the loop           hello
        s5
        s6
        s7
        s8
        s9
        s10 i ++ ; 10 <= 10 ;t Enter hte loop                 hello
        s11 i++   11 <= 10 F   out of the loop ;
         */

















//        // given num is +ve or -ve or 0
//        Scanner sc = new Scanner(System.in);//when down djk
//        System.out.println("pls enter the num = ");
//        int num = sc.nextInt();
//
//        if(num > 0){
//            System.out.println("+ve num");
//        }
//        else if(num == 0){
//            System.out.println("num is 0");
//        }
//        else{
//            System.out.println("num is -ve ");
//        }

//        Scanner sc = new Scanner(System.in);//when down djk
//        System.out.println("pls enter the pn pin = ");
//        // once ph unlock then u can unlock to wt app
//         int pnpin = sc.nextInt();
//         if(pnpin == 1234){
//             System.out.println("login to ph");
//
//             System.out.println("pls enter the whatapp pin = ");
//             int whatapp = sc.nextInt();
//             if(whatapp == 4567){
//                 System.out.println("login to whatapp");
//             }
//             else{
//                 System.out.println("invalid pin whatapp");
//             }
//         }
//         else{
//             System.out.println("invalid pin");
//         }








//        int num = sc.nextInt();
//
//     // give num is +ve or -ve
//        if(num < 0){
//            System.out.println("-ve num");
//        }
//        else{
//            System.out.println("+ve num");
//        }
//    // take the input from the user un and pwd if user enter the valid data then login
//        // un = 2abc@gmail.com  pwd = abc@123
//        System.out.println("pls enter the un");
//        String un = sc.next();
//
//        System.out.println("pls enter the pwd");
//        String pwd = sc.next();
//
//        System.out.println("pls enter the otp");
//        int otp = sc.nextInt();
//
//        if(un.equals("abc@gmail.com") && pwd.equals("abc@123")){
//            System.out.println("login");
//        }
//        else if(otp == 4567){
//            System.out.println("u can login");
//        }
//        else{
//            System.out.println("error");
//        }



        //imput at run-time  :-->i am using the Scaner class
        // why :--> int :--nextInt() / long:--nextLong()/string :-- next()
        // all method non-staitc
      /*  Scanner sc = new Scanner(System.in);//when down djk
        int num = sc.nextInt();
        System.out.println(num); //?
        String name = sc.next();
        System.out.println("u enter the name = " + name);
*/





//        int num = -89; // i want check give num is +ve or -ve
//        if(num > 0){ // 45 > 0 ;true
//            System.out.println("give num is +ve");
//        }
//      //  num = -89;
//       if(num < 0) { // -89 < 0 T
//           System.out.println("give num is -ve");
//       }
//       if(num == 0){
//           System.out.println("give num is 0");
//       }
//
    }
}
/*
 if condition is true then it i will exc if block otherwise it not exc if block
    Syntax:--
    if(condition){
       //set of line s of coode
    }
 /ex - flow
 if(true){
    // it exg the if block
 }

 if(fasle){
    //it not ex if block
 }
 */

/*
    if else :-->
    if condtion is true then it exg the if block otherwise it will excute the else block
    if(condition){
       //lines
    }
    else{
      //lines
    }
 */
/*
    else if :-->  if condition is False then i want check new Condition then i will use else if

    if(conition){
     // if block
    }
    else if(condition){
     // else if clock
    }
    else if(condition){
    // else if block
    }
    else {
      //else
    }



 */
/*
nested if :-- one if inside anther if
whne :-- when i condition is true then need to check next conition then i will use nested id

if(conition){

  // if block
  if(conition){
     //if block
        if(conditon){
         // if blcok
        }
        else{ //else block}
       else{//else block}
       else{//else block}
  }
}






 */