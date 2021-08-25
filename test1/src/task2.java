import java.util.Scanner;
public class task2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rowsCount = scanner.nextInt(),
                colsCount = scanner.nextInt();
        if (rowsCount <= 0 || colsCount <= 0) {
            System.out.println("Invalid parameters");
            return;
        }
        System.out.printf("Count of routes: %d", CountOfRoutes(1,1, rowsCount, colsCount));
    }
    static int CountOfRoutes(int x, int y, final int fieldRows, final int fieldCols)
    {
        if (x == fieldCols && y == fieldRows)
            return 1;
        if (x < fieldCols && y < fieldRows)
            return CountOfRoutes(x + 2, y + 1, fieldRows, fieldCols) + CountOfRoutes(x + 1, y + 2, fieldRows, fieldCols);
        else return 0;
    }
}
