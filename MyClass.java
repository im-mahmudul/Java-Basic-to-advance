class Point {
    int x, y;
    static int c;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        c++;
    }

    
}

public class MyClass {
  public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        new Point(10, 10);
        new Point(3, 4);
        Point.c++;
        System.out.println(new Point(7, 8).c);
//        System.out.println(p2.x);
//        System.out.println(p3.y);
    }
}