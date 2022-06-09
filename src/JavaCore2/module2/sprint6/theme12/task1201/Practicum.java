package JavaCore2.module2.sprint6.theme12.task1201;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class Practicum {

    public static void main(String[] args) throws IOException, InterruptedException {
        // укажите URL-адрес ресурса
        URI uri = URI.create("https://ya.ru/white");

        // создайте объект, описывающий HTTP-запрос
        //HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();
        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

        // создайте HTTP-клиент с настройками по умолчанию
        HttpClient client = HttpClient.newHttpClient();

        // получите стандартный обработчик тела запроса
        // с конвертацией содержимого в строку
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        // отправьте запрос
        HttpResponse<String> response = client.send(request, handler);

        // выведите код состояния и тело ответа
        System.out.println("Код ответа: " + response.statusCode());
        System.out.println("Тело ответа: " + response.body());
    }
}
/*
Откройте в браузере страницу https://ya.ru/white.
С помощью инструментов разработчика посмотрите её код.
Затем напишите HTTP-клиент и сделайте аналогичный запрос. Сравните результаты.

Создайте HTTP-клиент с помощью метода HttpClient.newHttpClient().
Чтобы задать адрес страницы, используйте метод URI.create("https://ya.ru/white").
Для создания запроса воспользуйтесь конструкцией HttpRequest.newBuilder().uri(uri).GET().build().
Чтобы отправить запрос, используйте метод send(HttpRequest request, BodyHandler responseBodyHandler).
Для получения HTTP-кода и тела ответа воспользуйтесь методами statusCode() и body().
 */
