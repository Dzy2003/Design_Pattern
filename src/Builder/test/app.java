package Builder.test;


import java.time.LocalDateTime;

/**
 * @author 白日
 * @date Created in 2023/10/25 21:21
 */

public class app {
    public static void main(String[] args) {
        Article article = new Article.ArticleBuilder(1l, "母猪的产后护理", 2l)
                .setBodyId(2l)
                .setCategoryId(3l)
                .setCommentCounts(3)
                .setLiked(0)
                .setSummary("详细论述了母猪的产后护理细节")
                .setCreateDate(System.currentTimeMillis())
                .Build();
        System.out.println(article);

    }
}
