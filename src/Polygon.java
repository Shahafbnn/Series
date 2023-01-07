public class Polygon {
    private Node<Point> poly;

    public Polygon(){
        this.poly = null;
    }
    public Polygon(Point p) {
        this.poly = new Node<Point>(new Point(p));
    }

    public Polygon(Polygon other){
        this.poly = new Node<Point>(null); // dummy
        Node<Point> last = this.poly;
        Node<Point> ptr = other.poly;
        while(ptr != null){
            last.setNext(new Node<Point>(ptr.getValue()));
            last = last.getNext();
            ptr = ptr.getNext();
        }
        this.poly = this.poly.getNext(); // removing the dummy from list
    }

    public void addPointL(Point p){
        boolean found = false;
        this.poly = new Node<Point>(null, this.poly); // dummy
        Node<Point> ptr = this.poly;
        while(ptr.getNext() != null && !found){
            if(ptr.getNext().getValue().equals(p)) found = true;
            else ptr = ptr.getNext();
        }
        if(!found) ptr.setNext(new Node<Point>(new Point(p)));
        this.poly = this.poly.getNext();
    }

    public void addPointF(Point p){}



}
