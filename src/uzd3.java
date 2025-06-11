import java.util.Random;

public class uzd3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        // Aizpilda masīvu ar nejaušiem skaitļiem no 1 līdz 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        
        int max = arr[0];
        int min = arr[0];

        // Atrod max un min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Izvada Max un Min
        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);

        // Izvada masīva elementus apgrieztā secībā
        System.out.println("Masīvs apgrieztā secībā:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
