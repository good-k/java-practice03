package prob06_2;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			//1. 입력
			System.out.print(">>");
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			
			//2. 처리
			Arith arith = null;
			
			switch (tokens[1]) {
				case "+": {
					arith = new Add();
					break;
				}
				case "-": {
					arith = new Sub();
					break;
				}
				case "*": {
					arith = new Mul();
					break;
				}
				case "/": {
					arith = new Div();
					break;
				}
				case "%": {
					arith = new Mod();
					break;
				}
				default: {
					break;
				}
			}
			
			//3. 출력
			if( arith == null ) {
				System.out.println( "지원하지 않는 연산입니다." );
				return;
			}
			
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);
			
			arith.setlValue(lValue);
			arith.setrValue(rValue);
			System.out.println(">>" +  arith.calc());
		}
	}
}