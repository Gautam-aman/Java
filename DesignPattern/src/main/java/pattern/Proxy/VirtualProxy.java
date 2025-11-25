package pattern.Proxy;

interface Image{
    public void displayImage();
}

class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void displayImage() {
        System.out.println("Display Real Image "+fileName);
    }
}

class ImageProxy implements Image{
    private RealImage image;
    private String fileName;
    public ImageProxy(String fileName) {
       this.fileName = fileName;
       image = null;
    }
    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(fileName);
        }
       image.displayImage();
    }
}

public class VirtualProxy {
    public static void main(String[] args) {
        Image newimage = new ImageProxy("Photo1");
        newimage.displayImage();
    }
}
