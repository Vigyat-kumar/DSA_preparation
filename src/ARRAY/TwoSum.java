package ARRAY;

public class TwoSum {
    static boolean twosum(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                    return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target=2;
        int[] arr={1,3,-5,4,7,-2,9};
       boolean result= twosum(arr,target);
        System.out.println(result);
    }
}
