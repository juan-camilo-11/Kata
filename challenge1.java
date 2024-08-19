
import java.util.ArrayList;

public class challenge1 {

    static final int SELECTED_NUMBER = 8;

    static int[] listOfNumbers = {80, 8, 5, 4, 3, 2, -85, 7, 7, 29, 1};

    public static void main(String[] args) {

        ArrayList<Integer> numberlist = new ArrayList<>();

        for (int number : listOfNumbers) {
            Integer newNumber = deleteSelectedNumber(number);
            if (newNumber != null) {
                numberlist.add(newNumber);
            }
        }

        ArrayList<Integer> sortedDescendingNumbers = bubbleSort(numberlist);

        // 
        System.out.println("----------------------------------------------------------");
        for (int number : sortedDescendingNumbers) {
            System.out.print("[" + number + "]");
        }
        System.out.println("\n----------------------------------------------------------");
    }

    static Integer deleteSelectedNumber(int number) {
        String result = "";

        char selectedNumberChar = (char) (SELECTED_NUMBER + '0');

        String numberString = Integer.toString(number);

        char[] numbersChars = numberString.toCharArray();

        for (char numberChar : numbersChars) {
            if (numberChar >= selectedNumberChar) {
                continue;
            }
            result += numberChar;
        }

        if (result.isEmpty() || result.equals("-")) {
            return null;
        }

        return Integer.valueOf(result);
    }

    static ArrayList<Integer> bubbleSort(ArrayList<Integer> numberlist) {
        for (int i = 0; i < numberlist.size(); i++) {
            for (int j = 0; j < numberlist.size(); j++) {
                if (numberlist.get(i) > numberlist.get(j)) {
                    int temp = numberlist.get(i);
                    numberlist.set(i, numberlist.get(j));
                    numberlist.set(j, temp);
                }
            }
        }
        return numberlist;
    }
}
