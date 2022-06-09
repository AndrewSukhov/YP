package JavaCore2.module2.sprint6.theme12.task1203;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        // укажите URL запроса, включая его параметры
        URI url = ...;

        // создайте объект, описывающий запрос с необходимой информацией
        HttpRequest request = ...;

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Код статуса: " + response.statusCode());
            System.out.println("Ответ: " + response.body());
        } catch (IOException | InterruptedException e) { // обработка ошибки отправки запроса
            System.out.println("Во время выполнения запроса ресурса по URL-адресу: '" + url + "' возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
    }
}
/*
Напишите HTTP-клиент, который будет работать
с API api.exchangerate.host и получать от него курсы валют.
Клиент должен отправлять GET-запрос по адресу https://api.exchangerate.host/convert.
Необходимо добавить два параметра:

base — параметр, указывающий базовую валюту для конвертации;
symbols — параметр, в котором через запятую перечислены
все необходимые валюты для конвертации.
Параметр base должен быть равен RUB, а параметр symbols — USD,EUR.
Ответ от сервера нужен в формате JSON.

Чтобы задать адрес, используйте метод URI.create(String str).
Добавить заголовок к запросу можно с помощью метода header(String name, String value).
Для получения ответа от сервера в формате JSON укажите в запросе
заголовок Accept со значением application/json.
 */
