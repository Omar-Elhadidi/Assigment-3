public class Main {

        public static Integer max(Integer[] array) {
            if (array == null) {
                return null;
            }

            if (array.length == 0) {
                return null;
            }

            Integer maxValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }

            return maxValue;
        }

        public static void main(String[] args) {
            Integer[] numbers = {5, 12, 3, 20};
            System.out.println("Maximum value: " + max(numbers));

        }
}



