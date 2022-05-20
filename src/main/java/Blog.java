public class Blog implements IPostable {
    private String article;

    public Blog(String article) {
        this.article = article;
    }

    @Override
    public void post() {
        System.out.println("Размещаем статью: " + article);
    }
}
