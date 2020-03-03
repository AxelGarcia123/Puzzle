package dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOTool {

	public static List<String> getDatos (String ruta){
	List<String> cadenas=new ArrayList<>();
	Scanner entrada;
	try {
	entrada=new Scanner (new File(ruta));
	while(entrada.hasNext()) {
		cadenas.add(entrada.nextLine());
	}
	return cadenas;
	} catch (Exception e) {
		return null;
	}
	
	}
	public static List<String> getDatos (File archivo){
		List<String> cadenas=new ArrayList<>();
		Scanner entrada;
		try {
		entrada=new Scanner (archivo);
		while(entrada.hasNext()) {
			cadenas.add(entrada.nextLine()+"\n");
		}
		return cadenas;
		} catch (Exception e) {
			return null;
		}
		
		}
}
