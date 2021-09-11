import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] mas = new int[50];
        fillingTheArray(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(sortArray(mas)));
        System.out.println("Count of unique elements - " + countOfUniqueElements(sortArray(mas)));
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

    public static int countOfUniqueElements(int[] mas) {
        int number = mas[0];
        int rez = 1;
        for (int count : mas) {
            if (number == count) {
                continue;
            } else {
                number = count;
                rez++;
            }
        }
        return rez;
    }
}
