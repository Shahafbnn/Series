import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random rand = new Random();
        int LEN = 10;
        Queue<Integer> q;

        for (int i = 0; i < 10; i++) {
            LEN = rand.nextInt(5);
            System.out.printf("Queue size: %d %n", LEN);
            q = new Queue<>();
            for (int j = 0; j < LEN; j++) {
                q.insert(rand.nextInt(90) + 10);
            }
            System.out.print(q + " ");
            if (!q.isEmpty()) {
                System.out.print("Queue head = " + q.remove() + " ");
                System.out.printf("Post-remove: %s %n", q);
            }

        }

        QueueMethods.BusRoute br = new QueueMethods.BusRoute(new QueueMethods.Station(0,2), new QueueMethods.Station(1,4));
        br.addStation(new QueueMethods.Station(5,4));
        br.addStation(new QueueMethods.Station(3, 1));
        br.addStation(new QueueMethods.Station(5, 0));

        System.out.println(br.routeLength());
    }
}
