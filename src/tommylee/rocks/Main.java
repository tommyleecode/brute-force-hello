package tommylee.rocks;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String[] target_array = "Hello Tommy! Welcome to Eden Prime :D".split("");
        String[] string_array = new String[target_array.length];

        // Init all the element with an empty string if not then null will come out as text
        Arrays.fill(string_array, "");

        int i = 0;

        while (i < target_array.length) {

            string_array[i] = Character.toString((char) getRandomNumberInRange(32, 126));

            // If found then add one to search for the next one
            if(string_array[i].equals(target_array[i])) {
                i++;
            }

            // Set the return carriage to clear the same line then use join to string the array together along with the empty string in the set
            System.out.print("\r" + String.join("", string_array));

            TimeUnit.MILLISECONDS.sleep(2);
        }
    }

    /**
     * Get a random int back when supply with a min and max range.
     *
     * @param min
     * @param max
     * @return
     */
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
