import java.util.*;

public class Iterativesubstring {

  public static void main(String[] args) {
    int arr[] = { 1,12,3};
    
 List<List<Integer>> ans =subset(arr);
 for(List<Integer> list:ans)
 {
    System.out.println(list);
 }
  }

  static List<List<Integer>> subset(int arr[]) {
    List<List<Integer>> outerlist = new ArrayList<>();
    outerlist.add(new ArrayList<>());
    for (int num : arr) {
      int size=outerlist.size();
      for (int i = 0; i < size; i++) {
        List<Integer> internal= new ArrayList<>(outerlist.get(i));
        // for every number a size no. of lists are created here
        internal.add(num);
        outerlist.add(internal);
        
      }
    }
    return outerlist;
  }
}
