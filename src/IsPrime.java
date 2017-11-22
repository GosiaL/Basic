
public class IsPrime {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();

        long start = System.nanoTime();
        isPrime.isPrime(2135412423);
        long stop = System.nanoTime();
        System.out.println(stop-start);

        start = System.nanoTime();
        isPrime.isPrimeOptimal(2135412423);
        stop = System.nanoTime();
        System.out.println(stop-start);
    }

    boolean isPrime(int number){
        int counter = 0;
        if(number == 1){
            System.out.println(number + " nie jest liczbą pierwszą.");
            return false;
        }
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                counter++;
            }
        }
        if(counter > 1){
            System.out.println(number + " nie jest liczbą pierwszą.");
            return false;
        }
        System.out.println(number + " jest liczbą pierwszą.");
        return true;
    }

    boolean isPrimeOptimal(int number){
        if(number == 1){
            System.out.println(number + " nie jest liczbą pierwszą.");
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        System.out.println(number + " jest liczbą pierwszą.");
        return true;
    }
}
