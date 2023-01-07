public class CubeMethods {


    public static boolean insertCubeToPos(CubeNode list, Cube c, int pos){
        CubeNode ptr = list;
        int i = 1;
        while(ptr!=null && i < pos-1){
            ptr = ptr.getNext();
            i++;
        }
        if(ptr!=null){
            CubeNode p = new CubeNode(c);
            p.setNext(ptr.getNext());
            ptr.setNext(p);
            return true;
        }
        return false;
    }

    public static Cube deleteCubeToPos(CubeNode list, Cube c, int pos){
        CubeNode ptr = list;
        int i = 1;
        while(ptr!=null && i < pos-1){
            ptr = ptr.getNext();
            i++;
        }
        if(ptr!=null){
            CubeNode del = ptr.getNext();
            ptr.setNext(del.getNext());
            del.setNext(null);
            return del.getValue();
        }
        return null;
    }


}
