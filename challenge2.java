
import java.util.ArrayList;

public class challenge2 {

    static final int SELECTED_NUMBER = 8;

    static int[] listOfNumbers = {-12, -8, -5, 0, 5, 8, 9, 11};

    public static void main(String[] args) {

        ArrayList<Integer> numberSquareList = new ArrayList<>();

        for (int i = 0; i < listOfNumbers.length; i++) {
            int numberSquare = calculateSquare(listOfNumbers[i]);
            int selectedNumberDuplicated = SELECTED_NUMBER * 11;
            if (numberSquare > selectedNumberDuplicated) {
                continue;
            }
            numberSquareList.add(numberSquare);
        }

        ArrayList<Integer> orderedAscendingNumbers = bubbleSort(numberSquareList);

        System.out.println("---------------------------------------------");
        for (int number : orderedAscendingNumbers) {
            System.out.print("[" + number + "] ");
        }
        System.out.println("\n---------------------------------------------");
    }

    static Integer calculateSquare(int number) {
        return number * number;
    }

    static ArrayList<Integer> bubbleSort(ArrayList<Integer> numberlist) {
        for (int i = 0; i < numberlist.size(); i++) {
            for (int j = 0; j < numberlist.size(); j++) {
                if (numberlist.get(i) < numberlist.get(j)) {
                    int temp = numberlist.get(i);
                    numberlist.set(i, numberlist.get(j));
                    numberlist.set(j, temp);
                }
            }
        }
        return numberlist;
    }
}
