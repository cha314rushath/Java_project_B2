package Daywise_class_notes;

public class Palendrom {

    static void main(String[] args) {
        //for while

        int num = 343;
        //343
        int temp1 = num;
        int temp = 0;
        while(num > 0){
            int l = num % 10;
            num = num / 10;
            temp = l + 10 * temp ;

        }
        if(temp == temp1)
            System.out.println("num is pal");

        else
            System.out.println("num is not pal");
    }
}
