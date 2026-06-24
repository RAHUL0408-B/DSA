public class binarysearch {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};

        int target = 50;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(arr[mid] == target) {

                System.out.println("Found at index " + mid);
                return;
            }

            else if(target > arr[mid]) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}