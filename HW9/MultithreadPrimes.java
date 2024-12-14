package HW9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultithreadPrimes {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Accept user input for the number of threads and upper bound
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();

        System.out.print("Enter the upper bound for the prime number search: ");
        int upperBound = scanner.nextInt();

        // Start measuring execution time
        long startTime = System.currentTimeMillis();

        // List to hold threads
        List<PrimeSearchThread> threads = new ArrayList<>();
        int blockSize = upperBound / numThreads;

        // Divide the number into equal chunks for threads to handle
        for (int i = 0; i < numThreads; i++) {
            int start = i * blockSize;
            int end = (i == numThreads - 1) ? upperBound : (i + 1) * blockSize;
            PrimeSearchThread thread = new PrimeSearchThread(start, end);
            threads.add(thread);
            thread.start();
        }

        // Wait for all threads to complete, then continue Main
        for (PrimeSearchThread thread : threads) {
            thread.join();
        }

        // Stop measuring execution time
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");

        scanner.close();
        System.out.println("Done!");
    }

    private static class PrimeSearchThread extends Thread {
        private final int start;
        private final int end;

        public PrimeSearchThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            // Check if each nu
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    synchronized (System.out) {
                        System.out.println(i);
                    }
                }
            }
        }

        private boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
     * Interview-style Questions:
     * 1. What is the purpose of the 'synchronized' block in this program?
     * Answer: The 'synchronized' block ensures that only one thread can access the
     * 'System.out.println' statement at a time, preventing distorted output.
     *
     * 2. How does dividing the range among multiple threads improve performance?
     * Answer: By dividing the range, multiple threads can process different parts
     * of the task concurrently, reducing the total execution time compared to a
     * single-threaded approach.
     *
     * 3. What happens if the number of threads exceeds the number of CPU cores?
     * Answer: If the number of threads exceeds the CPU cores, the threads will
     * time-share the CPU, leading to potential overhead due to context switching,
     * which might diminish performance gains.
     * My CPU has 8 cores, so it can handle 8 threads simultaneously until
     * time-sharing starts to occur!
     *
     * 4. Why is 'Thread.join()' used in the main method?
     * Answer: 'Thread.join()' ensures that the main thread waits for all worker
     * threads to complete their execution before proceeding. This ensures that the
     * program finishes only after all prime numbers are found.
     * 
     * As a sanity check, I ensured that using a lower amount of threads decreased
     * the total execution time, which it did. However, I started to get some
     * diminishing returns to performance up to about 4 threads, which I assume
     * is due to the sheer clock speed of my processor, which is 3.6GHz where each
     * thread is only performing small computations using few clock cycles. My
     * biggest challenge was understanding how to implement the synchronized block,
     * but understaning the purpose of the technique intuitively led me to ensure
     * that the terminal output from the run() function in each thread must be
     * synchronized in order to obtain clean, sequential output even while using a
     * multi-threaded approach.
     */
}
