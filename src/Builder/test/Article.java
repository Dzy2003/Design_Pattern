package Builder.test;

/**
 * @author 白日
 * @date Created in 2023/10/25 21:08
 */

public class Article {

    private Long id;
    private String title;
    private String summary;
    private Integer commentCounts;
    private Integer viewCounts = 0;
    private Long authorId;
    private Long bodyId;
    private Long categoryId;
    private Long createDate;
    private Integer liked;

    public Article(ArticleBuilder articleBuilder){
        this.id = articleBuilder.id;
        this.title = articleBuilder.title;
        this.summary = articleBuilder.summary;
        this.commentCounts = articleBuilder.commentCounts;
        this.authorId = articleBuilder.authorId;
        this.bodyId = articleBuilder.bodyId;
        this.categoryId = articleBuilder.categoryId;
        this.createDate = articleBuilder.createDate;
        this.liked = articleBuilder.liked;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", commentCounts=" + commentCounts +
                ", viewCounts=" + viewCounts +
                ", authorId=" + authorId +
                ", bodyId=" + bodyId +
                ", categoryId=" + categoryId +
                ", createDate=" + createDate +
                ", liked=" + liked +
                '}';
    }

    public static class ArticleBuilder{
        private Long id;
        private String title;
        private String summary;
        private Integer commentCounts;
        private Long authorId;
        private Long bodyId;
        private Long categoryId;
        private Long createDate;
        private Integer liked;

        public ArticleBuilder(Long id,String title,Long authorId){
            this.id = id;
            this.title = title;
            this.authorId = authorId;
        }

        public ArticleBuilder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public ArticleBuilder setCommentCounts(Integer commentCounts) {
            this.commentCounts = commentCounts;
            return this;
        }

        public ArticleBuilder setBodyId(Long bodyId) {
            this.bodyId = bodyId;
            return this;
        }

        public ArticleBuilder setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public ArticleBuilder setCreateDate(Long createDate) {
            this.createDate = createDate;
            return this;
        }

        public ArticleBuilder setLiked(Integer liked) {
            this.liked = liked;
            return this;
        }
        public Article Build(){
            return new Article(this);
        }
    }
}