package testAutomationUniversityChap6;

public class ChapterSixAMain {
    public static void main(String[] args) {
        /* Create 2 rooms (rectangles), a pool (Circle), and TV (triangle).*/

        /**************
         * Room 1
         *************/
        System.out.println("Room 1");

        //Area
        ChapterSixAShapes room1Rec = new ChapterSixAShapes();
        room1Rec.setLength(100);
        room1Rec.setWidth(150);
        double areaOfRoom1Rec = room1Rec.RecArea();
        System.out.println("The area for Room1 is: " + areaOfRoom1Rec + ":SqFt.");

        //Perimeter
        double periOfRoom1Rec = room1Rec.recPeri();
        System.out.println("The perimeter of Room1 is: " + periOfRoom1Rec + ":Ft\n");

        /**************
         * Room 2
         *************/
     //Area
         ChapterSixAShapes room2Rec = new ChapterSixAShapes(100, 50); // works for specific object/class
        double areaOfRoom2REc = room2Rec.RecArea();
        System.out.println("The area for Room: 2 is " + areaOfRoom2REc + "SqFt.");
        // Perimeter
        double periOfRoom2Rec = room2Rec.recPeri();
        System.out.println("The Perimieter of Room2 is:" + periOfRoom2Rec + "Ft.\n");








        /**************
         * Pool
         *************/
        ChapterSixAShapes poolCircle = new ChapterSixAShapes();
        poolCircle.setRadius(25);
        double areaOfPool = poolCircle.CirArea();
        System.out.println("The Area of the Pool is: " + poolCircle.CirArea());
        double perimOfPool = poolCircle.cirPero();
        System.out.println("The Perimeter of the pool is " + poolCircle.cirPero()+"\n");



        /**************
         * T.V.
         *************/

        ChapterSixAShapes tV = new ChapterSixAShapes();
        Double areaOfTv = tV.triArea(5,3);
        System.out.println("The Area of the T.V. is " + tV.triArea(5,3) + ".");
        double periTV = tV.triPeri(3, 3, 5);
        System.out.println("The Perimeter of the T.V. is " + tV.triPeri(3, 3, 5) + "\n");

        /*******************
         * Total Area and Perimeter of the Home.
         ******************/

        ChapterSixAShapes houseSize = new ChapterSixAShapes();
        Double areaOfHouse = room1Rec.RecArea() + room2Rec.RecArea();
        System.out.println("the total area of the house not including the tv and pool is: " + areaOfHouse + "SwFt.");
        double areaOfhouseWith = room1Rec.RecArea() + room2Rec.RecArea() + poolCircle.CirArea() + tV.triArea(3,3);
        System.out.println("The area of the Total house is: " + areaOfhouseWith);
        double housePerimeter = room1Rec.recPeri() + room1Rec.recPeri() + poolCircle.recPeri() + tV.triPeri(3, 3, 5);
        System.out.println("The total Perimeter of this House is: " + housePerimeter);












    }
}
