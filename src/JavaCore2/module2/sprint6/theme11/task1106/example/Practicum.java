package JavaCore2.module2.sprint6.theme11.task1106.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Practicum {
    private static final int PORT = 8080;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

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

            InputStream inputStream = httpExchange.getRequestBody();
            String body = new String(inputStream.readAllBytes(), DEFAULT_CHARSET);
            System.out.println("Тело запроса:\n" + body);

            String response = "Привет! Рады видеть на нашем сервере.";
            httpExchange.sendResponseHeaders(200, 0);

            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}
/*
InputStream getRequestBody()
Метод возвращает тело запроса, то есть данные, которые клиент отправил на сервер.
Это может быть JSON, простой текст (англ. plain text), картинка, любой файл —
спецификация HTTP не устанавливает ограничений для типа данных. Важно, чтобы
клиент мог закодировать их в бинарном виде, то есть в виде нулей и единиц,
а сервер — правильно раскодировать и обработать. Поэтому со стороны сервера
иногда добавляются дополнительные проверки на тип передаваемых в запросе данных,
на их размер и так далее.
Так как метод getRequestBody() возвращает InputStream, входящий поток необходимо обработать.
Можно, например, считать из него массив байтов методом inputStream.readAllBytes(),
а затем с помощью конструктора String сконвертировать в строковый тип:

Проверьте работу метода getRequestBody(). Скопируйте код в IDEA, запустите его и отправьте
запрос с телом на http://localhost:8080/hello с помощью Insomnia.
* */