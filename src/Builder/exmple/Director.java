package Builder.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/24 21:17
 */

public class Director {
    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");

        builder.makeString("从早上至下午");

        builder.makeItem(new String[]{"早上好", "下午好"});

        builder.makeString("晚上");

        builder.makeItem(new String[]{"晚上好","晚安","再见"});

        builder.close();
    }
}
