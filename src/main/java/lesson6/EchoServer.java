package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        Socket socket =null;
        try(ServerSocket serverSocket = new ServerSocket(8189);) {
            System.out.println("Сервер запущен");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            final DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            final DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            while (true){
                final String message =inputStream.readUTF();
                System.out.println("Сообщение от клиента: "+message);
                if ("/end".equalsIgnoreCase(message)){
                    outputStream.writeUTF("/end");
                    break;
                }
                outputStream.writeUTF("Echo: "+message);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сервер  остановлен");
    }
}

