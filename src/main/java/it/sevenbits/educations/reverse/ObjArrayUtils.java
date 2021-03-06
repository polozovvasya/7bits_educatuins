package it.sevenbits.educations.reverse;

import it.sevenbits.educations.reverse.interfaces.IObjArray;
import it.sevenbits.educations.reverse.interfaces.IObjArrayUtils;

/**
 * Class for ObjArray Utils method
 * Created by iqtekpva on 12.04.16.
 */
public class ObjArrayUtils implements IObjArrayUtils {

    /**
     *  T array to String
     */
    public <T> String toStringObjArray(IObjArray<T> objArray) {
        T[] inputArray = objArray.getArrayObj();
        String strResult;
        strResult = "";
        for (int i = 0; i < inputArray.length; i++) {
            strResult += inputArray[i];
            if (i < inputArray.length - 1) {
                strResult += ", ";            }
        }
        return strResult;
    }
}
