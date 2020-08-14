import java.util.*;

/**
 * Calculate the hourglass sum for every hourglass in , then print the maximum
 * hourglass sum.
 *
 * Context Given a 2D Array, :
 *
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 *
 * We define an hourglass in to be a subset of values with indices falling in
 * this pattern in 's graphical representation:
 *
 * a b c d e f g
 *
 * There are hourglasses in , and an hourglass sum is the sum of an hourglass'
 * values.
 */
public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = 0;
                for (int k = j; k <= j + 2; k++) {
                    sum += arr[i][k] + arr[i + 2][k];
                }
                sum += arr[i + 1][j + 1];

                sums.add(sum);
            }
        }
        return findMax(sums);
    }

    public static int findMax(List list) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                max = (int) list.get(i);
            }
            current = (int) list.get(i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
