package arrays

class Calculator {

    static MaxAndMin findMaxAndMin(int[] array) {
        int maximum = array[0];
        int minimum = array[0];

        for (int i = 0; i < array.length; i++) {

            if (minimum > array[i]) {
                minimum = array[i];
            }
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return new MaxAndMin(minimum, maximum)
    }
}
