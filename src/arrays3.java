public class arrays3 {

    public static int[] question3(int[] third) {
        int[] sample = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = sample.length - 1;

        for (int k = 0; k < (sample.length) / 2; k++) {
            sample[k] = sample[i];
            i--;
        }
        return third;

    }

    public static void main(String[] args) {
        System.out.println(question3());
    }
}