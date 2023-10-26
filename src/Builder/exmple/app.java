package Builder.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/24 22:21
 */

public class app {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director textDirector = new Director(textBuilder);
        textDirector.construct();
        System.out.println(textBuilder.getResult());
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        new Director(htmlBuilder).construct();
        System.out.println(htmlBuilder.getResult());

    }
}
