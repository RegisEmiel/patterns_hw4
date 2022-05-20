public class Picture {
    private String article;

    public Picture(String article) {
        this.article = article;
    }

    public void loadImage() {
        System.out.println("Загрузка изображения: " + article);
    };
}
