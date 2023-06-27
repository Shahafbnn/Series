public class Animal {
    protected String name;
    protected String familyName;
    protected String scientificName;
    protected short lifeLen;
    protected int children;

    public Animal(String name, String familyName, String scientificName, short lifeLen, int children){
        this.name = name;
        this.familyName = familyName;
        this.scientificName = scientificName;
        this.lifeLen = lifeLen;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public short getLifeLen() {
        return lifeLen;
    }

    public void setLifeLen(short lifeLen) {
        this.lifeLen = lifeLen;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
}
