package array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr;

        //    arr = {1, 2, 3};
        arr = new int[] {1, 2, 3};

        int[] arr1 = new int[10];

        int[] arr2 = new int[] {1, 2, 3};

        int[] arr3 = {1, 2, 3};

        int total = 0;
        for (int i=0, num=1; i<arr1.length; i++, num++) {
//            System.out.println(arr1[i]);
            arr1[i] = num;
        }

        for (int i=0; i<arr1.length; i++) {
//            System.out.println(arr1[i]);
            total += arr1[i];
        }
        System.out.println(total);

        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for (int i=0; i<count; i++) {
            mtotal *= dArr[i];
        }
        System.out.println(mtotal);
    }
}
