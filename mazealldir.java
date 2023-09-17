import java.util.Arrays;

public class mazealldir {

  public static void main(String[] args) {
    boolean board[][] = {
      { true, true, true },
      { true, true, true },
      { true, true, true },
    };
    //allpath("", 0, 0, board);
    int path[][] = new int[board.length][board[0].length];
    allpathpr("", 0, 0, board, path, 1);
  }

  static void allpath(String p, int r, int c, boolean maze[][]) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if (maze[r][c] == false) {
      return;
    }
    // i am considering this block in my path
    maze[r][c] = false;
    if (r < maze.length - 1) {
      allpath(p + "D", r + 1, c, maze);
    }
    if (c < maze[0].length - 1) {
      allpath(p + "R", r, c + 1, maze);
    }
    if (r > 0) {
      allpath(p + "U", r - 1, c, maze);
    }
    if (c > 0) {
      allpath(p + "L", r, c - 1, maze);
    }
    // this is the line where function gets over
    // before the function gets removed also remove the changes that were made by the function
    maze[r][c] = true;
  }

  static void allpathpr(
    String p,
    int r,
    int c,
    boolean maze[][],
    int path[][],
    int step
  ) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      path[r][c] = step;
      System.out.println(p);
      for (int[] arr : path) {
        System.out.println(Arrays.toString(arr));
      }
      return;
    }
    if (maze[r][c] == false) {
      return;
    }
    // i am considering this block in my path
    maze[r][c] = false;
    path[r][c] = step;
    if (r < maze.length - 1) {
      allpathpr(p+"D", r+1, c, maze, path, step + 1);
    }
    if (c < maze[0].length - 1) {
      allpathpr(p + "R", r, c + 1, maze, path, step + 1);
    }
    if (r > 0) {
      allpathpr(p + "U", r - 1, c, maze, path, step + 1);
    }
    if (c > 0) {
      allpathpr(p + "L", r, c - 1, maze, path, step + 1);
    }
    // this is the line where function gets over
    // before the function gets removed also remove the changes that were made by the function
    maze[r][c] = true;
    path[r][c] = 0;
  }
}
