public class arrays2
{
    public static void main(String[] args) {
        int[] numbers = {2,-1,5,-4,3};
        for(int n : PositiveNumbers(numbers)){
            System.out.print(n);
        }

    }
    public static int[] PositiveNumbers(int[] numbers)
    {
        int count = 0;
        for (int n : numbers)
        {
            if(n>0)
            {
                count++;
            }
        }
        int [] nums = new int[count];
        int i =0;
        for (int n : numbers)
        {
            if(n>0)
            {
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }
}