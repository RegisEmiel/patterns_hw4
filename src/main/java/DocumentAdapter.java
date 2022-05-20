public class DocumentAdapter implements IPostable{
    protected Document document;

    public DocumentAdapter(Document document) {
        this.document = document;
    }

    @Override
    public void post() {
        document.publishing();
    }
}
