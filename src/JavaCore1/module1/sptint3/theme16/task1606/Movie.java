package JavaCore1.module1.sptint3.theme16.task1606;

public class Movie implements MediaItem {

    private final String title;
    private final int runtime;

    public Movie(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    @Override
    public int getRuntime() {
        return runtime;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
