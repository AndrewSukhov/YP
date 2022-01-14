package JavaCore1.module1.sptint3.theme16.task1601;

public abstract class Pet {

    protected String voice;

    public Pet (String voice) {
        this.voice = voice;
    }

    public void sleep(){
        System.out.println("Сплю");
    }
    public void play() {
        System.out.println("Играю");
    }

    public String getVoice() {
        return this.voice;
    }

    public void giveVoice() {
        System.out.println(getVoice());
    }
}
