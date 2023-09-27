import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.rotate(list, 2);  
        System.out.println(list);
    }
}
