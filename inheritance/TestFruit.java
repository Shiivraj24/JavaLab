package inheritance;

import java.util.Scanner;

public class TestFruit {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		Fruit[] basket = new Fruit[sc.nextInt()];
		int index = 0, ch = 0;
		System.out.println("1.Mango \n 2.Apple \n 3.Orange \n 4.All fruit \n 5.Fresh Fruits");
		
	
		do {
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < basket.length) {
					basket[index] = new Mango("Mango", "yellow", 100.00, true);
					System.out.println("You Entered Mango");
					
					index++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 2:
				if (index < basket.length) {
					basket[index] = new Apple("Apple", "red", 99.99, true);
					System.out.println("You Entered Apple");
					
					index++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 3:
				if (index < basket.length) {
					basket[index] = new Orange("Orange", "Orange_Color", 77.66, true);
					System.out.println("You Entered Orange");
					
					index++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 4:
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println(f.getName());
					
					}
					
				}
			
				break;
			case 5:
				for (Fruit f : basket) {
					if (f != null) {
					if (f.getFresh()) {
						System.out.println(f);
					}
					}
				}
				break;

			}

		} while (ch!=5);
	}
}
