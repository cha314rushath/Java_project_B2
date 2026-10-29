package Daywise_class_notes;

//public class P{
//    public String name = "Mahi";
//}

public class Inside_p {
    public static String name = "Mahi";
    protected  static long ph =  123498794615L;
    static long   Adhar_num = 3165796164613461L;
    static private int upi = 1245;

    static void main(String[] args) {
       System.out.println(name);
        System.out.println(ph);
        System.out.println(Adhar_num);
        System.out.println(upi);
    }
}

class P  extends Inside_p{
    void demo(){
        System.out.println(Inside_p.name);
        System.out.println(Inside_p.ph);
        System.out.println(Inside_p.Adhar_num);
//        System.out.println(Inside_p.upi);
    }

}



