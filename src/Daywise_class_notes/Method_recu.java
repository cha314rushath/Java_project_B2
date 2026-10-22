package Daywise_class_notes;

public class Method_recu {
    static void num(int sp, int ep) {
        if (sp > ep) {
            System.out.println("done");
        } else {
            System.out.println(sp);
            sp++;
            num(sp, ep);
        }
    }
    static void disp(String msg,int count){
       if(count > 0){
           System.out.println(msg);
           count --;
           disp(msg,count);
       }
    }
    static void msg(){
        System.out.println("hello");
    }
    static void add(int ... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        System.out.println(sum);
    }

    static void c(int x){
        x = 100;
    }
    static void main(String[] args) {
       int a = 10;
        c(a);
        System.out.println(a);

//      System.out.println("hello");
//      String [] s = {"hello","haio","how"};
//      main(s);
       /* while (true){
            System.out.println("hello"); // 25 th i will take prog (String method and Collection)
        }*/

//StackOverflowError
    }
    }
    /*


//        num(1,10);
        int[][] stu = {
                {10, 20, 30, 40,20},//5
                {40, 90, 89, 98,12},//5
                {50, 76, 77, 88,58},//5
        };
        for (int i = 0; i < stu.length; i++) {
            // System.out.println(stu[i]);
            for (int j = 0; j < stu[i].length; j++) {
                System.out.println(stu[i][j]);
            }
            System.out.println();

 */