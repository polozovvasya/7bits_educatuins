package it.sevenbits.educations.reverse.interfaces;

/**
 * Interface for provide contract
 * Created by vpolozov on 03.04.16.
 */
public interface IObjArrayReverse {
    /**
     * reverse T array algoritm
     */
    <T> void reversObjArray(IObjArray<T> inputArray);
}