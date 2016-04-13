package it.sevenbits.educations.reverse;

import it.sevenbits.educations.reverse.interfaces.IObjArray;
import it.sevenbits.educations.reverse.interfaces.IObjArrayReverse;

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

        int countArr = arrayReverse.length;
        int m = countArr / 2;
        T value;

        for (int i = 0; i < m; i++) {
            value = arrayReverse[i];

            arrayReverse[i] = arrayReverse[countArr - 1 - i];
            arrayReverse[countArr - 1 - i] = value;
        }

        objArray.setArrayObj(arrayReverse);
    }
}
