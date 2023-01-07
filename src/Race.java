class Competitor {
    private int minutes;
    private int seconds;
    private String name;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime(){
        return this.seconds + minutes * 60;
    }

}

public class Race {
    private Node<Competitor> comps;

    public void add(Competitor x){
        comps = new Node<Competitor>(null, comps);//dummy
        Node<Competitor> prev = comps;
        while(prev.getNext() != null && x.getTime() > prev.getNext().getValue().getTime()){
            prev = prev.getNext();
        }
        Node<Competitor> p = new Node<Competitor>(x,prev.getNext());
        p.setNext(new Node<Competitor>(x));
        prev.setNext(p);
        comps = comps.getNext(); //remove dummy
    }

    public String rank(int x){
        Node<Competitor> ptr = comps;
        for(int i = 0; i < x-1; i++) ptr = ptr.getNext();
        return ptr.getValue().getName();

    }
}
