
public class ThreeDArrayExample {
    public static void main(String[] args) {
        int[][][] arr = new int[2][3][4];  // 2 blocks, 3 rows, 4 columns

        int value = 1;

        // Assigning values
        for (int i = 0; i < 2; i++) {           // depth
            for (int j = 0; j < 3; j++) {       // rows
                for (int k = 0; k < 4; k++) {   // columns
                    arr[i][j][k] = value++;
                }
            }
        }

        // Printing values
        for (int i = 0; i < 2; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

