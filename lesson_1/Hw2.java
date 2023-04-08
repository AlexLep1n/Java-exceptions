public class Hw2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] { { "0", "1", "1", "1" }, { "0", "1", "1", "1" } };
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int value = Integer.parseInt(arr[i][j]);
                sum += value;
            }
        }
        return sum;
    }
}

/*
 * 1. NumberFormatException
 * 2. ArrayIndexOutOfBoundsException
 * 3. NullPointerException
 */