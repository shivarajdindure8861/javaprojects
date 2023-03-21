public class FindEleInArr {
    public static int findElement(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 5, 3, 8, 1, 9, 2, 7, 4, 6 };
        int n = 11;
        int res = findElement(arr, n);
        System.out.println(res);
    }
}
