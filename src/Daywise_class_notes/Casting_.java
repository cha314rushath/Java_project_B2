package Daywise_class_notes;

/*
 // type converting
        int a = 4563; // 32 bit
        double c = a; // 64 bit
        System.out.println(c); // 4563.0
        // 32 bit to 64bit

        double d = 45.569; //64 bit
        int f = (int) d; // 45 :--> 45.569
        System.out.println(f); // 32bit

 */

class M10 {
    void read_pdf(){
        System.out.println("u can read pdf");
    }
}
class M11 extends M10 {

    void read_word_file(){
        System.out.println("u can read word file");
    }
}
class M12 extends M10{
    void read_java_c_(){
        System.out.println("u can read .java and .c file");
    }
}
public class Casting_ {

    static void main(String[] args) {
        M10 m10 = new M11(); //created object

        M11 nm10 = (M11) m10; // java.lang.ClassCastException
        nm10.read_pdf();
    /*    M10 m10 = new M11();
        m10.read_pdf();
//        m10.read_word_file();
//        m10.read_pdf();// M11 :--> read word file

        M11 nm10 = (M11) m10;
        nm10.read_word_file();
        nm10.read_pdf();

        M11 m11 = new M11();
        m11.read_pdf();
        m11.read_word_file();
*/


    }
}



// driver = new ChromeDriver();
















