package Daywise_class_notes;

public class WeekEnd {

    static void main(String[] args) {
    String s = "mom";
    String rs="";
        for(int i=s.length()-1;i>=0;i--){
            rs=rs+s.charAt(i);
        }
        System.out.println(rs);
        if(rs.equals(s)){
            System.out.println("True");
        }
        else{
            System.out.println("not pal");
        }
    }


}


//Hello i am java
/*
    String s = "hello i am java i am python";
        String rs = "";
        for(int i = s.length() -1 ; i >= 0 ; i--){
            rs += s.charAt(i);//rs = rs + s.charAt(i);
        }
        System.out.println(rs);
*/