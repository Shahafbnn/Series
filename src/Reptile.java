public class Reptile extends AnimalWEggs implements IEggs{
    private double avgCTempForSurvival;
    public Reptile(String name, String familyName, String scientificName, short lifeLen, int children, double avgCTempForSurvival, short eggCount) {
        super(name, familyName, scientificName, lifeLen, children, eggCount);
        this.avgCTempForSurvival = avgCTempForSurvival;
    }

    @Override
    public void eggs() {
        System.out.println("Lays " + getEggCount() + " eggs");
    }

    public double getAvgCTempForSurvival() {
        return avgCTempForSurvival;
    }

    public void setAvgCTempForSurvival(double avgCTempForSurvival) {
        this.avgCTempForSurvival = avgCTempForSurvival;
    }

}
