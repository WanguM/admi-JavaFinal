public  class recursion {

    public static int mystery1(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        }
        return a * mystery1(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(mystery1(1, 9)); //  i.
        System.out.println(mystery1(4, 2)); //  ii.
        System.out.println(mystery1(2, 5)); //  iii.
    }
}