public class AdapterClient {

    public static void main(String[] args) {
        Blog blog = new Blog("Заметка с оригинальным содержанием");

        Picture picture = new Picture("Занимательная картинка.bmp");
        PictureAdapter pictureAdapter = new PictureAdapter(picture);

        Document document = new Document("Руководство по шаблонам проектирования.pdf");
        DocumentAdapter documentAdapter = new DocumentAdapter(document);

        User user = new User();

        user.postContent(blog);
        user.postContent(pictureAdapter);
        user.postContent(documentAdapter);
    }
}
