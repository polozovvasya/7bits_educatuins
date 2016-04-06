package it.sevenbits.educations.reverse;

/**
 * Interface for provide contract
 * @param <T> generic type
 * Created by vpolozov on 03.04.16.
 */
interface IObjArray<T> {
    /**
     * Getter
     * @return return  T array
     */

    T[] getArrayObj();

    /**
     * Setter
     * @param valueArray T array
     */
    void setArrayObj(final T[] valueArray);
}
