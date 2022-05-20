public class PictureAdapter implements IPostable{
    protected Picture picture;

    public PictureAdapter(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void post() {
        this.picture.loadImage();
    }
}
