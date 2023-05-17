import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unit4.collectionsLib.BinNode;

import static org.junit.jupiter.api.Assertions.*;

class Bagrut2Test {

    Object expected;
    Object actual;

    public Bagrut2.Queue<Bagrut2.Student> allStudents6EliQueue = Bagrut2.ArrayToQueue(new Bagrut2.Student[] {
            new Bagrut2.Student(0, Bagrut2.Student.Degree.MA, 86, false, 0), //not eligible
            new Bagrut2.Student(1, Bagrut2.Student.Degree.BA, 50, true, 0), //not eligible
            new Bagrut2.Student(2, Bagrut2.Student.Degree.BA, 50, true, 0), //not eligible
            new Bagrut2.Student(3, Bagrut2.Student.Degree.BA, 50, false, 0), //not eligible
            new Bagrut2.Student(4, Bagrut2.Student.Degree.BA, 91, false, 0), //not eligible
            new Bagrut2.Student(5, Bagrut2.Student.Degree.BA, 91, true, 0), //all eligibles
            new Bagrut2.Student(6, Bagrut2.Student.Degree.MA, 86, true, 0),
            new Bagrut2.Student(7, Bagrut2.Student.Degree.BA, 91, true, 0),
            new Bagrut2.Student(8, Bagrut2.Student.Degree.MA, 86, true, 0),
            new Bagrut2.Student(9, Bagrut2.Student.Degree.BA, 91, true, 0),
            new Bagrut2.Student(10, Bagrut2.Student.Degree.MA, 86, true, 0),
    });

    public Bagrut2.Queue<Bagrut2.Student> students4NotEliQueue = Bagrut2.ArrayToQueue(new Bagrut2.Student[] {
            new Bagrut2.Student(0, Bagrut2.Student.Degree.MA, 86, false, 0), //not eligible
            new Bagrut2.Student(1, Bagrut2.Student.Degree.BA, 50, true, 0), //not eligible
            new Bagrut2.Student(2, Bagrut2.Student.Degree.BA, 50, true, 0), //not eligible
            new Bagrut2.Student(3, Bagrut2.Student.Degree.BA, 50, false, 0), //not eligible
            new Bagrut2.Student(4, Bagrut2.Student.Degree.BA, 91, false, 0), //not eligible
            new Bagrut2.Student(7, Bagrut2.Student.Degree.BA, 91, true, 0), //all eligible
            new Bagrut2.Student(8, Bagrut2.Student.Degree.MA, 86, true, 0),
            new Bagrut2.Student(9, Bagrut2.Student.Degree.BA, 91, true, 0),
            new Bagrut2.Student(10, Bagrut2.Student.Degree.MA, 86, true, 0),
    });

    @Test
    void giveMoney() {
    }

    @Test
    void arrayToQueue() {
    }


    @Test
    void main() {
    }

    @Test
    void isStudentScholarable() {
        Bagrut2.Student notEli = new Bagrut2.Student(0, Bagrut2.Student.Degree.MA, 86, false, 0);
        Bagrut2.Student eli = new Bagrut2.Student(8, Bagrut2.Student.Degree.MA, 86, true, 0);
        actual = Bagrut2.isStudentScholarable(notEli);
        expected = false;
        assertEquals(expected, actual);
        actual = Bagrut2.isStudentScholarable(eli);
        expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void countEligibles() {
        actual = Bagrut2.countEligibles(allStudents6EliQueue);
        expected = 6;
        assertEquals(expected, actual);
        actual = Bagrut2.countEligibles(students4NotEliQueue);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void countNonCitizens() {
        actual = Bagrut2.countNonCitizens(allStudents6EliQueue);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void isJapaneseBinNode() {
        BinNode<Integer> root = new BinNode<Integer>(7);
        BinNode<Integer> l = new BinNode<Integer>(35);
        BinNode<Integer> ll = new BinNode<Integer>(70);
        BinNode<Integer> lr= new BinNode<Integer>(2);
        BinNode<Integer> lF = new BinNode<Integer>(ll, l.getValue(), lr);


        BinNode<Integer> r = new BinNode<Integer>(5);
        BinNode<Integer> rl = new BinNode<Integer>(45);
        BinNode<Integer> rr = new BinNode<Integer>(9);
        BinNode<Integer> rF = new BinNode<Integer>(rl, r.getValue(), rr);

        BinNode<Integer> rootF = new BinNode<Integer>(lF, root.getValue(), rF);

        actual = Bagrut2.isJapaneseBinNode(rootF);
        expected = true;
        assertEquals(expected, actual);
    }


}