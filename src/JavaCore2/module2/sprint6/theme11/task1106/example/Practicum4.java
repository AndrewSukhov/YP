package JavaCore2.module2.sprint6.theme11.task1106.example;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Practicum4 {
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
            System.out.println("Началась обработка /hello запроса от клиента.");

            Headers headers = httpExchange.getResponseHeaders();
            headers.set("Content-Type", "text/plain");
            headers.set("X-your-own-header", "any-information-you-want");
            headers.set("X-your-own-header-2", "any-information-you-want-2");

            String response = "Привет! Рады видеть на нашем сервере.";
            httpExchange.sendResponseHeaders(200, 0);

            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}
/*
Установка заголовков ответа
Headers getResponseHeaders()
С помощью этого метода можно добавить к ответу HTTP-заголовки.
Метод getResponseHeaders() возвращает объект класса Headers.
Все дальнейшие манипуляции по редактированию заголовков выполняются с этим объектом.

Headers headers = httpExchange.getResponseHeaders();

// Content-Type — это один из стандартных заголовков
// с его помощью клиент понимает, в каком формате пришло тело ответа
// text/plain означает, что ответ состоит из простого текста
headers.set("Content-Type", "text/plain");

// можно создать свои собственные заголовки
headers.set("X-your-own-header", "any-information-you-want");
headers.set("X-your-own-header-2", "any-information-you-want-2");

Запустите код и обратите внимание на заголовки ответа в Insomnia.
http://localhost:8080/hello
*/