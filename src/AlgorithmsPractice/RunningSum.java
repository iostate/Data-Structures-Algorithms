package RunningSumof1DArray;

public class RunningSum {
    int sum[];

    public RunningSum(int[] numbers) {
        this.sum = numbers;
    }

    public int calculateSum () {
        int length = this.sum.length;
        int count = 0;
        int sum = 0;
        while(count < length) {
            sum += this.sum[count];
            count++;
        }

        return sum;
    }

    public static void main(String[] args) {
        RunningSum test = new RunningSum(new int[]{1, 2, 3, 4});
        int tSum = test.calculateSum();
        System.out.println(tSum);
    }



}
