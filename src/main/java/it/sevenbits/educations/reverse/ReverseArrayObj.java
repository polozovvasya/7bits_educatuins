package it.sevenbits.educations.reverse;
/**
 * Reverse array Objects
 * Created by vpolozov on 21.03.16.
 */
public final class ReverseArrayObj implements IReverseArrayObj {

    /**
     *  Reverse T
     */
    public void reversArrayObj(IObjArray objArray) {
        Object[] arrayReverse = objArray.getArrayObj();
        try {
            int countArr = arrayReverse.length;
            int m = countArr / 2;
            Object value;

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

    /**
     *  Reverse T array to String
     */
    public String toStrinArrayObj(IObjArray objArray) {
        Object[] inputArray = objArray.getArrayObj();
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
