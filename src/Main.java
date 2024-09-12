import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    /**
     * find Fibonacci numbers
     * @param num length of Fibonacci series
     * @return a list of Fibonacci numbers of length num
     */
    static List<FibonacciNumber> fibonacci(int num) {
        FibonacciNumber num1 = new FibonacciNumber(0, 1);
        FibonacciNumber num2 = new FibonacciNumber(1, 1);

        ArrayList<FibonacciNumber> fibonacciNumbers = new ArrayList<>(Arrays.asList(num1, num2));
        for (int i = 2; i < num; i++) {
            int nextFibonacciNumberValue = fibonacciNumbers.get(i - 1).getNumberValue() + fibonacciNumbers.get(i - 2).getNumberValue();
            FibonacciNumber nextFibonacciNumber = new FibonacciNumber(i, nextFibonacciNumberValue);
            fibonacciNumbers.add(nextFibonacciNumber);
        }
        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSquares = 0;
        int numOfNumbers;

        if (args.length == 0) {
            numOfNumbers = Integer.parseInt(scanner.nextLine());
        } else {
            numOfNumbers = Integer.parseInt(args[0]);
        }

        System.out.println("User parsed: " + numOfNumbers + "\n");

        List<FibonacciNumber> fibonacciNumbers = fibonacci(numOfNumbers);

        for (FibonacciNumber num : fibonacciNumbers) {
            if (num.isSquare()) {
                System.out.println("Number " + num.getNumberValue() + " at position " + num.getNumberPosition() + " is a perfect square");
                numOfSquares++;
            } else {
                System.out.println("Number " + num.getNumberValue() + " at position " + num.getNumberPosition() + " is not a perfect square");
            }
        }

        System.out.println();
        System.out.println("Total number of perfect squares: " + numOfSquares);
    }
}