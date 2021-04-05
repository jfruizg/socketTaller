package CSV;

import Modelo.pet;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class operacionCSV {



    public void ExportarCSV(List<pet> pets) {
        String salidaArchivo = "pet.csv"; // Nombre del archivo
        boolean existe = new File(salidaArchivo).exists(); // Verifica si existe

        // Si existe un archivo llamado asi lo borra
        if(existe) {
            File archivoUsuarios = new File(salidaArchivo);
            archivoUsuarios.delete();
        }

        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');

            // Datos para identificar las columnas
            salidaCSV.write("Estado");
            salidaCSV.write("Especie");
            salidaCSV.write("Tamaño");
            salidaCSV.write("Localidad");
            salidaCSV.write("Direccion");
            salidaCSV.write("Nombre dueño");
            salidaCSV.write("Telefono");
            salidaCSV.write("Email");
            salidaCSV.write("Comentarios");

            salidaCSV.endRecord(); // Deja de escribir en el archivo

            // Recorremos la lista y lo insertamos en el archivo
            for(pet listaPet : pets) {
                salidaCSV.write(listaPet.getEstado());
                salidaCSV.write(listaPet.getEspecie());
                salidaCSV.write(listaPet.getTamaño());
                salidaCSV.write(listaPet.getLocalidad());
                salidaCSV.write(listaPet.getDireccion());
                salidaCSV.write(listaPet.getNombre());
                salidaCSV.write(listaPet.getTelefono());
                salidaCSV.write(listaPet.getEmail());
                salidaCSV.write(listaPet.getComentarios());


                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }

            salidaCSV.close(); // Cierra el archivo

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void ImportarCSV() {
        try{
            List<pet> pets = new ArrayList<pet>(); // Lista donde guardaremos los datos del archivo

            CsvReader leerPet = new CsvReader("pet.csv");
            leerPet.readHeaders();

            // Mientras haya lineas obtenemos los datos del archivo
            while(leerPet.readRecord()) {
                String estado = leerPet.get(0);
                String especie = leerPet.get(1);
                String tamaño = leerPet.get(2);
                String localidad = leerPet.get(0);
                String direccion = leerPet.get(1);
                String nombre = leerPet.get(2);
                String telefono = leerPet.get(0);
                String email = leerPet.get(1);
                String comentario = leerPet.get(2);


                pets.add(new pet(estado, especie, tamaño,localidad,direccion,nombre,telefono,email,comentario)); // Añade la informacion a la lista
            }

            leerPet.close(); // Cierra el archivo

            // Recorremos la lista y la mostramos en la pantalla

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

