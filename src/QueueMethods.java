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

    //Receives a queue of integer type q and an integer value.
    //checks whether there is a sequence of the inputted value in the queue. If so, returns true. Otherwise, returns false.
    public static boolean isSquence(Queue<Integer> q, int value){
        Queue<Integer> temp = new Queue<Integer>();
        int i;
        boolean found = false;
        while(!q.isEmpty() || !found){
            i = q.remove();
            temp.insert(i);
            if(q.head() == i) found = true;
        }
        while(!temp.isEmpty()) q.insert(temp.remove());
        return found;
    }


    //Receives a queue of integer type q and a value named value.
    //returns the maximum sequence of value in the queue. If there is no sequence, the value 0 will be returned.
    public static int countSequence(Queue<Integer> q, int value){
        Queue<Integer> temp = new Queue<Integer>();
        int i;
        int count = 0;
        while(!q.isEmpty()){
            i = q.remove();
            temp.insert(i);
            if(q.head() == i) count = count + 1;
        }
        while(!temp.isEmpty()) q.insert(temp.remove());
        return count;
    }

    //Receives a Queue<T>
    //returns a Queue<T> in reverse order.
    public static <T> Queue<T> reverseQ(Queue<T> q){
        if(q.isEmpty()) return q;
        T general = q.remove();
        Queue<T> temp = reverseQ(q);
        temp.insert(general);
        return temp;
    }

    //Receives two integer type queues sorted in ascending order, q1, q2.
    //returns a merged sorted queue that includes both queues.
    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2){
        Integer min1 = q1.head();
        Integer min2 = q2.head();
        Queue<Integer> temp1 = new Queue<Integer>();
        Queue<Integer> temp2 = new Queue<Integer>();
        Queue<Integer> merged = new Queue<Integer>();

        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.head() < q2.head()){
                merged.insert(q1.head());
                temp1.insert(q1.remove());
            }
            else if(q2.head() < q1.head()){
                merged.insert(q2.head());
                temp2.insert(q2.remove());
            }
            else{
                merged.insert(q1.head());
                temp1.insert(q1.remove());
                temp2.insert(q2.remove());
            }
        }
        if(q1.isEmpty() && !q2.isEmpty()){
            while(!q2.isEmpty()) {
                merged.insert(q2.head());
                temp2.insert(q2.remove());
            }
        }
        else if(!q1.isEmpty() && q2.isEmpty()){
            while(!q1.isEmpty()) {
                merged.insert(q1.head());
                temp2.insert(q1.remove());
            }
        }
        while(!temp1.isEmpty()) q1.insert(temp1.remove());
        while(!temp2.isEmpty()) q2.insert(temp2.remove());
        return merged;
    }
    public static Queue<Integer> mergeFAILED(Queue<Integer> q1, Queue<Integer> q2){
        Queue<Integer> merged = new Queue<Integer>();
        if(q1.head() < q2.head()){
            merged.insert(q1.head());
            merged.insert(q2.head());
            q1.insert(q1.remove());
            q2.insert(q2.remove());
        }
        else if(q2.head() < q1.head()){
            merged.insert(q2.head());
            merged.insert(q1.head());
            q2.insert(q2.remove());
            q1.insert(q1.remove());
        }
        else {
            merged.insert(q1.head());
            q2.insert(q2.remove());
            q1.insert(q1.remove());
        }
        while(Math.min(q1.head(), q2.head()) != merged.head()) {
            if(q1.head() < q2.head()){
                merged.insert(q1.head());
                merged.insert(q2.head());
                q1.insert(q1.remove());
                q2.insert(q2.remove());
            }
            else if(q2.head() < q1.head()){
                merged.insert(q2.head());
                merged.insert(q1.head());
                q2.insert(q2.remove());
                q1.insert(q1.remove());
            }
            else {
                merged.insert(q1.head());
                q2.insert(q2.remove());
                q1.insert(q1.remove());
            }
        }
        return merged;
    }


    //Receives a non-empty queue of integers (without zero).
    //moves to the end of the queue the first sequence of positive numbers that appears in the queue.
    public static void movePosFAILED(Queue<Integer> q){
        Queue<Integer> temp = new Queue<Integer>();
        Integer n1 = null;
        Integer n2 = null;
        boolean found = false;
        int num;
        while(!q.isEmpty()){
            num = q.remove();
            if(num>0 && q.head()>0 && !found){
                n1 = num;
                n2 = q.remove();
                found = true;
            }
            else temp.insert(num);
        }
        while(!temp.isEmpty()) q.insert(temp.remove());
        if(n1 != null) {
            q.insert(n1);
            q.insert(n2);
        }
    }

    public static void movePos(Queue<Integer> q)
    {
        movePos(q, false);
    }

    private static void movePos(Queue<Integer> q, boolean found)
    {
        if (!found || q.head() > 0)
        {
            q.insert(q.head());
            if(q.remove() > 0 && q.head() > 0)
                movePos(q, true);
            else movePos(q, found);
        }
    }

    public static class Series
    {
        private int a0;	// האיבר הראשון בסדרה
        private int d; 	// הפרש הסדרה
        private int size; // מספר האיברים בסדרה

        public Series(int a0, int d, int size)
        {
            this.a0 = a0;
            this.d = d;
            this.size = size;
        }

        public int GetItemN(int n)
        {
            return this.a0 + (n - 1) * this.d;
        }

        @Override
        public String toString() {
            return "a0=" + a0 + ", d=" + d + ", size=" + size;
        }
    }

    //Receives a queue q of integers, which are members of a series.
    //returns a series object representing the series of numbers in the queue.
    public static Series createSeries(Queue<Integer> q){
        int a0 = q.head();
        Integer a1 = null;
        int size = 0;
        while(!q.isEmpty()){
            size = size + 1;
            q.remove();
            if(a1 == null) a1 = q.head();
        }
        return new Series(a0, a1-a0, size);
    }



    public class CustomerService{
        public class Client
        {
            private String name;   // שם הלקוח
            private boolean vip;  	// האם הלקוח מועדף

            public Client(String name, boolean vip)
            {
                this.name = name;
                this.vip = vip;
            }
            public boolean GetVIP()
            {
                return this.vip;
            }
        }
        private Queue<Client> clients; // a queue for regular clients.
        private Queue<Client> vipClients; // a queue for vip clients.


        private int TIME = 7; // the delivery time for regular customers.
        private int VIPTIME = 2; // the delivery time for vip customers.

        public CustomerService(Queue<Client> clients, Queue<Client> VipClients) {
            this.clients = clients;
        }

        public CustomerService() {
            this.clients = new Queue<Client>();
            this.vipClients = new Queue<Client>();
        }

        //Receives a new client c and adds it to the system, in accordance with the rules for handling a new customer in the company.
        public void addCustomer(Client c){
            if(c.GetVIP()) vipClients.insert(c);
            else clients.insert(c);
        }

        //Returns the next customer to the system for handling, in accordance with the company's customer handling rules.
        public Client hundleCustomer(){
            if(!vipClients.isEmpty()) return vipClients.remove();
            if(!clients.isEmpty()) return clients.remove();
            return null;
        }

        //Returns true if all packages for shipping have been provided to customers.
        //Otherwise, returns false.
        public boolean isAvailable(){
            return (vipClients.isEmpty() && clients.isEmpty());
        }


    }








}