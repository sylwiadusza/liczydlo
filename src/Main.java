import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 3, 3, 5, 2};
        int searchNumber = 3;
        int count = 0; //zmienna trzymająca ilość wystąpień w tablicy
        for (int i = 0; i < numbers.length; i++) {
            if (searchNumber == numbers[i]) {
                count++;
            }
        }
        System.out.println("Liczba " + searchNumber + " występuje " + count + " razy.");
    }
}