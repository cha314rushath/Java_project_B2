package Selenium_Classes;
import java.util.*;

public class User {
    static void main(String[] args) {
     int num = 122655; // num = 122655
     int count = 0; // c = 0
     while(num > 0){  // num > 0 ; 122655 > 0 T  ; num = 12265 > 0 T ; num = 1226 T ; num = 122 T; num = 12 ; num = 1 t; NUM  = 0 > 0 f STOP
        num =  num / 10 ; // num = num / 10; num= 122655 / 10 ; 12265 ; num = 1226 ; num = 122 ; num = 12 ; num = 1 ; num = 0
         count ++; // 0++ ; 1 ; 1++ ; 2 ; 3 ;4 '5 6
     }
     System.out.println(count); // 6
    }
}
/*
  num        count
  num / 10 ; 122655 / 10 ; 12265
 122655 :--> 1
 12265  :--> 2
 1226   :--> 3
 122    :-- 4
 12     :-- 5
 1      :-- 6
 0      :-- stop
for/while
sp and ep:--> 1 to 10 even
for(int i = 1; i <= 10)
while :-->
10 even st from 150
 */