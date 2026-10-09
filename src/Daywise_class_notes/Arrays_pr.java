package Daywise_class_notes;

public class Arrays_pr {
    static void main(String[] args) {
        int [] a = {10,20,30,45,6,8,9}; // index of num
        // 30 index
        int index = -1;
        int num = 45;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == num){
                index = i;
                break;
            }
        }
        System.out.println(index);

        /*
        int [] a = {10,20,10,1,2,1,3,4,10};
        //count :-->acc
         int count = 0;
         int num = 10;
         for (int i : a){
             if(i == num){ // 10 == 10
                 count++; //  3
             }
         }
        System.out.println(count); // 3



        /*
        int [] a = {10,20,30,1,2,3,4,5};
        // 10 :-- > yes
        // 50 :-- > no
        int num = 10;
        boolean is_ele_present = false;
        for( int i : a ){
            if(i == num){
                is_ele_present = true;
                break;
            }
        }
        System.out.println(is_ele_present ? "ele is present": "ele is not present");

 /*       int [] a = {10,20,30,1,2,3}; // count_eve = 4 ; odd = 2
        int count_even = 0;
        int count_odd = 0;

        //for
        for(int i = 0 ; i < a.length ; i++){
            if (a[i] % 2 == 0){
                count_even ++;
            }
            else {
                count_odd ++;
            }
        }

         for (int i : a){ //
             if(i % 2 == 0){
                 count_even++;
             }
             else{
                 count_odd++;
             }
         }
        System.out.println("even nums = " + count_even);
        System.out.println("odd num = " + count_odd);
        */
    }
}
