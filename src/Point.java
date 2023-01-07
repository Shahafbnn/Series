public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shiftPoint(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public int quadrant(){
        if (this.x > 0) {
            if(this.y > 0) return 1;
            if(this.y < 0) return 4;
        }
        else if(this.x < 0){
            if(this.y > 0) return 2;
            if(this.y < 0) return 3;
        }
        else{
            if(this.y >= 0) return 1;
            else return 4;
        }
        return -1;
    }

}
