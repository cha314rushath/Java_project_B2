package Daywise_class_notes;

public class String_methods {
    static void main(String[] args) {
        String s = "hello I AM java"; //
        String s2 = "\t Hello i am python";
// S / p/ start with aA
        // get the char
       // i am giving the index i want the char
       System.out.println(s.charAt(4));//o
       System.out.println(s.charAt(12));//a
        // System.out.println(s.charAt(15)); //.StringIndexOutOfBoundsException

        // char give me index num
        System.out.println(s.indexOf("a")); // 8
        System.out.println(s.lastIndexOf("a"));//14
        System.out.println(s.indexOf("z"));//-1

        //
       System.out.println(s.toLowerCase()); //hello i am java
        System.out.println(s.toUpperCase());// HELLO I AM JAVA
        System.out.println(s.concat(s2)); //hello I AM javaHello i am python
        // char is present or not(o)
        System.out.println(s.contains("o"));
        System.out.println(s.contains("Z"));


        String dob = "20-10-2022";
        //[20,10,2022]
        String[]  sa =  dob.split("-"); //[]
        System.out.println("date = " + sa[0] +" month = " + sa[1] + "year = " + sa[2]);

        s = "hello i am java";
      String []  s1 = s.split("a") ;

        s = "https://demowebshop.tricentis.com/";
        String[] e = s.split(":");//["https","//demowebshop.tricentis.com/"]
        System.out.println(e[0]); //https
        System.out.println(e[1]);// //demowebshop.tricentis.com/

        s = "                   hello               ";
        System.out.println(s.strip());
        System.out.println( s.trim());
        s = "hello i am java";
        System.out.println(s.replace("java","python")); //hello i am python
        System.out.println(s.length());//15
          String[] words =   s.split(" ");
          System.out.println(words.length);//4
            System.out.println(s.substring(5,9));

    }
//    void add(){}
}
