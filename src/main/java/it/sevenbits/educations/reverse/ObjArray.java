package it.sevenbits.educations.reverse;

import it.sevenbits.educations.reverse.interfaces.IObjArray;

/**
 * Reverse array
 * Generic class
 * @param <T> type
 * Created by vpolozov on 21.03.16.
 */
public final class ObjArray<T> implements IObjArray<T> {
    /**
     * private T arrayObj
     */
    private T[] arrayObj;

    /**
     *  Default constructor
     *  @param valueArray T array
     */
    public ObjArray(final T[] valueArray) {
        arrayObj = valueArray;
    }

    /**
     * Getter
     * @return return T array
     */
    public T[] getArrayObj() {
        return arrayObj;
    }

    /**
     * Setter
     * @param valueArray T array
     */
    public void setArrayObj(final T[] valueArray) {
        arrayObj = valueArray;
    }
}
