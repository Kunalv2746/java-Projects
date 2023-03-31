public class L_SFromIndex {
  public static void main(String[]args) {
    int nums[]={2,5,6,7,3,8,1};
    int target=3;
    boolean ans=LinearSearch(nums,target,2,6);
    System.out.println(ans);
  } 
  public static boolean LinearSearch(int arr[],int target ,int start, int end){
    if(arr.length==0){
        return false;
    }
    for(int index=start;index<end;index++)
   // every element in array...
   {
        if(index==target){
            System.out.println("matched no");
            return true;
             // matched no.
             
        }
        
    }

return false;
   // not matched.
}
}
