public class AnimalWEggs extends Animal implements IEggs{
    private int eggCount;
    public AnimalWEggs(String name, String familyName, String scientificName, short lifeLen, int children, int eggCount) {
        super(name, familyName, scientificName, lifeLen, children);
    }

    @Override
    public void eggs() {
        System.out.println("Lays " + eggCount + " eggs");
    }

    public int getEggCount() {
        return eggCount;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }
}
