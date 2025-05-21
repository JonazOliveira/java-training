public class Sorts {
    public static void bubbleSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                        swapped = true;
                    }
                }
            }
        } while (swapped);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                int aux = array[indexMin];
                array[indexMin] = array[i];
                array[i] = aux;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;

            while (j > 0 && array[j] < array[j - 1]) {
                int aux = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux;
                j--;
            }
        }
    }
}
