import java.util.Arrays;

public class flippinganimage {

  public static void main(String[] args) {
    int image[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
    flipAndInvertImage(image);
    for (int[] ints : image) {
      System.out.println(Arrays.toString(ints));
    }
  }

  public static int[][] flipAndInvertImage(int image[][]) {
    for (int row[] : image) {
      //reverse this array
      for (int i = 0; i < (image[0].length + 1) / 2; i++) {
        int temp = row[i] ^ 1;
        row[i] = row[image.length - i - 1] ^ 1;
        row[image.length - i - 1] = temp;
      }
    }
    return image;
  }
}
