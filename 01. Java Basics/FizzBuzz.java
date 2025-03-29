// The program should iterate from 1 to 100 and print 'Fizz' for multiples of 3, 'Buzz' for multiples of 5,
// 'FizzBuzz' for multiples of both 3 and 5, and the number itself for all other cases.“

public class FizzBuzz {
    public static void solve() {
        for(int i = 1 ; i <= 100 ; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        solve();
    }
}