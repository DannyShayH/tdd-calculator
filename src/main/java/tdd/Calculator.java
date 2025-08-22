package tdd;

public class Calculator {
    public static void main(String[] args) {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(String numbers) {
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }

    public int add(int[] sum) {
        int total= 0;
        for(int num : sum){
        total += num;
        }
        return total;
    }
}
