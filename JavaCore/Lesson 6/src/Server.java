/**
 * Lesson 6 lecture
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int PORT = 1337; //Leet

    public static void main(String[] args) {

        ServerSocket serverSocket;

        try {;
            serverSocket = new ServerSocket(Server.PORT); //127.0.0.1 по-умолчанию локалхост
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));


            PrintWriter printWriter = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())), true);

            String request = bufferedReader.readLine();
            if (request.equals("собаки")) {
                printWriter.println("Картинки собак отправятся клиенту");
            } else if (request.equals("кошки")) {
                printWriter.println("Картинки кошек отправятся клиенту");
            }

            bufferedReader.close();
            printWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}