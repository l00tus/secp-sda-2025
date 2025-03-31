public class PrintingPatterns {
    public static void printNumberTriangle(int numberOfRows) {
        if(numberOfRows <= 0) {
            System.out.println("number of rows should be positive and not 0!");
            return;
        }

        int currentNumber = 1;

        for(int row = 1 ; row <= numberOfRows ; row++) {
            for(int col = 1 ; col <= row ; col++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }

    public static int[][] buildPascalTriangle(int height) {
        if(height <= 0) {
            System.out.println("height should be positive and not 0!");
            return null;
        }

        int[][] pascalTriangle = new int[height + 1][height + 1];

        for(int row = 1 ; row <= height ; row++) {
            for(int col = 1 ; col <= row ; col++) {
                if(col == 1 || col == row) {
                    pascalTriangle[row][col] = 1;
                } else {
                    pascalTriangle[row][col] = pascalTriangle[row - 1][col - 1] + pascalTriangle[row - 1][col];
                }
            }
        }

        return pascalTriangle;
    }

    public static void printPascalTriangle(int[][] pascalTriangle) {
        if(pascalTriangle == null) {
            System.out.println("cannot print! empty pascal triangle");
            return;
        }

        int height = pascalTriangle.length - 1;

        for(int row = 1 ; row <= height ; row++) {
            int spacesToPrint = height - row;

            while(spacesToPrint > 0) {
                System.out.print(" ");
                spacesToPrint--;
            }

            for(int col = 1 ; col <= row ; col++) {
                System.out.print(pascalTriangle[row][col] + " ");
            }

            System.out.println();
        } 
    }

    public static void main(String[] args) {
        printNumberTriangle(-2);
        printNumberTriangle(5);
        printNumberTriangle(13);

        System.out.println();

        int[][] pascalTriangle1 = buildPascalTriangle(6);
        printPascalTriangle(pascalTriangle1);
        int[][] pascalTriangle2 = buildPascalTriangle(0);
        printPascalTriangle(pascalTriangle2);
    }
}
