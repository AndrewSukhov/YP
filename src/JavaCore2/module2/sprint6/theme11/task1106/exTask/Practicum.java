package JavaCore2.module2.sprint6.theme11.task1106.exTask;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Practicum {
    /*private static final int PORT = 8080;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response;

            // извлеките метод из запроса
            String method = httpExchange.getRequestMethod();

            switch(method) {
                // сформируйте ответ в случае, если был вызван POST-метод
                case "POST":
                    // извлеките тело запроса
                    InputStream inputStream = httpExchange.getRequestBody();
                    String body = new String(inputStream.readAllBytes(), DEFAULT_CHARSET);

                    // извлеките path из запроса
                    String path = httpExchange.getRequestURI().getPath();
                    // а из path — профессию и имя
                    String profession = path.split("/")[2];
                    String name = path.split("/")[3];

                    // извлеките заголовок
                    
                    List<String> wishGoodDay = ...

                    // соберите ответ
                    response = ...
                    // не забудьте про ответ для остальных методов
            }

            httpExchange.sendResponseHeaders(200, 0);
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }*/
}
/*
Реализуйте API со следующей логикой:

Для метода GET /hello всегда возвращается один ответ — «Здравствуйте!».
Для метода POST /hello/{профессия}/{имя}:
    Тело запроса считается приветствием.
    Если передан заголовок X-Wish-Good-Day=true,
    возвращается ответ вида «{приветствие}, {профессия} {имя}! Хорошего дня!».
    Например, на запрос /hello/программист/Егор, заголовок wishGoodDay=true
    и тело запроса Доброе утро корректный ответ —
    «Доброе утро, программист Егор! Хорошего дня!».
    Если заголовок отсутствует, возвращается ответ вида
    «{приветствие}, {профессия} {имя}!».
Для любого другого метода выводится сообщение об ошибке «Некорректный метод!».

Будьте внимательны! При возникновении ошибки (например, NullPointerException)
в консоли не будет отображаться никакой информации, поэтому тестируйте аккуратно!

Получить HTTP-метод можно с помощью httpExchange.getRequestMethod().
Так как нужно тело запроса из одной строки, можно воспользоваться
методом bufferedReader.readLine();.
Получить профессию и имя из запроса можно с помощью следующего кода.

  String path = httpExchange.getRequestURI().getPath();
  String[] splitStrings = path.split("/");
  String profession = splitStrings[2];
  String name = splitStrings[3];


Проверить нужный заголовок поможет этот код.

  List<String> wishGoodDay = requestHeaders.get("X-Wish-Good-Day");
  if ((wishGoodDay != null) && (wishGoodDay.contains("true"))) {
      ...
  }

 */