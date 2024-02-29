
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(isPrime(121));
        System.out.println(isPrime(8));
        System.out.println(isPrime(5));
    }
  
    public static boolean isPrime(int x){
        if ((x==0) || (x==1)){
            return false;
        }
        for(int i =2; i<x; i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
