public class Main {
    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        System.out.println(p2.getXY()[1] + " " + p2.getXY()[0]);

        Point3D p3 = new Point3D(1, 2, 3);

        System.out.println(p3.toString());

    }
}