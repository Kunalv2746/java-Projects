import java.util.Arrays;

public class SearchIn2darr {
    public static void main(String[] args) {

        int nums[][] = { { 12, 56, 23 },
                { 34, 7, 4, 3 },
                { 78, 45, 32, 56 },
                { 18, 12, 36, 0 } };
        int target = 4;
        int[] ans = LinearSearch(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] LinearSearch(int arr[][], int target) {
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
           
       return new int[]{-1,-1};
    }
}
