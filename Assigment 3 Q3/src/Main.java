public class Main {
    public static void sort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 20, 1};
        System.out.println("Before sorting: ");
        printArray(numbers);

        sort(numbers);
        System.out.println("After sorting: ");
        printArray(numbers);

        int[] emptyArray = {};
        sort(emptyArray);
        System.out.println("Sorted empty array: ");
        printArray(emptyArray); // Output: []

        int[] singleElementArray = {42};
        sort(singleElementArray);
        System.out.println("Sorted single-element array: ");
        printArray(singleElementArray); // Output: [42]
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

    }

}

