package pruebas;

public class toolString {

	public static boolean esNombre (String cadena) {
		for (int i = 0; i < cadena.length(); i++)
		{
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
				return false; //uno no es letra
		}
 
		//todos los caracteres son letras
		return true;
		

	}
}
