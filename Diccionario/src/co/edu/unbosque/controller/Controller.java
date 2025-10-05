package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.Properties;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.TraduccionDTO;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.Consola;

public class Controller {

    private Consola con;
    private ModelFacade mf;

    
    private Properties spa;
    private Properties eng;
    private Properties fra;
    private Properties ger;
    private Properties ita;
    private Properties jap;
    private Properties kor;
    private Properties por;
    private Properties rus;
    private Properties chi;

    public Controller() {
    	
        con = new Consola();
        mf = new ModelFacade();

       
        spa = FileHandler.cargarArchivoDePropiedades("spa.properties");
        eng = FileHandler.cargarArchivoDePropiedades("eng.properties");
        fra = FileHandler.cargarArchivoDePropiedades("fra.properties");
        ger = FileHandler.cargarArchivoDePropiedades("ger.properties");
        ita = FileHandler.cargarArchivoDePropiedades("ita.properties");
        jap = FileHandler.cargarArchivoDePropiedades("jap.properties");
        kor = FileHandler.cargarArchivoDePropiedades("kor.properties");
        por = FileHandler.cargarArchivoDePropiedades("por.properties");
        rus = FileHandler.cargarArchivoDePropiedades("rus.properties");
        chi = FileHandler.cargarArchivoDePropiedades("chi.properties");
    }

    public void run() {
        boolean salir = false;

        while (!salir) {
            con.mostrarMenu();
            
            int opcion = 0;
            try {
                opcion = Integer.parseInt(con.leerLineaCompleta());
            } catch (NumberFormatException e) {
                con.escribirLineaConSalto("Debe ingresar un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    con.escribirLineaConSalto("Ingrese una palabra para detectar su idioma:");
                    String palabra = con.leerLineaCompleta();

                    if (palabra == null || palabra.trim().isEmpty()) {
                        con.escribirLineaConSalto("No ingresó ninguna palabra.");
                        break;
                    }
                    
                   

                    String idiomaDetectado = null;
                    String palabraClave = null;

                  
                    for (String key : spa.stringPropertyNames()) {
                        if (spa.getProperty(key).equals(palabra)) {
                            idiomaDetectado = "Español";
                            palabraClave = key;
                            break;
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : eng.stringPropertyNames()) {
                            if (eng.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Inglés";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : fra.stringPropertyNames()) {
                            if (fra.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Francés";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : ger.stringPropertyNames()) {
                            if (ger.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Alemán";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : ita.stringPropertyNames()) {
                            if (ita.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Italiano";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : jap.stringPropertyNames()) {
                            if (jap.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Japonés";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : kor.stringPropertyNames()) {
                            if (kor.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Coreano";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : por.stringPropertyNames()) {
                            if (por.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Portugués";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : rus.stringPropertyNames()) {
                            if (rus.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Ruso";
                                palabraClave = key;
                                break;
                            }
                        }
                    }
                    if (idiomaDetectado == null) {
                        for (String key : chi.stringPropertyNames()) {
                            if (chi.getProperty(key).equals(palabra)) {
                                idiomaDetectado = "Chino";
                                palabraClave = key;
                                break;
                            }
                        }
                    }

                    if (idiomaDetectado == null) {
                        con.escribirLineaConSalto("No se pudo detectar el idioma.");
                        break;
                    }

                    con.escribirLineaConSalto("Idioma detectado: " + idiomaDetectado);

                   
                    switch (idiomaDetectado) {
                        case "Español":
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Inglés":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Francés":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Alemán":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Italiano":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Japonés":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Coreano":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Portugués":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Ruso":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Chino: " + chi.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, chi.getProperty(palabraClave), idiomaDetectado));
                            break;

                        case "Chino":
                            con.escribirLineaConSalto("Español: " + spa.getProperty(palabraClave));
                            con.escribirLineaConSalto("Inglés: " + eng.getProperty(palabraClave));
                            con.escribirLineaConSalto("Francés: " + fra.getProperty(palabraClave));
                            con.escribirLineaConSalto("Alemán: " + ger.getProperty(palabraClave));
                            con.escribirLineaConSalto("Italiano: " + ita.getProperty(palabraClave));
                            con.escribirLineaConSalto("Japonés: " + jap.getProperty(palabraClave));
                            con.escribirLineaConSalto("Coreano: " + kor.getProperty(palabraClave));
                            con.escribirLineaConSalto("Portugués: " + por.getProperty(palabraClave));
                            con.escribirLineaConSalto("Ruso: " + rus.getProperty(palabraClave));

                            mf.getTDAO().create(new TraduccionDTO(palabra, spa.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, eng.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, fra.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ger.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, ita.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, jap.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, kor.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, por.getProperty(palabraClave), idiomaDetectado));
                            mf.getTDAO().create(new TraduccionDTO(palabra, rus.getProperty(palabraClave), idiomaDetectado));
                            break;
                    }
                    break;

                case 2:
                    ArrayList<TraduccionDTO> lista = mf.getTDAO().getAll();
                    if (lista.isEmpty()) {
                        con.escribirLineaConSalto("No se han traducido palabras.");
                    } else {
                    	for (TraduccionDTO t : lista) {
                    		
                    		String idiomaTraduccion = obtenerIdiomaTraduccion(t.getPalabraTraducida());
                    	    con.escribirLineaConSalto(
                    	        "Palabra original: " + t.getPalabraATraducir() +
                    	        "\n Traducción al " + idiomaTraduccion + ":" + t.getPalabraTraducida() +
                    	        "\nIdioma detectado: " + t.getIdiomaDetectado() + "\n"
                    	    );
                    	}
                    }
                    break;

                case 3:
                    salir = true;
                    con.escribirLineaConSalto("Gracias por utilizar el aplicativo!");
                    break;

                default:
                    con.escribirLineaConSalto("Opción inválida.");
                    break;
            }
            
        }
    }
    private String obtenerIdiomaTraduccion(String palabraTraducida) {
        if (spa.containsValue(palabraTraducida)) {
            return "Español";
        }
        if (eng.containsValue(palabraTraducida)) {
            return "Inglés";
        }
        if (fra.containsValue(palabraTraducida)) {
            return "Francés";
        }
        if (ger.containsValue(palabraTraducida)) {
            return "Alemán";
        }
        if (ita.containsValue(palabraTraducida)) {
            return "Italiano";
        }
        if (jap.containsValue(palabraTraducida)) {
            return "Japonés";
        }
        if (kor.containsValue(palabraTraducida)) {
            return "Coreano";
        }
        if (por.containsValue(palabraTraducida)) {
            return "Portugués";
        }
        if (rus.containsValue(palabraTraducida)) {
            return "Ruso";
        }
        if (chi.containsValue(palabraTraducida)) {
            return "Chino";
        }
        return "Idioma desconocido";
    }
}
