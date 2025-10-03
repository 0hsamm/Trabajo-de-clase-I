package co.edu.unbosque.view;

import java.time.LocalDate;
import java.util.Properties;
import java.util.Scanner;

public class Consola {
	
	private Scanner sc;
	private Properties prop;
	
	public Consola() {
		sc = new Scanner(System.in);
		prop = new Properties();
		
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public int leerEntero() {
		return sc.nextInt();
		
	}
	public float leerFlotante() {
		return sc.nextFloat();
	}
	public double leerDoble() {
		return sc.nextDouble();
	}
	public long leerLong() {
		return sc.nextLong();
	}
	public String leerLineaCompleta() {
		return sc.nextLine();
	}
	public char leerCaracter() {
		return sc.next().charAt(0);
	}
	
	public void escribirLineaConSalto(String texto) {
		System.out.println(texto);
	}
	public void quemarLinea() {
		sc.nextLine();
	}
	public boolean leerBooleano() {
		String entrada = leerLineaCompleta();
		if (entrada.toLowerCase().contains("si")) {
			return true;
		}else {
			
			return false;
		}		
	}
	
	public LocalDate leerFecha() {
		String fechaTexto = sc.nextLine();
		LocalDate fecha = LocalDate.parse(fechaTexto);
		return fecha;
	}
	
	public void mostrarMenuPrincipal() {
		escribirLineaConSalto(prop.getProperty("veterinaria.menuprincipal.opcionesprincipales"));
	}
	public void mostrarMenuAnadir() {
		escribirLineaConSalto(prop.getProperty("veterinaria.menuprincipales.opcionesañadir"));
	}
	
	public void mostrarMenuEliminar() {
		escribirLineaConSalto(prop.getProperty("veterinaria.menuprincipales.opcioneseliminar"));
	}
	
	public void mostrarMenuActualizar() {
		escribirLineaConSalto(prop.getProperty("veterinaria.menuprincipales.opcionesactualizar"));
	}
	public void mostrarMenuMostrar() {
		escribirLineaConSalto(prop.getProperty("veterinaria.menuprincipales.opcionesmostrar"));
	}
	public void mostrarMenuReporte() {
		escribirLineaConSalto(prop.getProperty("veterinaria.menuprincipales.opcionesreporte"));
	}
	
	public void mostrarMenuLenguaje() {
		System.out.println("Ingrese el lenguaje que desea ejecutar ne le aplicativo:"
				+"\n 1. Español"
				+"\n 2. English"
				+"\n 3. Deutsch"
				+"\n 4. Italiano");
	}
}
