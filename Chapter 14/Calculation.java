class Calculation implements Runnable {
    int[] numbers;
    int start;
    int end;
    int sum;

    Calculation(int[] numbers, int start, int end){
        this.numbers=numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i=start; i<end;i++){
            sum+= numbers[i];
        }
    }


}
public class Main{
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i;
        }

        int numberOfThreads = 3;
        Calculation[] workers = new Calculation[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];

        int chunkSize = numbers.length / numberOfThreads;

        for(int i = 0; i<numberOfThreads; i++){
            int start = i * chunkSize;
            int end = start + chunkSize;

            if (i==numberOfThreads-1){
                end = numbers.length;
            }
            System.out.println("Thread-"+i+" Start:"+start+" End:"+end);
            workers[i] = new Calculation(numbers, start, end);
            threads[i] = new Thread(workers[i]);
            threads[i].start();

        }

        int total = 0;
        for(int i = 0; i<numberOfThreads; i++){
            threads[i].join();
            total+= workers[i].sum;
        }

        System.out.println("Total Sum: " + total);
    }
}
