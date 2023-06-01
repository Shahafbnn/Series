import unit4.collectionsLib.BinNode;

import java.util.ArrayList;

public class Bagrut1 {
    public static class Queue<T> {
        private Node<T> head; //queue head
        private Node<T> tail; //queue tail
        public Queue(){
            this.head = null;
            this.tail = null;
        }
        public boolean isEmpty(){
            return (head == null);
        }

        // insert x to end of queue
        public void insert(T x){
            if(isEmpty()) {
                this.head = new Node<T>(x);
                this.tail = head;
            }
            else {
                this.tail.setNext(new Node<T>(x));
                this.tail = this.tail.getNext();
            }
        }

        //return the item at queue top
        public T head(){
            if(!this.isEmpty()) return this.head.getValue();
            else {
                System.out.println("head: The queue is empty, null returned");
                return null;
            }
        }

        //remove item at queue top
        public T remove(){
            if(!isEmpty()){
                Node<T> remove = head;
                head = head.getNext();
                remove.setNext(null);
                return remove.getValue();
            }
            System.out.println("head: The queue is empty, null returned");
            return null;
        }

        @Override
        public String toString() {
            if(isEmpty()) return "[]";
            String result = "[";
            Node<T> ptr = head;
            // Going over every value in the Queue.
            while(ptr != null){
                result += ptr.getValue() + ", ";
                ptr = ptr.getNext();
            }
            result = result.substring(0, result.length()-2)  + "]";
            return result;
        }

    }
    public static <E> Queue<E> ArrayToQueue(E[] arr){
        Queue<E> q = new Queue<E>();
        for(int i = 0; i < arr.length; i++){
            q.insert(arr[i]);
        }

        return q;
    }
    public class Opening{
        private enum Type {
            DOOR,
            WINDOW
        }
        private Type type;
        private boolean isOpen;

        public Opening(Type type, boolean isOpen){
            this.type = type;
            this.isOpen = isOpen;
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public boolean isOpen() {
            return isOpen;
        }

        public void setOpen(boolean open) {
            isOpen = open;
        }

    }
    public class Alarm{
        private ArrayList<Opening> alarmList;

        private enum Level {
            NORMAL, //this is lvl 0
            ROBBERY, //this is lvl 1
            EMERGENCY //this is lvl 2
        }
        private Level level;

        public Alarm(ArrayList<Opening> alarmList, Level level) {
            this.alarmList = alarmList;
            this.level = level;
        }
        //ב – מצב חירום מוגדר כאשר הדלת פתוחה וגם אחד החלונות לפחות. כתבו פעולה שבודקת אם זה המצב ומעדכת בהתאם את סוג ההתראה.

        public ArrayList<Opening> getAlarmList() {
            return alarmList;
        }

        public void setAlarmList(ArrayList<Opening> alarmList) {
            this.alarmList = alarmList;
        }

        public void CheckEmergencyAndUpdate(){
            int doors = 0;
            int windows = 0;
            int size = alarmList.size();
            for(int i = 0; i < size + 1; i++){
                if(alarmList.get(i).isOpen){
                    if (alarmList.get(i).getType().equals(Opening.Type.DOOR)) doors++;
                    else if(alarmList.get(i).getType().equals(Opening.Type.WINDOW)) windows++;
                }
            }
            if(doors>0 && windows>0) level = Level.EMERGENCY;
            else level = Level.NORMAL;
        }

        //ג – כתבו במחלקה פעולה  בשם: closeAll שסוגרת את כל הפתחים ומעדכנת שהמצב תקין.

        public String closeAll(){
            int size = alarmList.size();
            for(int i = 0; i < size + 1; i++){
                alarmList.get(i).setOpen(false);
            }
            return "Everything is normal";
        }

    }
    //שאלה 5:
    //סטודנטים הממתינים לקבלת מלגה מאוחסנים בתור, הכולל את המידע הבא: מספר סטודנט, תואר (BA או MA), ממוצע ציונים והאם אזרח?
    //זכאים למלגה אוטומטית הם אזרחי המדינה שממוצע ציונם מעל 90 ב – BA או מעל 85 ב – MA
    //א.  הגדירו מחלקה מתאימה . אין צורך לממש פעולות set , get .
    public static class Student{
        private int studentNum;
        public enum Degree{
            MA,BA
        }
        private Degree degree;
        private int avgGrades;
        private boolean isCitizen;
        private int money;

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public Student(int studentNum, Degree degree, int avgGrades, boolean isCitizen, int money) {
            this.studentNum = studentNum;
            this.degree = degree;
            this.avgGrades = avgGrades;
            this.isCitizen = isCitizen;
            this.money = money;
        }

        public int getStudentNum() {
            return studentNum;
        }

        public void setStudentNum(int studentNum) {
            this.studentNum = studentNum;
        }

        public Degree getDegree() {
            return degree;
        }

        public void setDegree(Degree degree) {
            this.degree = degree;
        }

        public int getAvgGrades() {
            return avgGrades;
        }

        public void setAvgGrades(int avgGrades) {
            this.avgGrades = avgGrades;
        }

        public boolean isCitizen() {
            return isCitizen;
        }

        public void setCitizen(boolean citizen) {
            isCitizen = citizen;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentNum=" + studentNum +
                    ", degree=" + degree +
                    ", avgGrades=" + avgGrades +
                    ", isCitizen=" + isCitizen +
                    ", money=" + money +
                    '}';
        }
    }
    //זכאים למלגה אוטומטית הם אזרחי המדינה שממוצע ציונם מעל 90 ב – BA או מעל 85 ב – MA
    public static class WaitingForScholarship{
        private Queue<Student> waitingStudents;


        public WaitingForScholarship(Queue<Student> waitingStudents) {
            this.waitingStudents = waitingStudents;
        }

        public void setWaitingStudents(Queue<Student> waitingStudents) {
            this.waitingStudents = waitingStudents;
        }

        public Queue<Student> getWaitingStudents() {
            return waitingStudents;
        }




        }//WaitingForScholarship bracket
    //שאלה 5:
    //סטודנטים הממתינים לקבלת מלגה מאוחסנים בתור, הכולל את המידע הבא: מספר סטודנט, תואר (BA או MA), ממוצע ציונים והאם אזרח?
    //זכאים למלגה אוטומטית הם אזרחי המדינה שממוצע ציונם מעל 90 ב – BA או מעל 85 ב – MA
    //א.  הגדירו מחלק``ה מתאימה . אין צורך לממש פעולות set , get .
    //ב.  כתבו פעולה המקבלת תור לא ריק של ממתינים למלגה  ומחזירה כמה זכאים אוטומטית למלגה. (אין לפגוע בתור המקורי)
    //ג.  כתבו  פעולה המקבלת סכום מלגה שאותו ניתן לחלק לסטודנטים באופן הבא:
    //- אם נמצאו 5 זכאים או יותר אוטומטית הסכום יחולק שווה בשווה ביניהם.
    //- אם נמצאו פחות, יחולק הסכום באופן הבא: 50% יחולק בין הזכאים אוטומטית ו 50% נוספים בין כל  אלה שאינם אזרחים. (הנח שיש לפחות אחד כזה בתור)
    //עבור כל אלה שיקבלו מלגה תודפס הודעה עם מס. הסטודנט והסכום שקיבל והוא ייצא מהתור.
    public static boolean isStudentScholarable(Student student){
        return (student.isCitizen && ((student.getDegree().equals(Student.Degree.BA)&& student.getAvgGrades() > 90)||(student.getDegree().equals(Student.Degree.MA)&& student.getAvgGrades() > 85)));
    }
    public static int countEligibles(Queue<Student> s){
        int eligibles = 0;
        Queue<Student> temp = new Queue<Student>();
        Student removed = null;
        while(!s.isEmpty()){
            removed = s.remove();
            eligibles = eligibles + (isStudentScholarable(removed)?1:0); // ah, I just love trinity operator (:
            temp.insert(removed);
        }
        while(!temp.isEmpty())s.insert(temp.remove());

        return eligibles;
    }
    public static int countNonCitizens(Queue<Student> s){
        int nons = 0;
        Queue<Student> temp = new Queue<Student>();
        Student removed = null;
        while(!s.isEmpty()){
            removed = s.remove();
            nons = nons + ((removed.isCitizen())?0:1); // ah, I just love trinity operator (:
            temp.insert(removed);
        }
        while(!temp.isEmpty())s.insert(temp.remove());

        return nons;
    }
    public static void giveMoney(int money, Queue<Student> waitingStudents){
        int eligibles = countEligibles(waitingStudents);
        Queue<Student> s = waitingStudents;
        boolean isSmaller = eligibles < 5;
        int devider = 1;
        if(isSmaller) devider = 2;

        int nons = 1;
        if(isSmaller) {nons = countNonCitizens(waitingStudents);}

        Queue<Student> temp = new Queue<Student>();
        Student removed = null;
        while(!s.isEmpty()){
            removed = s.remove();
            if (isStudentScholarable(removed)) {
                removed.setMoney(removed.getMoney() + money/devider/eligibles);
                System.out.printf("%d money given to student number %d\n", removed.getMoney(), removed.getStudentNum());
            } else if ((isSmaller) && !removed.isCitizen()) {
                removed.setMoney(removed.getMoney() + money/2/nons);
                System.out.printf("%d money given to student number %d\n", removed.getMoney(), removed.getStudentNum());

            }
            else temp.insert(removed);
        }
        while(!temp.isEmpty())s.insert(temp.remove());

    }

    //שאלה 6:
    //עץ יפני מוגדר כעץ עלה או עץ שבו תמיד מתקיים: הבן השמאלי מתחלק ללא שארית בבן הימני והתוצאה היא ערך האב. (אין לבדוק צמתים עם בן אחד).
    //ב.  כתבו פעולה שמקבלת שורש לעץ בינארי לא ריק ומחזירה אמת אם הוא יפני או לא.
    public static boolean isJapaneseBinNode(BinNode<Integer> t){
        if(t==null) return true;
        if(!t.hasLeft() && !t.hasRight()) return true;
        if(!t.hasLeft()||!t.hasRight()) return false;
        return ((t.getLeft().getValue() % t.getRight().getValue())==0) && isJapaneseBinNode(t.getLeft()) && isJapaneseBinNode(t.getRight());
    }

    public static void main(String[] args) {

        Queue<Student> allStudents6EliQueue = Bagrut1.ArrayToQueue(new Student[] {
                new Student(0, Student.Degree.MA, 86, false, 0), //not eligible
                new Student(1, Student.Degree.BA, 50, true, 0), //not eligible
                new Student(2, Student.Degree.BA, 50, true, 0), //not eligible
                new Student(3, Student.Degree.BA, 50, false, 0), //not eligible
                new Student(4, Student.Degree.BA, 91, false, 0), //not eligible
                new Student(5, Student.Degree.BA, 91, true, 0), //all eligibles
                new Student(6, Student.Degree.MA, 86, true, 0),
                new Student(7, Student.Degree.BA, 91, true, 0),
                new Student(8, Student.Degree.MA, 86, true, 0),
                new Student(9, Student.Degree.BA, 91, true, 0),
                new Student(10, Student.Degree.MA, 86, true, 0),
        });

        Queue<Student> students4NotEliQueue = Bagrut1.ArrayToQueue(new Student[] {
                new Student(0, Student.Degree.MA, 86, false, 0), //not eligible
                new Student(1, Student.Degree.BA, 50, true, 0), //not eligible
                new Student(2, Student.Degree.BA, 50, true, 0), //not eligible
                new Student(3, Student.Degree.BA, 50, false, 0), //not eligible
                new Student(4, Student.Degree.BA, 91, false, 0), //not eligible
                new Student(7, Student.Degree.BA, 91, true, 0), //all eligible
                new Student(8, Student.Degree.MA, 86, true, 0),
                new Student(9, Student.Degree.BA, 91, true, 0),
                new Student(10, Student.Degree.MA, 86, true, 0),
        });


//        System.out.println("allStudents6EliQueue ---------------BEFORE--------------: " + allStudents6EliQueue);
//        giveMoney(10000, allStudents6EliQueue);
//        System.out.println("allStudents6EliQueue ---------------AFTER--------------: " + allStudents6EliQueue);
//
//        System.out.println("students4NotEliQueue ---------------BEFORE--------------: " + students4NotEliQueue);
//        giveMoney(10000, students4NotEliQueue);
//        System.out.println("students4NotEliQueue ---------------AFTER--------------: " + students4NotEliQueue);





    }//main bracket
}//Bagrut1 bracket

