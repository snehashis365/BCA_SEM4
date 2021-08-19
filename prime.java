public class prime {
    //check if a number is prime
    public static boolean isPrime(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
    //main method
    public static void main(String[] args) {
        int i = 0, count = 0;
        while(count < 10){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
