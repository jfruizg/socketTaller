
import CSV.operacionCSV;
import Modelo.pet;
import com.csvreader.CsvReader;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Capitalizer implements Runnable {

    private Socket socket;
    private Socket socketA;


    List<pet> listaPets = new ArrayList<pet>();
    operacionCSV archivo = new operacionCSV();


    public Capitalizer( Socket socket,Socket socketA) {
        this.socket = socket;
        this.socketA = socketA;
        ImportarCSV();
    }

    @Override
    public void run() {

        safePrintln("Connected: " + socket);

        try {



            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);

            while (in.hasNextLine()) {
                var message = in.nextLine();
                safePrintln("La opcion elegida fue " + message + " Crear caso");

                if (message.equals("1")) {
                    String mensajeOpcion1 = "(1) - Perdida" + "\n" + "(2) - Robo" + "\n" + "(3) - Abandono" + "(4) - Animal peligroso" + "\n" + "(5) - Manejo indebido en via publica";
                    out.println("(1) - Perdida / (2) - Robo / (3) - Abandono / (4) - Animal peligroso / (5) - Manejo indebido en via publica");

                    var opcion1 = in.nextInt();
                    safePrintln("La opcion elegida fue " + opcion1);

                    if (opcion1 == 1) {
                        in = new Scanner(socket.getInputStream());

                        out.println("Especie");
                        String especie = in.nextLine();

                        out.println("Tamaño");
                        String tamaño = in.nextLine();

                        out.println("Localidad");
                        String localidad = in.nextLine();

                        out.println("Direccion");
                        String direccion = in.nextLine();

                        out.println("Nombre completo de la persona que reporta");
                        String nombrePersona = in.nextLine();

                        out.println("Telefono");
                        String telefono = in.nextLine();

                        out.println("Correo electronico");
                        String email = in.nextLine();

                        out.println("Comentarios");
                        String comentarios = in.nextLine();

                        safePrintln("----------------------------");
                        safePrintln("Perdida");
                        safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n" + "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n" + "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n" + "Email: " + email + "\n" + "Comentarios: " + comentarios);
                        safePrintln("----------------------------");

                        out.println("El caso esta registrado");

                        pet listaPet = new pet("Perdido", especie, tamaño, localidad, direccion, nombrePersona, telefono, email, comentarios);

                        listaPets.add(listaPet);
                        out.println(listaPets.size());
                        archivo.ExportarCSV(listaPets);
                        archivo.ImportarCSV();


                    }
                    if (opcion1 == 2) {
                        out.println("Especie");
                        var especie = in.nextLine();

                        out.println("Tamaño");
                        var tamaño = in.nextLine();

                        out.println("Localidad");
                        var localidad = in.nextLine();

                        out.println("Direccion");
                        var direccion = in.nextLine();

                        out.println("Nombre completo de la persona que reporta");
                        var nombrePersona = in.nextLine();

                        out.println("Telefono");
                        var telefono = in.nextLine();

                        out.println("Correo electronico");
                        var email = in.nextLine();

                        out.println("Comentarios");
                        var comentarios = in.nextLine();

                        safePrintln("----------------------------");
                        safePrintln("Robo");
                        safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n" + "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n" + "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n" + "Email: " + email + "\n" + "Comentarios: " + comentarios);
                        safePrintln("----------------------------");

                        out.println("El caso esta registrado");

                        pet listaPet = new pet("Robo", especie, tamaño, localidad, direccion, nombrePersona, telefono, email, comentarios);

                        listaPets.add(listaPet);
                        out.println(listaPets.size());
                        archivo.ExportarCSV(listaPets);
                        archivo.ImportarCSV();

                    }
                    if (opcion1 == 3) {
                        out.println("Especie");
                        var especie = in.nextLine();

                        out.println("Tamaño");
                        var tamaño = in.nextLine();

                        out.println("Localidad");
                        var localidad = in.nextLine();

                        out.println("Direccion");
                        var direccion = in.nextLine();

                        out.println("Nombre completo de la persona que reporta");
                        var nombrePersona = in.nextLine();

                        out.println("Telefono");
                        var telefono = in.nextLine();

                        out.println("Correo electronico");
                        var email = in.nextLine();

                        out.println("Comentarios");
                        var comentarios = in.nextLine();

                        safePrintln("----------------------------");
                        safePrintln("Abandono");
                        safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n" + "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n" + "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n" + "Email: " + email + "\n" + "Comentarios: " + comentarios);
                        safePrintln("----------------------------");

                        out.println("El caso esta registrado");

                        pet listaPet = new pet("Abandono", especie, tamaño, localidad, direccion, nombrePersona, telefono, email, comentarios);

                        listaPets.add(listaPet);
                        out.println(listaPets.size());
                        archivo.ExportarCSV(listaPets);
                        archivo.ImportarCSV();


                    }
                    if (opcion1 == 4) {
                        out.println("Especie");
                        var especie = in.nextLine();

                        out.println("Tamaño");
                        var tamaño = in.nextLine();

                        out.println("Localidad");
                        var localidad = in.nextLine();

                        out.println("Direccion");
                        var direccion = in.nextLine();

                        out.println("Nombre completo de la persona que reporta");
                        var nombrePersona = in.nextLine();

                        out.println("Telefono");
                        var telefono = in.nextLine();

                        out.println("Correo electronico");
                        var email = in.nextLine();

                        out.println("Comentarios");
                        var comentarios = in.nextLine();

                        safePrintln("----------------------------");
                        safePrintln("Animal Peligroso");
                        safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n" + "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n" + "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n" + "Email: " + email + "\n" + "Comentarios: " + comentarios);
                        safePrintln("----------------------------");

                        out.println("El caso esta registrado");

                        pet listaPet = new pet("Animal Peligroso", especie, tamaño, localidad, direccion, nombrePersona, telefono, email, comentarios);

                        listaPets.add(listaPet);
                        out.println(listaPets.size());
                        archivo.ExportarCSV(listaPets);
                        archivo.ImportarCSV();

                    }
                    if (opcion1 == 5) {

                        out.println("Especie");
                        var especie = in.nextLine();

                        out.println("Tamaño");
                        var tamaño = in.nextLine();

                        out.println("Localidad");
                        var localidad = in.nextLine();

                        out.println("Direccion");
                        var direccion = in.nextLine();

                        out.println("Nombre completo de la persona que reporta");
                        var nombrePersona = in.nextLine();

                        out.println("Telefono");
                        var telefono = in.nextLine();

                        out.println("Correo electronico");
                        var email = in.nextLine();

                        out.println("Comentarios");
                        var comentarios = in.nextLine();

                        safePrintln("----------------------------");
                        safePrintln("Manejo indebido en via publica");
                        safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n" + "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n" + "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n" + "Email: " + email + "\n" + "Comentarios: " + comentarios);
                        safePrintln("----------------------------");

                        out.println("El caso esta registrado");

                        pet listaPet = new pet("Manejo indebido en via publica", especie, tamaño, localidad, direccion, nombrePersona, telefono, email, comentarios);

                        listaPets.add(listaPet);
                        out.println(listaPets.size());
                        archivo.ExportarCSV(listaPets);
                        archivo.ImportarCSV();


                    }
                } else if (message.equals("2")) {
                    var ina = new Scanner(socketA.getInputStream());
                    var outA = new PrintWriter(socketA.getOutputStream(), true);
                    out = new PrintWriter(socket.getOutputStream(), true);
                    in = new Scanner(socket.getInputStream());

                    boolean aux = true;
                    outA.println("1- para aceptar// 2- para rechazar");
                    String cont = ina.nextLine();

                        while (aux == true) {
                            String mensaje = ina.nextLine();
                            out.println(mensaje);

                            String mensaje2 = in.nextLine();
                            outA.println(mensaje2);
                            mensaje2 = mensaje2.toUpperCase();
                            if (mensaje2.equals("SALIR")) {
                                aux = false;
                            }
                    }
                }
            }
        } catch (Exception e) {
            safePrintln("Error:" + socket);
        } finally {
            try {
                socket.close();
            } catch (Exception e) {
            }
            safePrintln("Closed: " + socket);
        }
    }

    public void safePrintln(String s) {
        synchronized (System.out) {
            System.out.println(s);
        }
    }


    
    //-----------------------------------------------
        public void ImportarCSV () {
            try {

                CsvReader leerPet = new CsvReader("pet.csv");
                leerPet.readHeaders();

                // Mientras haya lineas obtenemos los datos del archivo
                while (leerPet.readRecord()) {
                    String estado = leerPet.get(0);
                    String especie = leerPet.get(1);
                    String tamaño = leerPet.get(2);
                    String localidad = leerPet.get(3);
                    String direccion = leerPet.get(4);
                    String nombre = leerPet.get(5);
                    String telefono = leerPet.get(6);
                    String email = leerPet.get(7);
                    String comentario = leerPet.get(8);


                    listaPets.add(new pet(estado, especie, tamaño, localidad, direccion, nombre, telefono, email, comentario)); // Añade la informacion a la lista
                }

                leerPet.close(); // Cierra el archivo

                // Recorremos la lista y la mostramos en la pantalla

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
