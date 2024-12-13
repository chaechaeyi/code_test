import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" "); // 공백으로 구분하여 입력 받기
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);


		StringBuilder output = new StringBuilder();
		output.append(plus(a, b)).append("\n");
		output.append(minus(a, b)).append("\n");
		output.append(multiply(a, b)).append("\n");
		output.append(division(a, b)).append("\n");
		output.append(modulo(a, b)).append("\n");

		System.out.print(output);
	}

	private static int plus(int a, int b) {
		return a + b;
	}

	private static int minus(int a, int b) {
		return a - b;
	}

	private static int multiply(int a, int b) {
		return a * b;
	}

	private static int division(int a, int b) {
		return a / b;
	}

	private static int modulo(int a, int b) {
		return a % b;
	}
}
