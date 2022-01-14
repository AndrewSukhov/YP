package JavaCore1.module1.sptint3.theme16.task1601;

public class Spider extends Pet{

    private static int pawsCount = 8;

    public Spider(String voice) {
        super(voice);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void giveVoice() {
        super.giveVoice();
    }

    public static int getPawsCount() {
        return pawsCount;
    }
}
