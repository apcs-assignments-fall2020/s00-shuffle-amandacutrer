import java.util.Arrays;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] half1 = new int[arr.length/2];
        for (int i = 0; i < arr.length/2; i++){
            half1[i] = arr[i];
        }
        int[] half2 = new int[arr.length/2];
        for (int i = arr.length/2; i < arr.length; i++){
            half2[i-(arr.length/2)] = arr[i];
        }
        for (int i = 0; i < arr.length/2; i++){
            arr[i*2] = half1[i];
            arr[(i*2)+1] = half2[i];
        }
        return arr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int random = (int)(Math.random()*arr.length);
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = arr[temp];
        } 
        return arr;
    }


    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7,8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        System.out.println(Arrays.toString(perfectShuffle(test)));
        System.out.println(Arrays.toString(selectionShuffle(test)));
    }
}
