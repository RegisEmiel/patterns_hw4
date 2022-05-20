public class Document {
    private String article;

    public Document(String article) {
        this.article = article;
    }

    public void publishing() {
        System.out.println("Публикуем документ: " + article);
    }
}
