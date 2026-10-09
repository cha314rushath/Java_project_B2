package Daywise_class_notes;
public class PrimeNumber {
    static void main(String[] args) {
        int num = 15;
        boolean is_prime = true;
        if (num <= 1) {
            is_prime = false;
        }
        for(int i = 2 ; i < num / 2 ; i++ ){
            if(num % i == 0){
                is_prime = false;
                break;
            }
        }
        if(is_prime){
            System.out.println("given num is prime");
        }
        else{
            System.out.println("give num is not prime ");
        }
    }
}// String prog and Array