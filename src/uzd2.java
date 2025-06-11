import java.util.Scanner;

public class uzd2 {
	public static void main(String[] args) {
		int[] numbers = new int[7];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
      //Ievade
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ievadiet skaitli " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        // Aprēķina aritmētisko vidējo
        double average = (double) sum / numbers.length;
        
     // Izvada rezultātus
        System.out.println("Summa: " + sum);
        System.out.println("Viedejais artmētiskais: " + average);

	}
}
