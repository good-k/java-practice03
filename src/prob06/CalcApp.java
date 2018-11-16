package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");

			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);

			switch (tokens[1]) {
				case "+": {
					Add add = new Add();
					add.setlValue(lValue);
					add.setrValue(rValue);
					int result = add.calc();
					System.out.println(">>" + result);
					break;
				}
				case "-": {
					Sub sub = new Sub();
					sub.setlValue(lValue);
					sub.setrValue(rValue);
					int result = sub.calc();
					System.out.println(">>" + result);
					break;
				}
				case "*": {
					Mul mul = new Mul();
					mul.setlValue(lValue);
					mul.setrValue(rValue);
					int result = mul.calc();
					System.out.println(">>" + result);
					break;
				}
				case "/": {
					Div div = new Div();
					div.setlValue(lValue);
					div.setrValue(rValue);
					int result = div.calc();
					System.out.println(">>" + result);
					break;
				}
				default: {
					System.out.println("지원하지 않는 연산 입니다.");
					break;
				}
			}
		}
	}
}