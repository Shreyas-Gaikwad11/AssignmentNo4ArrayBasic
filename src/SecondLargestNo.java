public class SecondLargestNo {
    public static void main(String[] args) {

        int arr[] = new int[]{25, 10, 35, 15,45,55};
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("SECOND LARGEST ELEMENT IS : " + arr[length - 2]);
    }
}
