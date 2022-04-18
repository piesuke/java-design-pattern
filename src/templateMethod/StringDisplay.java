package templateMethod;

public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.length();
    }
    @Override
    public void open() {
       printLine();
    }

    @Override
    public void print() {
        System.out.print("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // openとcloseから呼び出されて文字列を表示するメソッド
    private void  printLine(){
        System.out.print("+");
        for(int i=0; i< width; i++){
             System.out.print("-");
        }
        System.out.print("+");
    }
}
