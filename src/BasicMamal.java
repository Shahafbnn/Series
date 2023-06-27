public class BasicMamal extends BareBonesMamal implements IPreg, IMilk{
    private int pregTime;
    private int milkLiters;
    public BasicMamal(String name, String familyName, String scientificName, short lifeLen, int children, int pregTime, int milkLiters){
        super(name, familyName, scientificName, lifeLen, children);
        this.pregTime = pregTime;
        this.milkLiters = milkLiters;
    }
    @Override
    public void preg() {
        System.out.println("Birthes " + getChildren() + " children");
    }

    @Override
    public void milk() {
        System.out.println("Gives "+ milkLiters +" Litres of milk");
    }

    public int getPregTime() {
        return pregTime;
    }

    public void setPregTime(int pregTime) {
        this.pregTime = pregTime;
    }

    public int getMilkLiters() {
        return milkLiters;
    }

    public void setMilkLiters(int milkLiters) {
        this.milkLiters = milkLiters;
    }
}
