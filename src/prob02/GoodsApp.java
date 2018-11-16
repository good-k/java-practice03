package prob02;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[3];
		
		for(int i = 0; i < 3; i++) {
			String line = scanner.nextLine();
			String[] infos = line.split(" ");
			
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int stock = Integer.parseInt(infos[2]);
			
			goods[i] = new Goods();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setStock(stock);
		}
		
		for(int i = 0; i < 3; i++) {
			goods[i].showInfo();
		}
		
		scanner.close();
	}
}
