

public class Dsa1 {
    public static void main(String[]args){
      
      int nums[]={12,56,23,34,76,83,45};
      int target=23;
      boolean ans= LinearSearch(nums, target);
      System.out.println(ans);
    }
    public static boolean LinearSearch(int arr[],int target ){
        if(arr.length==0){
            return false;
        }
       // for(int index=0;index<arr.length;index++)
       for(int element:arr) // every element in array...
       {
            if(element==target){
                System.out.println("matched no");
                return true;
                 // matched no.
                 
            }
            
        }

    return false;
       // not matched.
    }
}
