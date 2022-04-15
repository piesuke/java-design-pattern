package adapter;

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeek() {
        showWithPattern();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
