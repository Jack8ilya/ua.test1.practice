import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] sourceNumbers = new int[50];
        fillingTheArray(sourceNumbers);
        System.out.println(Arrays.toString(sourceNumbers));
        System.out.println(Arrays.toString(sortArray(sourceNumbers)));
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            number = sourceNumber.toString();
            if (number.length() == 3 && number.charAt(0) != number.charAt(1)
                    && number.charAt(1) != number.charAt(2)
                    && number.charAt(0) != number.charAt(2)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("Все трехзначные числа, "
                + "в десятичной записи которых нет одинаковых цифр: " + result);
    }

    public static int[] fillingTheArray(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(20000);
        }
        return mas;
    }

    public static int[] sortArray(int[] mas) {
        int[] copyArray = Arrays.copyOf(mas, mas.length);
        for (int i = 1; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length - i; j++) {
                if (copyArray[j] > copyArray[j + 1]) {
                    int tmp = copyArray[j + 1];
                    copyArray[j + 1] = copyArray[j];
                    copyArray[j] = tmp;
                }
            }
        }
        return copyArray;
    }
}
