package exercise2task2Package;

public class Test {

	public static void main(String[] args) {
		FibonacciGenerator fG = new FibonacciGenerator();
		int i = 0;
		while(i<10) {
			System.out.println(fG.next());
			i++;
		}

	}

}
