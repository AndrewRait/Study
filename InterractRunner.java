import java.util.Scanner;

public class InterractRunner {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("First arg : ");
				String first = scaner.next();
				System.out.println("Second arg : ");
				String second = scaner.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit ; yes / no");
				exit = scaner.next();
			}
		}

		finally {
			scaner.close();
		}
	}
}