package Daywise_class_notes;

public class Method_recu {

    static void num(int sp , int ep){
        if(sp > ep) {
           System.out.println("done");
        }
        else {
            System.out.println(sp);
            sp++;
            num(sp, ep);
        }
    }

    static void main(String[] args) {
        num(1,10);
    }
}
