package it.sevenbits.educations.reverse;
/**
 * Reverse array Objects
 * Created by vpolozov on 21.03.16.
 */
public final class ObjArrayReverse implements IObjArrayReverse {

    /**
     *  Default constructor
     */
    public ObjArrayReverse() {

    }

    /**
     *  Reverse T
     */
    public <T> void reversObjArray(IObjArray<T> objArray) {
        T[] arrayReverse = objArray.getArrayObj();
        try {
            int countArr = arrayReverse.length;
            int m = countArr / 2;
            T value;

            for (int i = 0; i < m; i++) {
                value = arrayReverse[i];

                arrayReverse[i] = arrayReverse[countArr - 1 - i];
                arrayReverse[countArr - 1 - i] = value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        objArray.setArrayObj(arrayReverse);
    }
}
