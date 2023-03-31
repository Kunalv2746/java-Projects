public class Min_no {
    public static void main(String[]args){
      int no_s[]={4,5,-6,8,3,2};
      System.out.println(minsearch(no_s));
      
    }
    public static int minsearch(int arr[]){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
