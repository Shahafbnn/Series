import java.util.Random;

public class Diet {
    private String name;
    private String id;
    private Node<Weight> weights;
    private Date firstWeightDate;

    public Diet(String name, String id, Date weightDate, int weight) {
        this.name = name;
        this.id = id;
        this.weights = new Node<Weight>(new Weight(weightDate, weight));
        this.firstWeightDate = weightDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Node<Weight> getWeights() {
        return weights;
    }

    public void setWeights(Node<Weight> weights) {
        this.weights = weights;
    }

    public Date getFirstWeightDate() {
        return firstWeightDate;
    }

    public void setFirstWeightDate(Date firstWeightDate) {
        this.firstWeightDate = firstWeightDate;
    }

    @Override
    public String toString() {
        String str = "Diet{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", weights{";
        Node<Weight> ptr = this.weights;
        while(ptr.getNext() != null){
            str = str + "(" + ptr.getValue().getDate() + ", " + ptr.getValue().getWeight() + "), ";
            ptr = ptr.getNext();
        }
        str = str.substring(0, str.length()-2) + "}";
        str = str + ", firstWeightDate=" + firstWeightDate + '}';
        return str;

    }

    public void AddWeight(Date d, int w){
        Node<Weight> ptr = this.weights;
        while(ptr.getNext() != null){
            ptr = ptr.getNext();
        }
        ptr.setNext(new Node<Weight>(new Weight(d, w)));
    }

    /* outputs the last Node<Weight> (pointer)
    complexity:
    n = the number of objects in the weights Node.
    O(n)
     */
    public Node<Weight> lastWeights(){
        Node<Weight> ptr = this.weights;
        while(ptr.getNext() != null){
            ptr = ptr.getNext();
        }
        return ptr;
    }
    /* returns the days between the first weight and the last
    complexity:
    n = the number of objects in the weights Node.
    O(n)
     */
    public int dietDays(){
        Node<Weight> ptr = this.lastWeights();
        return this.firstWeightDate.numOfDays(ptr.getValue().getDate());
    }

    /* returns the weight between the first weight and the last
    complexity:
    n = the number of objects in the weights Node.
    O(n)
    * */
    public int kgLost(){
        Node<Weight> ptr = this.lastWeights();
        return this.weights.getValue().getWeight() - ptr.getValue().getWeight();
    }

    /* returns the average weight between the first weight and the last
    complexity:
    n = the number of objects in the weights Node.
    O(2n) O(n)
    * */
    public int kgPerDay(){
        return this.kgLost()/this.dietDays();
    }

    /*
    checks if Diet did not gain weight more than 2 times.
    complexity:
    n = the number of objects in the weights Node.
    O(n)
    * */
    public boolean isStable(){
        int changeUpNum = 0;
        Node<Weight> ptr = this.weights;
        while(ptr.getNext() != null){
            if(ptr.getValue().getWeight() - ptr.getNext().getValue().getWeight() < 0) changeUpNum = changeUpNum + 1;
            ptr = ptr.getNext();
        }
        return changeUpNum < 2;
    }


    /*
    returns the Date on which the highest weight loss was measured.
    complexity:
    n = the number of objects in the weights Node.
    O(n)
    * */
    public Date maxKgLoss(){
        Weight max = this.weights.getValue();
        int loss = 0;
        Node<Weight> ptr = this.weights;
        while(ptr.getNext() != null){
            if(ptr.getValue().weight - ptr.getNext().getValue().weight > loss) {
                max = ptr.getNext().getValue();
                loss = ptr.getValue().weight - ptr.getNext().getValue().weight;
            }
            ptr = ptr.getNext();
        }
        return max.getDate();

    }




}

