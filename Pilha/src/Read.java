

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

	
	// copiar
	public static int readInt() {
		try {
			return Integer.parseInt(read());
		} catch (Throwable e) {
			// TODO: handle exception
			System.err.println("Número Inteiro Inválido!");
		}
		return Integer.MIN_VALUE;
	}

	public static String readString() {

		return read();
	}

	public static float readFloat() {
		try {
			return Float.parseFloat(read());
		} catch (Throwable e) {
			System.err.println("Número Float Inválido!");
		}
		return Float.MIN_VALUE;

	}

	public static double readDouble() {
		try {
			return Double.parseDouble(read());
		} catch (Throwable e) {
			System.err.println("Número Double Inválido!");
		}
		return Double.MIN_VALUE;
	}

	public static char readChar() {

		return read().toCharArray()[0];
	}

	private static String read() {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}