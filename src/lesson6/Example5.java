package lesson6;

public class Example5 {

    public static void main(String[] args) {
        /*-----------------------------------------------------------------------------------------*
            Зубчатый массив:
            |———|———|———|———|———|
            | 1 | 5 | 8 | 9 | 11|
            |———|———|———|———|———|
            | 2 | 6 |   | 10| 12|
            |———|———|   |———|———|
            | 3 | 7 |       | 13|
            |———|———|       |———|
            | 4 |
            |———|
        *-----------------------------------------------------------------------------------------*/
        int serratedArray[][] = new int[5][];
        serratedArray[0] = new int[4];
        serratedArray[1] = new int[3];
        serratedArray[2] = new int[1];
        serratedArray[3] = new int[2];
        serratedArray[4] = new int[3];

        // Наполнение значениями зубчатого массива
        int value = 1;
        for (int i = 0; i < serratedArray.length; i++) {
            for (int j = 0; j < serratedArray[i].length; j++) {
                serratedArray[i][j] = value;
                value++;
            }
        }

        for (int[] ints : serratedArray) {
            for (int val : ints) {
                System.out.print(val + " ");
            }

            System.out.print("\n");
        }
    }
}
