package arrays;

public class sum_of_elements {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        int sum = 0;
        // sum of all elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);

    }
}
