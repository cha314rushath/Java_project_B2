package Daywise_class_notes;
interface A1 {
    int a = 89; //init Why:-->final var
    void add(int a,int b);
    void sub(int a,int b);
}
interface B1 extends A1 {
    void mul(int a,int b);
}
abstract class C1 implements B1{
  public  void add(int a,int b){
        System.out.println(a + b);
    }
  public  void sub(int a,int b){
        System.out.println(a - b);
    }
//   public void mul(int a,int b){
//        System.out.println(a * b);
//    }
}
class C2 extends C1{
       public void mul(int a,int b){
        System.out.println(a * b);
    }
}
public class interface_class {

    static void main(String[] args) {
        C1 c = new C2();
        c.add(45,12);
        c.mul(12,25);
    }
}




