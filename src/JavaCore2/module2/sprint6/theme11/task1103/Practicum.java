package JavaCore2.module2.sprint6.theme11.task1103;

import com.google.gson.Gson;

import java.io.IOException;

class LikesInfo {
    private boolean hasOwnerLiked;
    private Like[] likes;
    private int repostsCount;
    private LastLikeInfo lastLikeInfo;

    public boolean isHasOwnerLiked() {
        return hasOwnerLiked;
    }

    public void setHasOwnerLiked(boolean hasOwnerLiked) {
        this.hasOwnerLiked = hasOwnerLiked;
    }

    public Like[] getLikes() {
        return likes;
    }

    public void setLikes(Like[] likes) {
        this.likes = likes;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public LastLikeInfo getLastLikeInfo() {
        return lastLikeInfo;
    }

    public void setLastLikeInfo(LastLikeInfo info) {
        this.lastLikeInfo = info;
    }
}

class Like {
    private String name;
    private String avatarUrl;

    public Like() {}

    public Like(String name, String avatarUrl) {
        this.name = name;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}

class LastLikeInfo {
    // ваш код
}

public class Practicum {

    public static void main(String[] args) throws IOException {
        String lastLikeInfoStr = "{ \"user\": \"Алексей\", \"hours\": 12, \"minutes\": 30}";
        LastLikeInfo lastLikeInfo = // код десериализации

                LikesInfo likesInfo = new LikesInfo();
        likesInfo.setRepostsCount(10);
        likesInfo.setHasOwnerLiked(true);
        likesInfo.setLastLikeInfo(lastLikeInfo);
        likesInfo.setLikes(new Like[]{
                new Like("Алексей", "http://example.com/avatars/aleksey.jpg"),
                new Like("Елена", "http://example.com/avatars/elena.jpg"),
                new Like("Света", "http://example.com/avatars/sveta.jpg"),
        });

        // код сериализации
    }
}
/*
Перед вами структура класса социальной сети, описывающего сведения о посте.
В объекте этого класса содержится информация о том, лайкнул ли пост сам автор,
массив лайков, количество репостов, а также информация о последнем лайке.
В каждой ячейке массива хранятся данные об одном лайке — имя и ссылка на фотографию профиля.
В заготовке есть объект класса. Дозаполните его данными, десериализовав информацию
о последнем лайке — она представлена в виде текста String. Сериализуйте полученный
объект информации о лайках в текст и выведите на экран.

Для сериализации используйте объект класса Gson.
После получения сериализованного объекта в виде текста выведите его на экран.
Заполните объект класса информации о последнем лайке и десериализуйте
из значения типа String через методы объекта класса Gson.
 */
