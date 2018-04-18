public class rectangle {

    int length;
    int width;

    //Constructor

    rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int getArea (int length, int width) {
        int area = length * width;
        return area;

    }

    public static boolean isSquare (int length, int width) {

        boolean isSquare = length == width;
        return  isSquare;
    }


    public static void main(String[] args) {

        rectangle r = new rectangle(2,4);
        System.out.println(getArea(r.length,r.width));

        rectangle r2 = new rectangle(3,6);
        System.out.println(isSquare(r2.length,r2.width));

        rectangle r3 = new rectangle(5,5);
        System.out.println(isSquare(r3.length,r3.width));

    }
}