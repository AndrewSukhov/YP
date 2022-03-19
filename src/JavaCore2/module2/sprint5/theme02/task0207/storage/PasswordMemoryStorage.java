package JavaCore2.module2.sprint5.theme02.task0207.storage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PasswordMemoryStorage implements PasswordStorage {
    private static final Map<String, String> passwords = new HashMap<>();
    private boolean wasOpened = false;

    private boolean shouldErrorBeGenerated() {
        Random random = new Random();
        return random.nextInt(100) == 0;
    }

    @Override
    public void open() throws IOException {
        if (shouldErrorBeGenerated()) {
            throw new IOException("Произошла внезапная ошибка");
        }
        wasOpened = true;
    }

    @Override
    public void store(final String user, final String password) throws IOException {
        if (!wasOpened) {
            throw new IOException("Хранилище не открыто");
        }
        if (shouldErrorBeGenerated()) {
            throw new IOException("Произошла внезапная ошибка");
        }
        passwords.put(user, password);
    }

    @Override
    public String get(final String user) throws IOException {
        if (!wasOpened) {
            throw new IOException("Хранилище не открыто");
        }
        if (shouldErrorBeGenerated()) {
            throw new IOException("Произошла внезапная ошибка");
        }
        return passwords.get(user);
    }

    @Override
    public void close() {
        if (wasOpened) {
            System.out.println("close action");
        }
    }
}
