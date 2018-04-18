public class arrays {

    public static int[] reverse (int[] first)
    {
        for(int i = first.length; i>0; i--) {

            System.out.println(first[i - 1]);

        }
        return first;
    }

    public static void main(String[] args) {

        int first []=new int[]{1,2,3,4,5,6,7,8,9,10};
        reverse(first);
    }
}

