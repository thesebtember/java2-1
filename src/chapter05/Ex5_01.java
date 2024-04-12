package chapter05;

public class Ex5_01 {

    public static void main(String[] args) {
        Point p = new Point();
        p.set(1, 2);
        p.showpoint();

        ColorPoint cp= new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}

class Point {
    private int x,y;
    public void set(int x, int y) {
        this.x =x;
        this.y = y;
    }
    public void showpoint(){
        System.out.println("(" + x + "," + y
    }
}
