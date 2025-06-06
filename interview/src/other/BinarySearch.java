public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {3, 6, 9, 12, 15};

        int target = 6;

        int i = findIndex(sortedArray, target);
    }

    public static int findIndex(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length;

        while (left <= right) {
            int middle = (right - left) / 2 + left; // чтобы инт не переполнился
            if (sortedArray[middle] == target) {
                return middle;
            } else if (sortedArray[middle] > target) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return -1;
    }
}