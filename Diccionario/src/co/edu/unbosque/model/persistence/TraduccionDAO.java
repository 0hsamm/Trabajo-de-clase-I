package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Traduccion;
import co.edu.unbosque.model.TraduccionDTO;

public class TraduccionDAO implements DAO<Traduccion, TraduccionDTO> {

    private ArrayList<Traduccion> listaTraduccion;

    private final String FILE_NAME = "Traduccion.csv";
    private final String SERIAL_FILE_NAME = "Traduccion.bin";

    public TraduccionDAO() {
        listaTraduccion = new ArrayList<>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    @Override
    public void create(TraduccionDTO newData) {
        Traduccion entity = new Traduccion(
            newData.getPalabraATraducir(),
            newData.getPalabraTraducida(),
            newData.getIdiomaDetectado()
        );

        listaTraduccion.add(entity);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    @Override
    public String showAll() {
        if (listaTraduccion.isEmpty()) {
            return "No hay traducciones registradas.\n";
        }

        StringBuilder sb = new StringBuilder();
        for (Traduccion t : listaTraduccion) {
            sb.append("Palabra original: ").append(t.getPalabraATraducir())
              .append("\nTraducción: ").append(t.getPalabraTraducida())
              .append("\nIdioma detectado: ").append(t.getIdiomaDetectado())
              .append("\n\n");
        }
        return sb.toString();
    }

    @Override
    public void leerDesdeArchivoDeTexto(String url) {
        String contenido = FileHandler.leerDesdeArchivoDeTexto(url);

        if (contenido == null || contenido.isBlank()) {
            return;
        }

        String[] filas = contenido.split("\n");
        for (String fila : filas) {
            String[] columnas = fila.split(";");
            if (columnas.length < 3) continue;

            Traduccion temp = new Traduccion();
            temp.setPalabraATraducir(columnas[0]);
            temp.setPalabraTraducida(columnas[1]);
            temp.setIdiomaDetectado(columnas[2]);

            listaTraduccion.add(temp);
        }
    }

    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();

        for (Traduccion t : listaTraduccion) {
            sb.append(t.getPalabraATraducir()).append(";")
              .append(t.getPalabraTraducida()).append(";")
              .append(t.getIdiomaDetectado()).append("\n");
        }

        FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
    }

    @Override
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);

        if (contenido != null) {
            listaTraduccion = (ArrayList<Traduccion>) contenido;
        } else {
            listaTraduccion = new ArrayList<>();
        }
    }

    @Override
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaTraduccion);
    }

    public ArrayList<TraduccionDTO> getAll() {
        ArrayList<TraduccionDTO> listaDTO = new ArrayList<>();
        for (Traduccion t : listaTraduccion) {
            listaDTO.add(new TraduccionDTO(
                t.getPalabraATraducir(),
                t.getPalabraTraducida(),
                t.getIdiomaDetectado()
            ));
        }
        return listaDTO;
    }
}
