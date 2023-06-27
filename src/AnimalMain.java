public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new BasicMamal("dog", "wolves", "Dogius Maximus", (short) 10, 3, 30, 1);
        Animal animal2 = new Animal("Anim", "Aminal", "mamnialk", (short)5, 5);
        IMilk milk1 = (IMilk) animal1;
        //IMilk milk2 = (IMilk) animal2;


        System.out.println(animal1 instanceof BasicMamal);
        System.out.println(animal1 instanceof IMilk);
        IEggs[] eggsArr = new AnimalWEggs[3];
    }
}
