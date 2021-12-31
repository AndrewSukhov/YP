package JavaCore1.module1.sptint2.theme11.task1101;

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things;

    public LostAndFoundOffice() {
        this.things = new ArrayList<>();
    }

    // реализуйте метод put()
    public void put(Object object) {
        this.things.add(object);
    }

    // реализуйте метод check()
    public boolean check(Object target) {
        if (target == null) {
            return false;
        } else {
            for (Object object : things) { // логика проверки вещи в списке
                if (object.equals(target)) {
                    return true;
                }
            }
        }
        return false;
    }
}
