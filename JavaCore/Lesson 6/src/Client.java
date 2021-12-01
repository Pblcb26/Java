/**
 * Lesson 6 lecture
 */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine();
        Socket socket;

        try {
            socket = new Socket("localhost", Server.PORT); //127.0.0.1 поумолчанию локалхост

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));

            PrintWriter printWriter = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())), true);

            printWriter.println(request);
            System.out.println(bufferedReader.readLine());

            bufferedReader.close();
            printWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}