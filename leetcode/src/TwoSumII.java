public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int output[] = {0, 0};
        int index = search(target, numbers );
        System.out.println(index);
        for(int i = index; i >= 0; i--){
            for(int j = 0; j < index; j++){
                if (numbers[i] + numbers[j] == target){
                    output[1] = i+1;
                    output[0] = j+1;
                    return output;
                }
            }
        }

        return output;
    }
    public static int search(int value, int[] a) {

        if(value < a[0]) {
            return 0;
        }
        if(value > a.length-1) {
            return a.length-1;
        }

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;

            if (value < a[mid]) {
                hi = mid - 1;
            } else if (value > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return (a[lo] - value) < (value - a[hi]) ? lo : hi;
    }

    public static void main(String[] args) {

//        int numbers[] = {2,7,11,15};
//        int target = 9;
        int numbers[] = {2,3,4};
        int target = 6;

        int output[] = twoSum(numbers,target );

        for (int x: output ){
            System.out.println(x);
        }

    }
}
