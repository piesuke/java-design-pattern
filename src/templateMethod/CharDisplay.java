package templateMethod;

public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch){
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        // フィールドに保存した文字を表示する
        System.out.print(ch);
    }

    @Override
    public void close() {
         System.out.print(">>");
    }
}
