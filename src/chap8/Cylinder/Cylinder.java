package chap8.Cylinder;

public class Cylinder {
    public double radius;
    public double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        verifyRadius(radius);
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Exception {
        verifyHeight(height);
        this.height = height;
    }
    private void verifyHeight(double height) throws Exception {
        if (height < 0){
            throw  new Exception("Height must be greater than 0");
        }
    }
    private void verifyRadius(double radius) throws Exception {
        if (radius < 0){
            throw  new Exception("Radius must be greater than 0");
        }
    }
    public double calculateVolume(){
        return  Math.PI * this.radius * this.radius * this.height;
    }
}
