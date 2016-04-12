package it.sevenbits.educations.bootstrap;
import it.sevenbits.educations.reverse.ObjArray;
import it.sevenbits.educations.reverse.ObjArrayReverse;
import it.sevenbits.educations.reverse.ObjArrayUtils;

import java.util.Arrays;

/**
 * Bootstrap classes
 * Created by vpolozov on 21.03.16.
 */
public final class Bootstrap {
    /**
     *  Default constructor
     */
    private Bootstrap() {

    }

    /**
     * Main functions
     * @param arg - program input arguments
     */
    public static void main(final String[] arg) {
        System.out.println("Start application!");

        final Integer[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(Arrays.toString(myArray));
        System.out.println("\n");

        try {

            ObjArray arrIntegerObj = new ObjArray<Integer>(myArray);
            ObjArrayUtils objArrayUtils = new ObjArrayUtils();

            ObjArrayReverse reverseArrayObj = new ObjArrayReverse();
            reverseArrayObj.reversObjArray(arrIntegerObj);

            System.out.println(objArrayUtils.toStringObjArray(arrIntegerObj));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
