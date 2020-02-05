import java.io.*;

public class Libreria {
	public String Leer(String string) {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		String cadenaLeida;
		try {
			cadenaLeida = lector.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}
		return cadenaLeida;
	}
}
