import java.util.*;

class arraylistex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ArrayList <Integer> list =new ArrayList <>(10);
    // list.add(67);
    // list.add(675);
    // list.add(674);
    // list.add(676);
    // list.add(66);
    // list.add(6766);

    // System.out.println(list);
    //array list of array list
    ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
    //initialization
    for (int i = 0; i < 3; i++) {
      list1.add(new ArrayList<>());
    }
    //add elements
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list1.get(i).add(sc.nextInt());
      }
    }

    System.out.println(list1);
  }
}
