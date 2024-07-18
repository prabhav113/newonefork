package high;

public class prog1 {
    public static void main(String[] args)
    {
        Camera c1=new Camera();
        System.out.println("Color : " +c1.color);
        System.out.println("ISO : "  +c1.iso);
        System.out.println("Resolution : " +c1.resolution);
        c1.cameraImage();
        c1.cameraImage();
    }
}
class Camera
{
    String color="Black";
    double iso = 72.56;
    double resolution = 728.90;

    public void cameraImage()
    {
        System.out.println("Camera Image");

    }

    public void cameraVideo()
    {
        System.out.println("Camera Video");
    }
}