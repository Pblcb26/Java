class HomeWorkApp {
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	public static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	public static void checkSumSign() {
		int a = -35;
		int b = 25;
		System.out.println((a + b) >= 0? "Сумма положительная" : "Сумма отрицательная");
	}
	public static void printColor() {
		int value = 125;
		if (value <= 0) {
			System.out.println("Красный");
		}
		if (value > 0 && value <= 100) {
			System.out.println("Желтый");
		}
		if (value > 100) {
			System.out.println("Зеленый");
		}	
	}
	public static void compareNumbers() {
		int c = 55;
		int d = 15;
		System.out.println(c >= d ? "c>=d" : "c < d");
	}
}