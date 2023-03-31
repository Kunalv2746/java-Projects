import java.util.Arrays;

public class ProblemOFLinearSearch {
  public static void main(String[]args){
    String name="Kunal";
    char target='u';
    boolean ans=searchString(name,target);
    System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println(ans);

  }
  public static boolean searchString(String str,char target){
   if(str.length()==0){
    return false;
   } 
   for(char element : str.toCharArray()){
      if(element==target){
        return true;
      }
      
   }
   return false;
  }  
}
