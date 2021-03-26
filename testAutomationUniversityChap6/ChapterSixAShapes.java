package testAutomationUniversityChap6;

public class ChapterSixAShapes {
   private double legnth;
    private double width;
    private double radius;
    private double base;
    private double height;

    public ChapterSixAShapes(){
        legnth = 0;
        width = 0;
        radius = 0;
        base = 0;
        height = 0;

    }


    //REC
    public ChapterSixAShapes (double length, double width){
        this.legnth = length;
        setWidth(width);
        System.out.println(length * width);
    }

    double recPeri(){
        return (2 * legnth) + (2 * width);
    }

    double RecArea(){
        return legnth * width;
    }

    // Setters and Getters

    double GetLength(){
        return legnth;
    }

    void setLength (double length){
        this.legnth = length;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width = width;
    }


    //Circle
    double  CirArea(){
        return (Math.PI * Math.pow(radius, 2));

    }

    double cirPero (){
        return 2 * Math.PI * radius;
    }

    // Setters and Getters

    double getRadius(){
        return radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }


    // Tri
    double triArea(double base, double height){
            return (base * height);
    }

    double triPeri(double s1, double s2, double s3){
        return s1 + s2 + s3;
    }

    // Setters and Getters

    double getBase(){
        return base;
    }

    void setBase(double base){
        this.base = base;
    }

    void getHeight(double height){
        this.height = height;
    }

}
