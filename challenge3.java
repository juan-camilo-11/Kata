import java.util.Arrays;

public class challenge3 {

    public static void main(String[] args) {
        int[] coins = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        //int[] coins = { 1, 1, 1, 1, 1 };
        //int[] coins = { 5, 7, 1, 1, 2, 3, 22 };

        Arrays.sort(coins);
        System.out.println("\n Minimo que NO puedo devolver es: " + minimumAmountOfChange(coins) + "\n");
    }

    static int minimumAmountOfChange(int[] coins) {

        int sumCoins = 0;

        if (coins[0] != 1) {
            return 1;
        }

        for (int i = 0; i < coins.length; i++) {
            if ( ! ( sumCoins >= coins[i] - 1 ) ) {
                break;
            }

            sumCoins += coins[i];
        }

        return sumCoins + 1;
    }

}
