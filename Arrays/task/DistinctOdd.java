package task;

public class DistinctOdd {

    public static void main(String[] args) {

        int size = 0, index = 0;

        int[] arry = { 5, 5, 3, 6, 3, 2 };

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if (arry[i] == arry[j] && i > j) {
                    break;

                }
                if (arry[i] == arry[j] && arry[i] % 2 != 0) {
                    size++;
                    break;
                }
            }
        }
        int[] newArry = new int[size];
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if (arry[i] == arry[j] && i > j) {
                    break;
                }
                if (arry[i] == arry[j] && arry[i] % 2 != 0) {
                    newArry[index++] = arry[i];
                    break;
                }
            }
        }
        
        for (int x : newArry) {
            System.out.println(x);
        }
    }
}
