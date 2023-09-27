import java.util.*;
class Main{
   public static void main(String[] args) {
      String str1="listen";
      String str2="silent";
      if(str1.length()==str2.length()){
         char ch1[] = str1.toCharArray();
         char ch2[] = str2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         boolean res = Arrays.equals(ch1,ch2);
         if(res){
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
      }
      else{
         System.out.println("false");
      }
   }
}
