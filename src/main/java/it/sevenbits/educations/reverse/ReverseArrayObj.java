package it.sevenbits.educations.reverse;
/**
 * Reverse array Objects
 * Created by vpolozov on 21.03.16.
 */
public final class ReverseArrayObj implements IReverseArrayObj {

    /**
     *  Reverse T
     */
    public <T> T[] reversArrayObj(T[] arrayReverse) {
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
        return arrayReverse;
    }

    /**
     *  Reverse T array to String
     */
    public <T> String toStrinArrayObj(T[] inputArray) {
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
