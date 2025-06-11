import java.util.Scanner;

public class uzd1 {
    public static void main(String[ ] args) {
    	int[] numbers = new int[5];
    	Scanner scan = new Scanner(System.in);
    	
    	//Ievade
    	for(int i=0; i<numbers.length;i++) {
    		System.out.println("Ievadiet " + (i + 1) + ". skaitli: ");
    		numbers[i] = scan.nextInt();
    	}
    	scan.close();
    	
    	//Izvade
    	System.out.println("Jūsu ievadītie skaitļi:");
    	for(int num : numbers) {
    		System.out.print(num+" ");
    	}
    }
}