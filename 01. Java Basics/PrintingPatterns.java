public class PrintingPatterns {
    public static void printNumberTriangle(int rows) {
        int number = 1;

        for(int row = 1 ; row <= rows ; row++) {
            for(int col = 1 ; col <= row ; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumberTriangle(6);
    }
}
