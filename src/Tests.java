import javax.swing.JOptionPane;

public class Tests {
	public static void main(String[] args) {
		
		String[] Jautajumi = { "Kā pareizi deklarēt viendimensiju masīvu ar veseliem skaitļiem Java?", "Ko izvadīs šis kods?\nint[] a = new int[3];\nSystem.out.println(a[0]);",
			    "Kāds variants izveido un inicializē masīvu ar vērtībām: 1, 2, 3?", "Kāds ir pirmais masīva elements pēc kārtas?", "Kas notiek, ja piekļūst indeksam, kas pārsniedz masīva garumu?",
			    "Kā iegūt masīva garumu?", "Ko dara šis kods?\nint[] nums = new int[5];\nArrays.fill(nums, 7);", "Ko izvadīs šis kods?\nint[] arr = {10, 20, 30};\nSystem.out.println(arr.length);",
			    "Vai var mainīt masīva izmēru pēc tā izveidošanas?", "Kā pareizi iterēt caur masīvu, izmantojot for-each ciklu?"};
		String[] AtbilzhuVar = {
			    "int array = new int();", "int[] array = new int[10];", "int array[] = new int[10];", "Abi B un C",
			    "0", "1", "null", "Kompilācijas kļūda",
			    "int[] arr = new int[]{1, 2, 3};", "int[] arr = {1, 2, 3};", "int arr[] = new int[]{1, 2, 3};", "Visi minētie",
			    "0", "1", "-1", "Atkarīgs no garuma",
			    "Tiek atgriezta null", "Tiek atgriezts 0", "Tiek izmesta ArrayIndexOutOfBoundsException", "Kompilācijas kļūda",
			    "arr.length()", "arr.length", "arr.size()", "arr.getLength()",
			    "Aizpilda ar skaitļiem no 1 līdz 5", "Aizpilda ar nullēm", "Aizpilda ar vērtību 7", "Neko nedara",
			    "2", "3", "30", "Kompilācijas kļūda",
			    "Jā", "Nē", "Tikai ja tas ir tukšs", "Tikai ar ArrayList",
			    "for (int i : arr)", "for (int i = 0; i < arr.length; i++)", "foreach (int i in arr)", "for (i in arr)"
			};
		
		String[] PareiziAtbildi = {"4", "1", "4", "1", "3", "2", "3", "2", "2", "1"};
		int[] seciba = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int ParAtb = 0;
		String nepareizi = "";
		
		for (int i = 0; i < seciba.length; i++) {
            int j = (int)(Math.random() * seciba.length);
            int a = seciba[i];
            seciba[i] = seciba[j];
            seciba[j] = a;
        } 
		 
	}
}
