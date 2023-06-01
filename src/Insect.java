public class Insect extends AnimalWEggs{
    private boolean hasBones;
    public Insect(String name, String familyName, String scientificName, short lifeLen, int children, int eggCount, boolean hasBones) {
        super(name, familyName, scientificName, lifeLen, children, eggCount);
        this.hasBones = hasBones;
    }
}
