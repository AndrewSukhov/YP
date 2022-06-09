package JavaCore2.module2.sprint6.theme11.task1106.task1;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class Post {
    private int id;
    private String text;
    private List<Comment> commentaries = new ArrayList<>();

    private Post() {}

    public Post(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public void addComment(Comment comment) {
        commentaries.add(comment);
    }

    public int getId() {
        return id;
    }
}

class Comment {
    private String user;
    private String text;

    private Comment() {}

    public Comment(String user, String text) {
        this.user = user;
        this.text = text;
    }
}

public class Practicum {
    private static final int PORT = 8080;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    private static Gson gson = new Gson();
    private static List<Post> posts = new ArrayList<>();

    static {
        Post post1 = new Post(1, "Это первый пост, который я здесь написал.");
        post1.addComment(new Comment("Пётр Первый", "Я успел откомментировать первым!"));
        posts.add(post1);

        Post post2 = new Post(22, "Это будет второй пост. Тоже короткий.");
        posts.add(post2);

        Post post3 = new Post(333, "Это пока последний пост.");
        posts.add(post3);
    }

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        // тут конфигурирование и запуск сервера
        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/posts", new PostsHandler());
        httpServer.start();

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class PostsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            // ваш код
            String method = httpExchange.getRequestMethod();
            System.out.println("Началась обработка /posts запроса от клиента.");
            String response = gson.toJson(posts);
            String pathOfRequest = httpExchange.getRequestURI().getPath();

            if (pathOfRequest.split("/")[2] == null) {
                httpExchange.sendResponseHeaders(200, 0);
                response = gson.toJson(posts);
            }

            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }

        }
    }
}
    /*
Вам необходимо создать HTTP-сервер для небольшой социальной сети.
Пока что он будет возвращать hard coded данные — то есть встроенные
непосредственно в исходный код программы, а не полученные, например, из базы данных.
На вашем сервере должно быть три эндпоинта:

GET /posts — для получения списка всех постов. Этот эндпоинт:
    ничего не принимает на вход;
    возвращает JSON со всеми постами и статус-код 200 OK.
GET /posts/{postId}/comments — для получения комментариев к посту. Этот эндпоинт:
    принимает на вход ID поста;
    возвращает JSON с постом и комментариями к нему или, если пост не найден,
    возвращает статус-код 404 Not Found.
POST /posts/{postId}/comments — для добавления нового комментария к посту. Этот эндпоинт:
    принимает на вход ID поста и JSON с новым комментарием;
    возвращает статус-код 201 Created без тела;
    возвращает статус-код 404 Not Found, если такого поста нет.

    Чтобы отделить первый эндпоинт от остальных, получите путь запроса с помощью
    httpExchange.getRequestURI().getPath(). Условным оператором проверьте,
    заканчивается ли путь на /posts или содержит в себе ещё {postId}/comments.
    Чтобы отделить второй эндпоинт от третьего (GET и POST), получите тип запроса
    с помощью httpExchange.getRequestMethod().
    Используйте Gson для сериализации ответа или десериализации тела запроса,
    в котором будет находиться текст комментария.

    */

