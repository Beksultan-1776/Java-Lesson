package lesson6;

public class Example6 {

    public static void main(String[] args) {
        /*-----------------------------------------------------------------------------------------*
            Стандартные алгоритмы обработки элементов массива:
            1. Удаление значения массива по определенному индексу.
            2. Вставка значения в массив по определенному элементу.
            3. Сортировка элемента массива. (Сортировка пузырьком)
        *-----------------------------------------------------------------------------------------*/
        // 1. Удаление значения массива по определенному индексу.
        // int numbers[] = new int[9];
        // for (int i = 0; i < numbers.length; i++)
        //     numbers[i] = i + 1;

        // int itemIndex = 5;
        // for (int i = itemIndex; i < numbers.length - 1; i++)
        //     numbers[i] = numbers[i + 1];

        // for (int i = 0; i < numbers.length; i++) System.out.println(numbers[i]);

        // 2. Вставка значения в массив по определенному элементу.
        // int[] numbers2 = { 1, 2, 3, 5, 6, 7, 8, 9, 9 };
        // for (int i = 8; i > 3; i--)
        //     numbers2[i] = numbers2[i - 1];
        
        // numbers2[3] = 4;
        // for (int val : numbers2) System.out.print(val + " ");
        // System.err.print("\n");

        // 3. Сортировка элемента массива. (Сортировка пузырьком) жесть X_X
        int[] numbers3 = { 3, 5, 1, 4, 8 };

        for (int i = 0; i < numbers3.length - 1; i++) {
            int min = numbers3[i];
            int pos = i;

            for (int j = i + 1; j < numbers3.length; j++) {
                if (min > numbers3[j]) {
                    pos = j;
                    min = numbers3[j];
                }
            }

            int t = numbers3[i];
            numbers3[i] = numbers3[pos];
            numbers3[pos] = t;
        }
        
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
        System.out.print("\n");
    }
}
