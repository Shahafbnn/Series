import java.sql.Statement;
import java.util.Collections;
import java.util.InputMismatchException;

public class QueueMethods {
    public static <T> int length(Queue<T> q) {
        Queue<T> temp = new Queue<T>();
        int counter = 0;
        while (!q.isEmpty()) {
            counter++;
            temp.insert(q.remove());
        }

        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
        return counter;
    }


    public static <T> int lenR(Queue<T> q) {
        return lenR(q, new Queue<T>());
    }

    public static <T> int lenR(Queue<T> queue, Queue<T> temp) {
        if (queue.isEmpty()) {
            while (!temp.isEmpty()) {
                queue.insert(temp.remove());
            }
            return 0;
        }
        temp.insert(queue.remove());
        return 1 + lenR(queue, temp);
    }

    public static <T> boolean isSorted(Queue<Integer> q) {
        Queue<Integer> temp = new Queue<Integer>();
        boolean sorted = true;
        boolean firstPair = false;
        int curr;
        int diff1 = 0;
        int diff2 = 0;

        while (sorted && !q.isEmpty()) {
            curr = q.head();
            temp.insert(q.remove());

            if (diff1 == 0) diff1 = curr - q.head();
            else if (diff2 == 0) diff2 = curr - q.head();
            else if (diff1 * diff2 < 0) sorted = false;
            else {
                diff1 = diff2;
                diff2 = 0;
            }
        }
        while (!q.isEmpty()) temp.insert(q.remove());
        while (!temp.isEmpty()) q.insert(temp.remove());
        return sorted;
    }

    public static boolean isIdentical(Queue<Integer> q1, Queue<Integer> q2) {
        int k = length(q1);
        if (k != length(q2)) return false;
        boolean identical = true;
        for (int i = 0; i < k; i++) {
            if (q1.head() != q2.head()) identical = false;
            q1.insert(q1.remove());
            q2.insert(q2.remove());
        }
        return identical;
    }

    public static boolean isSimilar(Queue<Integer> q1, Queue<Integer> q2) {
        int k = length(q1);
        if (k != length(q2)) return false;
        for (int i = 0; i < k; i++) {
            if (isIdentical(q1, q2)) return true;
            q1.insert(q1.remove());
        }
        return false;
    }

    public static class Station {
        private int x;
        private int y;

        public Station(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Station other) {
            return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }
    }

    public static class BusRoute {
        private Queue<Station> route;

        public BusRoute(Station s1, Station s2) {
            this.route = new Queue<Station>();
            this.route.insert(s1);
            this.route.insert(s2);

        }

        void addStation(Station newStation) {
            this.route.insert(newStation);
        }

        double routeLength() {
            Queue<Station> temp = new Queue<Station>();
            double sum = 0;
            Station s;
            while (this.route.isEmpty()) {
                s = route.remove();
                if (route.head() != null) sum += route.head().distance(s);
                temp.insert(s);
            }

            while (!temp.isEmpty()) route.insert(temp.remove());

            return sum;
        }


    }

    public static int toNumber(Queue<Integer> q) {
        int num = 0;
        int index = 0;
        while (!q.isEmpty()) {
            num += q.remove() * (int) Math.pow(10, index);
            index++;
        }
        return num;
    }

    public static int bigNumber(Node<Queue<Integer>> lst) {
        Node<Queue<Integer>> ptr = lst;
        int max = Integer.MAX_VALUE;
        while (ptr != null) {
            int num = toNumber(ptr.getValue());
            if (num > max) {
                max = num;
            }
            ptr = ptr.getNext();
        }
        return max;
    }

    public static int maxValue(Queue<Integer> q) {
        int max = Integer.MIN_VALUE;
        Queue<Integer> temp = new Queue<Integer>();
        int n;
        while (!q.isEmpty()) {
            n = q.remove();
            if (n > max) max = n;
            temp.insert(n);
        }
        if (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
        return max;
    }

    public static boolean search(Queue<Integer> q, int x) {
        Queue<Integer> temp = new Queue<Integer>();
        int s;
        boolean found = false;
        while (!q.isEmpty() || !found) {
            s = q.remove();
            temp.insert(s);
            if (s == x) found = true;
        }
        while (!temp.isEmpty()) q.insert(temp.remove());
        return found;
    }

    public static boolean searchRec(Queue<Integer> q, int x) {
        Queue<Integer> temp = new Queue<Integer>();
        boolean found = searchRec(q, x, temp);
        while(!temp.isEmpty()) q.insert(temp.remove());
        return found;
    }

    public static boolean searchRec(Queue<Integer> q, int x, Queue<Integer> temp) {
        if (q.isEmpty()) return false;
        int s = q.remove();
        temp.insert(s);
        if (s == x) return true;
        return searchRec(q, x, temp);

    }

    public static boolean specialPairs(Queue<Integer> q){
        Queue<Integer> temp = new Queue<Integer>();
        int s;
        boolean correct = true;
        while(!q.isEmpty()){
            s = q.remove();
            temp.insert(s);
            if(!(("" + s).charAt(("" + s).length()-1) == ("" + s).charAt(0))) correct = false;
        }
        while(!temp.isEmpty()) q.insert(temp.remove());

        return correct;
    }

    public static void sortQ(Queue<Integer> q) {
        Queue<Integer> sorted = new Queue<Integer>();
        while (!q.isEmpty()) {
            sorted.insert(extractMin(q));
        }
        while (!sorted.isEmpty()) {
            q.insert(sorted.remove());
        }
    }

    public static int extractMin(Queue<Integer> queue) {
        int max = Integer.MAX_VALUE;
        Queue<Integer> save = new Queue<Integer>();
        while (!queue.isEmpty()) {
            if (queue.head() < max) {
                max = queue.head();
            }
            save.insert(queue.remove());
        }
        boolean removed = false;
        while (!save.isEmpty()) {
            if (!removed) {
                if (save.head() == max) {
                    removed = true;
                    save.remove();
                }
            }
            queue.insert(save.remove());
        }
        return max;
    }

    public static void sort(Queue<Integer> q){ // not working, im duplicating the biggest till it's not.
        if(q.isEmpty()) return;
        Queue<Integer> temp = new Queue<Integer>();
        int removed = q.remove();
        while(!q.isEmpty()){
            if(q.head() > removed) {
                temp.insert(q.remove());
                temp.insert(removed);
            }
            else if(q.head() < removed){
                temp.insert(removed);
                temp.insert(q.remove());
            }
        }
        while(!temp.isEmpty()) q.insert(temp.remove());
    }




}