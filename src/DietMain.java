import java.util.Random;

public class DietMain {

    public static Diet build1(){
        Date d1 = new Date(1,1,2020);
        Diet d = new Diet("rami", "1234", d1, 105);
        Random rnd = new Random();
        for(int i = 1; i < 13; i++){
            d.AddWeight(new Date(2 + rnd.nextInt(23), i, 2019), 105 + (i*2));
        }
        return d;
    }
    public static Diet build2(){return null;}
    public static Diet build3(){return null;}

    public static void main(String[] args) {
        Random rnd = new Random();
        Date da1 = new Date(7,1,2023);
        Diet d1 = new Diet("Bob", "1", da1, 105);
        for(int i = 0; i < 10; i ++){
            d1.AddWeight(new Date(7 + i,1,2023), 105 - i);
        }
        System.out.println("toString: " + d1);
        System.out.println("dietDays: " + d1.dietDays());
        System.out.println("kgLost: " + d1.kgLost());
        System.out.println("kgPerDay: " + d1.kgPerDay());
        System.out.println("isStable: " + d1.isStable());
        System.out.println("maxKgLoss: " + d1.maxKgLoss());


        Date da2 = new Date(6,5,2022);
        Diet d2 = new Diet("Bobert", "1", da2, 200);
        d2.AddWeight(new Date(1,6,2022), 150);
        d2.AddWeight(new Date(2,6,2022), 149);
        d2.AddWeight(new Date(20,6,2022), 155);
        d2.AddWeight(new Date(1,7,2022), 140);

        System.out.println("toString: " + d2);
        System.out.println("dietDays: " + d2.dietDays());
        System.out.println("kgLost: " + d2.kgLost());
        System.out.println("kgPerDay: " + d2.kgPerDay());
        System.out.println("isStable: " + d2.isStable());
        System.out.println("maxKgLoss: " + d2.maxKgLoss());

        Date da3 = new Date(17,9,2021);
        Diet d3 = new Diet("Bobe", "1", da3, 80);
        d3.AddWeight(new Date(1,6,2022), 90);
        d3.AddWeight(new Date(2,6,2022), 70);
        d3.AddWeight(new Date(20,6,2022), 60);
        d3.AddWeight(new Date(1,7,2022), 65);
        d3.AddWeight(new Date(10,7,2022), 70);
        d3.AddWeight(new Date(20,7,2022), 60);

        System.out.println("toString: " + d3);
        System.out.println("dietDays: " + d3.dietDays());
        System.out.println("kgLost: " + d3.kgLost());
        System.out.println("kgPerDay: " + d3.kgPerDay());
        System.out.println("isStable: " + d3.isStable());
        System.out.println("maxKgLoss: " + d3.maxKgLoss());

        Node<Diet> dieters = new Node<Diet>(d1);
        dieters.setNext(new Node<Diet>(d2));
        dieters.setNext(new Node<Diet>(d3));

        System.out.println(lostMost(new Node<Diet>(null)));
        System.out.println(lostMost(dieters));
    }

    /* input - a list of Diet objects, output - the .name of the Diet object who lost the most weight in percentages.
    complexity:
    n = the number of objects in the weights Node in the Diet
    k = the number of Diet objects in the Diet Node.
    O(n * k)
     */
    public static String lostMost(Node<Diet> dieters){
        if(dieters == null) return null;
        if(dieters.getValue() == null) return null;
        Node<Diet> ptr = dieters;
        Node<Diet> max = dieters;
        int w1;
        int w2;
        while(ptr != null){
            w1 = (ptr.getValue().getWeights().getValue().getWeight() - ptr.getValue().lastWeights().getValue().getWeight()) * 100;
            w2 = (max.getValue().getWeights().getValue().getWeight() - max.getValue().lastWeights().getValue().getWeight()) * 100;
            if(w1 > w2) max = ptr;
            ptr = ptr.getNext();
        }


        return max.getValue().getName();
    }
}
