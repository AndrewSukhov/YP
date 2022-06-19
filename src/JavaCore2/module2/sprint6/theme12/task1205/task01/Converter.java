/*package JavaCore2.module2.sprint6.theme12.task1205.task01;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {

    private final HttpClient client;

    public Converter() {
        client = HttpClient.newHttpClient();;
    }

    private double getRates(String symbol){
        URI url = URI.create("https://api.exchangerate.host/latest?base=RUB&symbols=" + symbol);
        double rate = 0.0;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                // передаем парсеру тело ответа в виде строки, содержащей данные в формате JSON
                JsonElement jsonElement = JsonParser.parseString(response.body());
                if (!jsonElement.isJsonObject()) { // проверяем, точно ли мы получили JSON-объект
                    System.out.println("Ответ от сервера не соответствует ожидаемому.");
                    return rate;
                }
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                JsonObject rates = jsonObject.get("rates").getAsJsonObject();
                rate = rates.get(symbol).getAsDouble();
            }

        } catch (IOException | InterruptedException e) { // обрабатываем ошибки отправки запроса
            System.out.println("Во время выполнения запроса возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
        return rate;
    }

    public void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles * getRates("USD"));
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles * getRates("EUR"));
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles * getRates("JPY"));
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}*/
/*
Доработайте класс Converter.

Добавьте скрытое неизменяемое поле client с типом данных HttpClient. Поле должно быть проинициализировано в публичном конструкторе по умолчанию.
Добавьте метод getRates, который:
    является приватным;
    в качестве параметра принимает символ валюты (например, JPY для японской иены), в которую необходимо конвертировать сумму в рублях;
    возвращает котировку рубля к переданной валюте.
Реализация метода getRate должна запрашивать котировку рубля к валюте, символ которой был передан в параметре. Для получения котировок воспользуйтесь сервисом api.exchangerate.host. Отправьте GET-запрос на эндпоинт /latest и укажите в качестве строки параметров рубль как базовую валюту (параметр base) и переданный символ в качестве котируемой валюты (параметр symbols).
Уберите фиксированные курсы валют. Вместо них при каждом вызове метода convert(double rubles, int currency) запрашивайте актуальный курс рубля к заданной валюте при помощи метода getRate.
Для получения курса рубля к долларам используйте символ USD, для евро — EUR, для иен — JPY.
Исправьте вычисление суммы при конвертации. Учитывайте, что раньше хранился курс других валют к рублю, а сейчас — наоборот.
Доработайте класс FinanceApplication — исправьте создание объекта класса Converter.

Курс валюты — число с плавающей точкой. Метод getRate должен возвращать тип double.
Для получения курса конкретной валюты воспользуйтесь эндпоинтом GET https://api.exchangerate.host/latest.
В качестве базовой валюты укажите рубли (RUB), а символ котируемой валюты (полученный в качестве параметра метода getRate) передайте в параметре строки запроса symbols.
Не забудьте добавить обработку неверного HTTP-кода с помощью ветвления и обработку непредвиденных ошибок с помощью конструкции try...catch.
Для получения значения курса рубля к заданной валюте из JSON воспользуйтесь методами getAsJsonObject(), get(String memberName), getAsDouble().
В зависимости от введённого пользователем порядкового номера валюты currency вызывайте метод getRate(String) с соответствующим кодом валюты. Например, для доллара: converterClient.getRate("USD").
Обратите внимание, что в приложении хранились курсы других валют по отношению к рублю, а API возвращает курс рубля по отношению к другим валютам. Поэтому для получения результата конвертации необходимо умножать текущий баланс на курс, а не делить.

 */
