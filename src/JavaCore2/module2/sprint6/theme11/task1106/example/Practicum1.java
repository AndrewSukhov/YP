package JavaCore2.module2.sprint6.theme11.task1106.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Practicum1 {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {

            String method = httpExchange.getRequestMethod();
            System.out.println("Началась обработка " + method + " /hello запроса от клиента.");

            String response;
            switch(method) {
                case "POST":
                    response = "Вы использовали метод POST!";
                    break;
                case "GET":
                    response = "Вы использовали метод GET!";
                    break;
                default:
                    response = "Вы использовали какой-то другой метод!";
            }

            httpExchange.sendResponseHeaders(200, 0);

            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}
/*
String getRequestMethod()
getRequestMethod() возвращает HTTP-метод, который клиент использовал при отправке запроса.
По нему сервер определяет, какое действие нужно выполнить. С помощью этого метода можно
сделать из одного эндпоинта /hello несколько.
*/