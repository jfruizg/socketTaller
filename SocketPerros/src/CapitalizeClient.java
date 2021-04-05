import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CapitalizeClient {

    public static void main(String[] args) throws Exception {

        try (var socket = new Socket("127.0.0.1", 59897)) {

            System.out.println("Connected: " + socket);
            System.out.println("Bienvenido a pet-citizen -- Ciudadanos de 4 patas");

            System.out.println("(1) - Crear caso"+"\n"+"(2) Hablar con un agente");

            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);


            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                System.out.println(in.nextLine());
            }

        }

    }

}