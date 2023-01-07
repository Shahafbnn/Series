public class Cube {
    private int length;
    private String color;

    public Cube(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public Cube() {
        this.length = 10;
        this.color = "White";
    }

    public Cube(Cube other) {
        this.length = other.length;
        this.color = other.color;
    }

    public int getLength() {
        return this.length;
    }

    public String getColor() {
        return this.color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return this.length * this.length * this.length;
    }

    public int getSurface() {
        return this.length * this.length;
    }

    public boolean isBigger(Cube other) {
        return this.getVolume() > other.getVolume();
    }

    public boolean equals(Cube other) {
        return  ((this.color.equals(other.color)) && (this.getVolume() == other.getVolume()));
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}