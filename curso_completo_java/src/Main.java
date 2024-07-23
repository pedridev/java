import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(product1 + ", which price is "+ price1);
		System.out.println(product2 + " which price is "+ price2);
		
		System.out.println();
		System.out.println("Record : " +age+ " years old, code " + code + " and gender : "+ gender + ".");
		System.out.println();
		
	
		System.out.println("Measure with eight decimal places : " + measure);
		System.out.printf("Rouded (three decimal places) : %.3f\n", + measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point : %.3f\n", + measure);

		/*
		
		No console : 
		
		Products:
		Computer, which price is 2100.0
		Office Desk which price is 650.5

		Record : 30 years old, code 5290 and gender : F.

		Measure with eight decimal places : 53.234567
		Rouded (three decimal places) : 53,235
		US decimal point : 53.235
		
		*/
	
	}

}
